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
	
	<form method="post" action="http://localhost:8080">
	
		<p>Enter your nucleotide sequence(s) in the box below in FASTA format:</p>
		<textarea name="sequence" cols="50" rows="10"></textarea>
		<br><br>
		
		<label for="uploadLabel">Or upload file:</label>
		<input name="fastaFile" type="file">
		
		<br><br>
		
		<label for="dbSelection">Select nucleotide database: </label>
		<select id="dbSelection" name="dbSelection"><option value="humanGenome" selected="selected">Human Genome</option><option value="nmHuman">Human RefSeq NM</option><option value="nrHuman">Human RefSeq NR</option></select>
		
		<br><br>
		
		<label for="expectValue">Expect threshold:</label>
		<input name="expectValue" type="text" value="10.00" id="expectValue">
		
		<br><br>
		
		<label for="email">Enter your email address: </label>
		<input name="email" type="email" id="email">
		
		<br><br>
		
		<input type="submit">
	
	</form>
</body>
</html>