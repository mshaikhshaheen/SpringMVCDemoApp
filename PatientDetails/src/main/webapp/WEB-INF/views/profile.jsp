<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient Profile</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/profilecommon.css" />
<link rel="stylesheet" media="screen"
	href="${pageContext.request.contextPath}/resources/js/superfish-master/src/css/superfish.css">
<script language="javascript"
	src="${pageContext.request.contextPath}/resources/js/superfish-master/src/js/hoverIntent.js"></script>
<script language="javascript"
	src="${pageContext.request.contextPath}/resources/js/superfish-master/src/js/superfish.js"></script>
<script>
	jQuery(document).ready(function() {
		jQuery('ul.sf-menu').superfish();
	});
</script>
</head>
<body>
	<div class="top_header" id="menu_header">
		PATIENT INFORMATION BASE
		<ul id="logoutMenu" class="sf-menu">
			<li><a href="#a"><%=request.getSession().getAttribute("loggedInUser")%></a>
				<ul>
					<li><a href="#">Change password</a></li>
					<li><a href="#">Account settings</a></li>
					<li><a href="#">Logout</a></li>
				</ul>
			</li>
		</ul>
	</div>
	<div class="bottom_content">
		<div class="left_pane">
			<img src="${pageContext.request.contextPath}/resources/images/sample_profile.png" id="profile_pic" />
			<a href="">About me</a><br /> 
			<a href="">Appointments</a><br /> 
			<a href="">Doctors visited</a><br /> 
			<a href="">Bills</a><br /> 
			<a href="">Insurance claims</a><br />
		</div>
		<div class="right_pane">
			<label id="profileLabel">Profile Details</label><br />
			<div class="patientName patientDetails">
				<label>Patient Name:</label>${profile.patient.firstName}
				${profile.patient.lastName}
			</div>
			<div class="patientBdate patientDetails">
				<label>Birth date:</label>${profile.patient.birthDate}
			</div>
			<div class="patientGender patientDetails">
				<label>Gender:</label>${profile.patient.gender}
			</div>
			<div class="patientLocation patientDetails">
				<label>Location:</label>${profile.patient.location}
			</div>
			<div class="patientAddress patientDetails">
				<label>Current Address:</label>
				<textarea rows="10" cols="50" disabled>${profile.patient.currentAddress}</textarea>
			</div>
			<div class="patientPermAddress patientDetails">
				<label>Permanent Address:</label>
				<textarea rows="10" cols="50" disabled>${profile.patient.permanentAddress}</textarea>
			</div>
			<div class="patientMobile patientDetails">
				<label>Mobile number:</label>${profile.patient.mobileNumber}
			</div>
			<br /> 
		</div>
		<div class="right_most_pane">
			<label id="updatesLabel">Updates and alerts</label><br/>
<!-- 			<marquee bgcolor="#e5e5e5" onMouseOver="this.scrollAmount=0" onMouseOut="this.scrollAmount=2" scrollamount="2" direction="up" loop="true"> -->
<!-- 			Random text displayed for now.New content can be shown based on requirement. -->
<!-- 			Trying on various options. -->
			
<!-- 			</marquee>  -->
		</div>
	</div>
</body>
</html>