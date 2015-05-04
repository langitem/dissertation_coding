<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Nucleotide BLAST</title>
</head>
<body>
	<h1 align="center">Nucleotide BLAST</h1>
	<form:form method="POST" modelAttribute="sequenceInformation">
		<p>Enter your nucleotide sequence(s) in the box below in FASTA format:</p>
		<form:textarea path="nucleotideSequence" rows="10" cols="50" />
		<br>
		
		Or upload file:
		<input type="file" name="filename">
		<br><br>
		
		Select nucleotide database:
		<form:select path="blastDb">
			<form:option value="Human Genome"/>
			<form:option value="Human RefSeq NM"/>
			<form:option value="Human RefSeq NR"/>
		</form:select>
		<br><br>
		
		Expect threshold:
		<form:input path="eValue"/>
		<br><br>
		
		Enter your email address:
		<form:input path="emailAddress"/>
		
		<br>
		<input type="submit" value="Submit"/>
	
	</form:form>

</body>
</html>
