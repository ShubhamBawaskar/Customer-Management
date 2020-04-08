/**
 * 
 */

function validateCompanyRegistrationForm() {

	var cname = document.forms["customerRegistrationForm"]["cname"].value;
	var cname1 = document.forms["customerRegistrationForm"]["cname1"].value;
	var no = document.forms["customerRegistrationForm"]["no"].value;
	var email = document.forms["customerRegistrationForm"]["email"].value;
	
	var formSubmittionStatus = true;

	if (cname == "") 
	{
		formSubmittionStatus = false;
	} else if (cname1 = "") 
	{
		formSubmittionStatus = false;
	}else if(no="")
		{
		formSubmittionStatus = false;
		}else if(email="")
		{
			formSubmittionStatus = false;
			}
	else 
	{
	}

	if (!formSubmittionStatus) {
		alert("Invalid form");
	} else {
		alert("Form validation success.....");

	}

	return formSubmittionStatus;

}