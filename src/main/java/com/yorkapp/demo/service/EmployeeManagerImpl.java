package com.yorkapp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yorkapp.demo.dao.EmployeeDAO;
import com.yorkapp.demo.dao.EmployeeDAOImpl;
import com.yorkapp.demo.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
	@Autowired
	EmployeeDAO dao;
	//EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees() 
	{
		return dao.getAllEmployees();
	}
	
}
