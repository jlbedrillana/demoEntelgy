package com.entelgy.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entelgy.demo.model.Reestructura;
import com.entelgy.demo.model.Respuesta;
@Service
public class ReestructuraServiceImpl implements ReestructuraService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Reestructura> retornoReestructura(String ruta) {
				
		try {
			
			HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<Respuesta> result = clienteRest.exchange(ruta, HttpMethod.GET,entity,Respuesta.class);

			Respuesta resp = result.getBody();
			
			List<Reestructura> data = resp.getData().stream().map(x -> {
				return new Reestructura(x.getId(), x.getLast_name(), x.getEmail());
			}).collect(Collectors.toList());
			
			return data;
			
		} catch (RuntimeException e) {
			e.printStackTrace();			
			return null;
		} catch (Exception e) {
			e.printStackTrace();			
			return null;
		}

	}

}
