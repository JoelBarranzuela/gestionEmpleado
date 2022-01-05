package com.joelbarranzuela.gestion.empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joelbarranzuela.gestion.empleados.domain.Empleado;
import com.joelbarranzuela.gestion.empleados.service.IEmpleadoService;

@RestController
@RequestMapping("/api/crud")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService service;
	
	@GetMapping("/empleados")
	public List<Empleado> listarTodosEmpleados()
	{
		return service.listarEmpleados();	
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado emp) {
		return service.crearEmpleado(emp);
	}

}
