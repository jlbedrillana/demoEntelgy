package com.entelgy.demo.Controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.entelgy.demo.model.Reestructura;

class ReestructuraControllerTest {

	@Autowired
	private ReestructuraController controller;
	
	@Test
	void test() {
		
		List<Reestructura> data  = new ArrayList<Reestructura>();
		data = controller.obtenerReestructura();
		
		assertEquals(6, data.size());
	}

}
