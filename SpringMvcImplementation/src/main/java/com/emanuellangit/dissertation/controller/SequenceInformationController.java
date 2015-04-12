package com.emanuellangit.dissertation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emanuellangit.dissertation.model.SequenceInformation;

@Controller
@RequestMapping(value="/sequenceInput")
public class SequenceInformationController {
	
	@Autowired
	@Qualifier("sequenceValidator")
	private Validator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewSequenceInputFormPage(Model model) {
		//model.addAttribute("sequenceInformation", new SequenceInformation());
		
		model.addAttribute("sequenceInformation", new SequenceInformation());
		return "sequenceInputFormPage";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitSequenceInformation(Model model, @Validated SequenceInformation sequenceInformation, BindingResult result ) {
		
		String returnValue = "sequenceSubmittedPage";
		
		if (result.hasErrors()) {
			returnValue = "sequenceInputFormPage";
		} else {
			model.addAttribute("sequenceInformation", sequenceInformation);
		}
		
		return returnValue;
	}
	
	/*
	private void initializeModelList(Model model) {
		List<String> blastDbList = new ArrayList<String>();
		blastDbList.add("Human Genome");
		blastDbList.add("Human RefSeq NM");
		blastDbList.add("Human RefSeq NR");
		model.addAttribute("blastDb", blastDbList);
		
	}
	*/

} // End of SequenceInformationController class
