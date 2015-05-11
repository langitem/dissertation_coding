package com.emanuellangit.dissertation;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.beans.factory.annotation.Autowired;


import com.emanuellangit.dissertation.model.SequenceInformation;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@Autowired
	private JavaMailSender mailSender;
	
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
	public String submitSequenceInformation(@Valid SequenceInformation sequenceInformation, BindingResult result, ModelMap model) {
		
		if (result.hasErrors()) {
			return "home";
		}
		
		model.addAttribute("nucleotideSequence", sequenceInformation.getNucleotideSequence());
		model.addAttribute("filename", sequenceInformation.getFilename());
		model.addAttribute("blastdb", sequenceInformation.getBlastDb());
		model.addAttribute("eValue", sequenceInformation.geteValue());
		model.addAttribute("emailAddress", sequenceInformation.getEmailAddress());
		
		String toAddress = sequenceInformation.getEmailAddress();
		// creates a simple e-mail object
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(toAddress);
		email.setSubject("BLAST job submission confirmation");
		email.setText("Your BLAST job request has been received. You will receive the results when the BLAST job has completed.");
		
		mailSender.send(email);

		return "sequenceSubmittedPage";
	}
	
}
