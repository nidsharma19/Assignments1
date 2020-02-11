function validation() {
    var fname = document.forms["UDetails"]["firstname"];
    var lname = document.forms["UDetails"]["lastname"];
    var email = document.forms["UDetails"]["email"];
    var password = document.forms["UDetails"]["password"];
    var mobile = document.forms["UDetails"]["mobile"];
    var birthday = document.forms["UDetails"]["birthday"];
    var gender = document.forms["UDetails"]["gender"];

    if (fname.value == "") {
        alert("First Name is mandatory");
        fname.focus();
        return false;
    }
    if (lname.value == "") {
        alert("Last Name is mandatory");
        lname.focus();
        return false;
    }
    if (email.value == "") {
        alert("Email-Id is mandatory");
        email.focus();
        return false;
    }
    if (password.value == "") {
        alert("Password is mandatory");
        password.focus();
        return false;
    }
    if (gender.value == "default") {
        alert("Choose your gender");
        gender.focus();
        return false;
    }
    document.getElementById("message").innerHTML="Here is the information you have submitted:";
    document.getElementByName("fullname").innerHTML="Name: "+fname+" "+lname;
    document.getElementByName("email").innerHTML="Email: "+email;
    document.getElementByName("mobile").innerHTML="Mobile: "+mobile;
    document.getElementByName("birthday").innerHTML="Birthday: "+birthday;
    document.getElementByName("gender").innerHTML="Gender: "+gender;
    document.getElementByName("hobbies").innerHTML="Hobbies: "+selectedItems;
    return true;
}

function isFutureDate(idate){
    var today = new Date().getTime(),
        idate = idate.split("/");

    idate = new Date(idate[2], idate[1] - 1, idate[0]).getTime();
    return (today - idate) < 0;
}
