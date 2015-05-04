package com.emanuellangit.dissertation;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emanuellangit.dissertation.model.SequenceInformation;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/")
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		
		/* backing bean binded to the model, specified with
		 * modelAttribute= in the view
		 */
		SequenceInformation sequenceInformation = new SequenceInformation();
		model.addAttribute("sequenceInformation", sequenceInformation);
		
		return "home"; // filename of view (.jsp file) to be displayed
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitSequenceInformation(@ModelAttribute("SpringMvcImplementation") SequenceInformation sequenceInformation, ModelMap model) {
		
		model.addAttribute("nucleotideSequence", sequenceInformation.getNucleotideSequence());
		model.addAttribute("filename", sequenceInformation.getFilename());
		model.addAttribute("blastdb", sequenceInformation.getBlastDb());
		model.addAttribute("eValue", sequenceInformation.geteValue());
		model.addAttribute("emailAddress", sequenceInformation.getEmailAddress());
		return "sequenceSubmittedPage";
	}
	
}
