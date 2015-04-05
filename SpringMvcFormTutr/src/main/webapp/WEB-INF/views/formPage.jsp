<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sample Form</title>
</head>
<body>
		<div id="container">
	
		<h2>Subscribe to The Newsletter!</h2>
		<c:if test="${not empty message}"><div class="message green">${message}</div></c:if>
		
		<form:form modelAttribute="subscriber">
			<label for="nameInput">Name: </label>
			<form:input path="name" id="nameInput" />
			<br/>
			
			<label for="ageInput">Age: </label>
			<form:input path="age" id="ageInput" />
			<br/>
			
			<label for="emailInput">Email: </label>
			<form:input path="email" id="emailInput" />
			<br/>
			
			<label for="genderOptions">Gender: </label>
			<form:select path="gender" id="genderOptions">
				<form:option value="">Select Gender</form:option>
				<form:option value="MALE">Male</form:option>
				<form:option value="FEMALE">Female</form:option>
			</form:select>
			<br/>
			
			<label for="newsletterCheckbox">Newsletter? </label>
			<form:checkbox path="receiveNewsletter" id="newsletterCheckbox" />
			<br/>
			<label for="frequencySelect">Freq:</label>
			<form:select path="newsletterFrequency" id="frequencySelect">
				<form:option value="">Select Newsletter Frequency: </form:option>
				<c:forEach items="${frequencies}" var="frequency">
					<form:option value="${frequency}">${frequency}</form:option>
				</c:forEach>
			</form:select>
			<br/>
			
			<br/>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
	
	
	<script type="text/javascript">
	
		$(document).ready(function() {
			
			toggleFrequencySelectBox(); // show/hide box on page load
			
			$('#newsletterCheckbox').change(function() {
				toggleFrequencySelectBox();
			})
			
		});
		
		function toggleFrequencySelectBox() {
			if(!$('#newsletterCheckbox').is(':checked')) {
				$('#frequencySelect').val('');
				$('#frequencySelect').prop('disabled', true);
			} else {
				$('#frequencySelect').prop('disabled', false);
			}
		}
	
	</script>

</body>
</html>