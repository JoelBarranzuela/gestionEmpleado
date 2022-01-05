package com.joelbarranzuela.gestion.empleados.service;

import java.util.List;

import com.joelbarranzuela.gestion.empleados.domain.Empleado;
import com.joelbarranzuela.gestion.empleados.exceptions.ResourceNotFoundException;

public interface IEmpleadoService {
	
	List<Empleado> listarEmpleados() throws ResourceNotFoundException; //listar empleado
	Empleado crearEmpleado(Empleado emp);
	Empleado editarEmpleado(Empleado emp) throws ResourceNotFoundException;
	Empleado buscarEmpleado(Long id) throws ResourceNotFoundException;
	void eliminarEmpleado(Long id) throws ResourceNotFoundException;
	

}
