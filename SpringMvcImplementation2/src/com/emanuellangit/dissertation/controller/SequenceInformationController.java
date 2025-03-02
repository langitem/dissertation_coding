package com.emanuellangit.dissertation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emanuellangit.dissertation.model.SequenceInformation;

@Controller
@RequestMapping(value="/")
public class SequenceInformationController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewSequenceInputFormPage(Model model) {
		model.addAttribute("sequenceInformation", new SequenceInformation());
		return "sequenceInputFormPage";
		
	}

}
