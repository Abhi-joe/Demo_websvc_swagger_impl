package com.demo.application.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.application.model.EmployeeBean;

/**
 * The interface of the DAO layer for the employee access svc
 * @author Abhi
 *
 */
public interface EmployeeDao extends CrudRepository<EmployeeBean, Integer> {

}
