
              function show()
              {
                  var n1=document.getElementById("firstname").value;
                  var n2=document.getElementById("middlename").value;
                  var n3=document.getElementById("lastname").value;
                  var name=n1+"  "+n2+"  "+n3;
                  
                  var e1=document.getElementById("email").value;
                  var a1=document.getElementById("mobile").value;
                  var c1=document.getElementById("birthday").value;
                  var s1=document.getElementById("gender").value;
                  var z1=document.getElementById("Nationality").value;
                  var p1=document.getElementById("inputPassword4");
                  document.write("<center><h1>Entered Details</h1></center>");
                  document.write("Your name is :",name);
                  document.write("<h5></h5>");
                  document.write("Your email id is : ",e1);
                  document.write("<h5></h5>");
                  document.write("Your mobile number is : ",a1);
                  document.write("<h5></h5>");
                  document.write("Your birthday is : ",c1);
                  document.write("<h5></h5>");
                  document.write("Your gender is : ",s1);
                  document.write("<h5></h5>");
                  document.write("Your nationality is : ",z1);
                  document.write("<h5></h5>");
              }
			  show();
			  
       