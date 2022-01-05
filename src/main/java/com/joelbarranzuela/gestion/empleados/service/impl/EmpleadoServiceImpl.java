package com.joelbarranzuela.gestion.empleados.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joelbarranzuela.gestion.empleados.domain.Empleado;
import com.joelbarranzuela.gestion.empleados.exceptions.ResourceNotFoundException;
import com.joelbarranzuela.gestion.empleados.repository.IEmpleadoRepo;
import com.joelbarranzuela.gestion.empleados.service.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
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
	public Empleado editarEmpleado(Empleado emp) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado buscarEmpleado(Long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarEmpleado(Long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
		

}
