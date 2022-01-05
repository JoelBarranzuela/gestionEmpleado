package com.joelbarranzuela.gestion.empleados.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.joelbarranzuela.gestion.empleados.domain.Empleado;
import com.joelbarranzuela.gestion.empleados.exceptions.ResourceNotFoundException;
import com.joelbarranzuela.gestion.empleados.repository.IEmpleadoRepo;
import com.joelbarranzuela.gestion.empleados.service.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo repo;

	@Override
	public List<Empleado> listarEmpleados() throws ResourceNotFoundException {

		return repo.findAll();
	}

	@Override
	public Empleado crearEmpleado(Empleado emp) {
		return repo.save(emp);
	}

	@Override
	public Empleado editarEmpleado(Long id, Empleado emp) {

		Empleado empleado = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID " + id));
	

		empleado.setNombre(emp.getNombre());
		empleado.setApellido(emp.getApellido());
		empleado.setEmail(emp.getEmail());

		return repo.save(empleado);
	}

	@Override
	public Empleado buscarEmpleado(Long id) {
		Empleado empleado = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID " + id));
		return empleado;
	}

	@Override
	public void eliminarEmpleado(Long id) throws ResourceNotFoundException {
		Empleado empleado = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID " + id));
		
		repo.delete(empleado);
	}

}
