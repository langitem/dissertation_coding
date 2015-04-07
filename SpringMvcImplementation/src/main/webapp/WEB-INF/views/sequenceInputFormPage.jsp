<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nucleotide BLAST</title>
</head>
<body>
	<h1 align="center">Nucleotide BLAST</h1>
	<form:form method="POST" modelAttribute="sequenceInformation">
		<p>Enter your nucleotide sequence(s) in the box below in FASTA format:</p>
		<form:textarea path="nucleotideSequence" rows="10" cols="50" />
		<br><br>
		
		Or upload file:
		<input type="file" name="filename">
		<br><br>
		
		<input type="submit" value="Submit">
		
	</form:form>
</body>
</html>