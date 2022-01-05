package com.joelbarranzuela.gestion.empleados.service;

import java.util.List;

import com.joelbarranzuela.gestion.empleados.domain.Empleado;


public interface IEmpleadoService {
	
	List<Empleado> listarEmpleados(); //listar empleado
	Empleado crearEmpleado(Empleado emp);
	Empleado editarEmpleado(Long id, Empleado emp)  ;
	Empleado buscarEmpleado(Long id)  ;
	void eliminarEmpleado(Long id)  ;
	

}
