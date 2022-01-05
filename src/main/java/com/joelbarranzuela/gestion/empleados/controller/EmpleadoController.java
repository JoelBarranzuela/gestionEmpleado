package com.joelbarranzuela.gestion.empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/empleados/{id}")
	public ResponseEntity<Empleado> obtenerEmpleado(@PathVariable Long id){
		
		Empleado empleado = service.buscarEmpleado(id);
		
		
		return ResponseEntity.ok(empleado);
		
	}
	
	@PutMapping("/empleados/{id}")
	public ResponseEntity<Empleado> updateEmpleado(@PathVariable Long id, @RequestBody Empleado emp){
		
		
		
		Empleado empleadoActualizado = service.editarEmpleado(id, emp);
		
		return ResponseEntity.ok(empleadoActualizado);
		
	}
	
	
	@DeleteMapping("/empleados/{id}")
	public ResponseEntity<Empleado> deleteEmpleado(@PathVariable Long id){
		
		service.eliminarEmpleado(id);
	 
		return  ResponseEntity.ok().build();
		
	}

}
