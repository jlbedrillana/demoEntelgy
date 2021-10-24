/*package com.entelgy.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.entelgy.demo.Controllers.ReestructuraController;
import com.entelgy.demo.model.Reestructura;

@SpringBootTest
class DemoEntelgyApplicationTests {

	@Autowired
	private ReestructuraController controller;
	
	@Test
	void contextLoads() {
		
		List<Reestructura> data  = new ArrayList<Reestructura>();
		data = controller.obtenerReestructura();
		System.out.println("tamanio :"+data.size());
		
		assertEquals(6, data.size());
	}

}*/
