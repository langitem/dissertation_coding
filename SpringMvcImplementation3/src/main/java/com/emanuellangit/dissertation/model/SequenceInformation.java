package com.emanuellangit.dissertation.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class SequenceInformation {
	private String nucleotideSequence;
	private String filename;
	private String blastDb;
	
	@NotEmpty(message = "Please enter your email address")
	@Email(message = "Please enter a valid email address")
	private String emailAddress;
	private Float eValue;
	
	public String getNucleotideSequence() {
		return nucleotideSequence;
	}
	public void setNucleotideSequence(String nucleotideSequence) {
		this.nucleotideSequence = nucleotideSequence;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getBlastDb() {
		return blastDb;
	}
	public void setBlastDb(String blastDb) {
		this.blastDb = blastDb;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Float geteValue() {
		return eValue;
	}
	public void seteValue(Float eValue) {
		this.eValue = eValue;
	}

}
