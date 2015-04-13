<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sequence submitted</title>
</head>
<body>
	<p>Your job has been submitted! A confirmation email will be sent to you.</p>
	
	<p>nucleotide sequence</p>
	<p>${nucleotideSequence}</p>
	
	<p>filename:</p>
	<p>${filename}</p>
	
	<p>blastdb:</p>
	<p>${blastDb}</p>
	
	<p>E value:</p>
	<p>${eValue}</p>
	
	<p>Email Address:</p>
	<p>${emailAddress}</p>
	
</body>
</html>