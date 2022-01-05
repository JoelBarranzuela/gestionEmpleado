package com.joelbarranzuela.gestion.empleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joelbarranzuela.gestion.empleados.domain.Empleado;

@Repository
public interface IEmpleadoRepo extends JpaRepository<Empleado, Long>{
	
	
}
