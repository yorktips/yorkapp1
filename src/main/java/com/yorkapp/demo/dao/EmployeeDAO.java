package com.yorkapp.demo.dao;

import java.util.List;

import com.yorkapp.demo.model.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}