function submitForm() {
    // Add your form submission logic here
    // Example: You can redirect back to the current page
    window.location.href = 'index.html';
}

function changePage(values) {
   var fileName;
       switch (values) {
       case '1':
          fileName = 'page1.html';
          break;
       case '2':
          fileName = 'page2.html';
          break;
       case '3':
          fileName = 'page3.html';
          break;
       case '4':
          fileName = 'page4.html';
          break;
       default:
       return;
        }
        window.location.href = fileName;
   }

   function redirectToStartPage() {
        window.location.href = "pagestart.html";
   }

   function validateForm() {
       var studentID = document.getElementById("studentId").value;
       var mobilePhone = document.getElementById("mobilePhone").value;
       var postalcode = document.getElementById("postalcode").value;
       var phone = document.getElementById("phone").value;


       if (studentID.length !== 10 || isNaN(studentID)) {
           alert("กรุณากรอกรหัสนักศึกษาเป็นตัวเลข 10 หลัก");
           return false;
       }

       if (postalcode.length !== 5 || isNaN(postalcode)) {
           alert("กรุณากรอกรหัสไปรษณีย์เป็นตัวเลข 5 หลัก");
           return false;
       }

       if (mobilePhone.length !== 10 || isNaN(mobilePhone)) {
           alert("กรุณากรอกเบอร์โทรศัพท์มือถือเป็นตัวเลข 10 หลัก");
           return false;
       }

       if (phone !== ""){
           if (phone.length !== 10 || isNaN(phone)){
               alert("กรุณากรอกเบอร์โทรศัพท์บ้านเป็นตัวเลข 10 หลัก");
               return false;
           }       
       }



       finishSubmit();
       return true;
   }


    function finishSubmit() {
        window.location.href = "finish.html";
        alert("Form submitted successfully!");
    }

