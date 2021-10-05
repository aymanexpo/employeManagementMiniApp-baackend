package com.talibi.emsAng.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talibi.emsAng.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
