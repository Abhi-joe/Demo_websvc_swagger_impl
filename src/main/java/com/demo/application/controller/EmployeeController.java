package com.demo.application.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.application.dto.EmployeeDTO;
import com.demo.application.service.EmployeeService;

/**
 * Controller to call the service layer methods to get the response from the
 * service
 * 
 * @author Abhi
 *
 */
@RestController
public class EmployeeController {

	private static Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService service;

	/**
	 * Controller method to call the service layer method for getting all the
	 * employees
	 * 
	 * @return {@link ResponseEntity<List>}
	 */
	@RequestMapping(value = "demo/web/getAllEmployees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
		List<EmployeeDTO> dtoList = service.getAllEmployees();
		logger.debug("Getting the response : [" + dtoList + "]");
		return new ResponseEntity<List<EmployeeDTO>>(dtoList, HttpStatus.OK);
	}
}
