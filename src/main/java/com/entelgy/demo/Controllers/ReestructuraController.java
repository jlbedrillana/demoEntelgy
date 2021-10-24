package com.entelgy.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.demo.model.Reestructura;
import com.entelgy.demo.service.ReestructuraService;

@RestController
@RequestMapping("/api/reestructura")
public class ReestructuraController {

	@Autowired
	private ReestructuraService service;
	
	@Value("${ruta.consulta}")
	private String ruta;

	@GetMapping("/obtener")
	public List<Reestructura> obtenerReestructura() {
		
		List<Reestructura> data = service.retornoReestructura(ruta);
		
		return data;
	}
	
}
