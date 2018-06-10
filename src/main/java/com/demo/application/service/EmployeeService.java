package com.demo.application.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.application.dao.EmployeeDao;
import com.demo.application.dto.EmployeeDTO;
import com.demo.application.model.EmployeeBean;

/**
 * Service layer implementation of the Employee Data Access svc
 * 
 * @author Abhi
 *
 */
@Service
public class EmployeeService {

	private static Logger logger = Logger.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeDao dao;

	/**
	 * Service layer method for getting the data from database and convert the
	 * data objects from entity classes to data transfer objects
	 * 
	 * @return result: {@link List}
	 */
	public List<EmployeeDTO> getAllEmployees() {
		List<EmployeeDTO> result = new ArrayList<EmployeeDTO>();
		Iterable<EmployeeBean> list = dao.findAll();
		logger.debug("Getting data from db: [" + list.toString() + "]");
		list.forEach(x -> {
			EmployeeDTO emp = new EmployeeDTO();
			BeanUtils.copyProperties(x, emp);
			result.add(emp);
		});
		logger.debug("Getting result: [" + result.toString() + "]");
		return result;
	}

}
