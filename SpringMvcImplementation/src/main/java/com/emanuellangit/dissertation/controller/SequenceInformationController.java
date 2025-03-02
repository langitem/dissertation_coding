package com.emanuellangit.dissertation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emanuellangit.dissertation.model.SequenceInformation;

@Controller
@RequestMapping(value="/") // partial address (this comes after the home URL)
public class SequenceInformationController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewSequenceInputFormPage(Model model) {
		model.addAttribute("sequenceInformation", new SequenceInformation());
		// viewSequenceInputFormPage() method uses a model object to expose
		// a new SequenceInformation to the view template. The SequenceInformation
		// object contains attributes that are correspond to fields in the view
		
		return "sequenceInputFormPage"; // filename of view (.jsp file) to be displayed
	}
	
	@RequestMapping(method=RequestMethod.POST)
	//public String submitSequenceInformation(@ModelAttribute SequenceInformation sequenceInformation, Model model ) {
	public String submitSequenceInformation(@ModelAttribute("SpringMvcImplementation") SequenceInformation sequenceInformation, ModelMap model ) {
		// This method receives the SequenceInformation object that was populated
		// by the form
		
		//model.addAttribute("sequenceInformation", sequenceInformation);
		model.addAttribute("nucleotideSequence", sequenceInformation.getNucleotideSequence());
		model.addAttribute("filename", sequenceInformation.getFilename());
		model.addAttribute("blastDb", sequenceInformation.getBlastDb());
		model.addAttribute("eValue", sequenceInformation.geteValue());
		model.addAttribute("emailAddress", sequenceInformation.getEmailAddress());
		
		return "sequenceSubmittedPage"; // filename of view (.jsp file) to be displayed
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

}
