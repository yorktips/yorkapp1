package com.yorkapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yorkapp.demo.service.EmployeeManager;

@Controller
@RequestMapping("/watson")
public class MyWatsonController {
	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/personalityInsights", method = RequestMethod.GET)
	public String showPersonlityInsightsInput(Model model)
	{
		model.addAttribute("title_message", "Personality Insightsmanager");
		return "userInputPersonlityInsights";
	}
}
