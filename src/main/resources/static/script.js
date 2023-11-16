function submitForm() {
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

       finishSubmit();
       return true;
   }


    function finishSubmit() {
        var date = document.getElementById("date").value;
        var nameTitle = document.getElementById("nameTitle").value;
        var studentFirstName = document.getElementById("studentFirstName").value;
        var studentLastName = document.getElementById("studentLastName").value;
        var studentId = document.getElementById("studentId").value;
        var studentYear = document.getElementById("studentYear").value;
        var studentField = document.getElementById("studentField").value;
        var addressNumber = document.getElementById("addressNumber").value;
        var moo = document.getElementById("moo").value;
        var tumbol = document.getElementById("tumbol").value;
        var amphur = document.getElementById("amphur").value;
        var province = document.getElementById("province").value;
        var postalcode = document.getElementById("postalcode").value;
        var mobilePhone = document.getElementById("mobilePhone").value;
        var phone = document.getElementById("phone").value;
        var advisor = document.getElementById("advisor").value;
        var subject = document.getElementById("subject").value;
        var teacher = document.getElementById("teacher").value;
        var center = document.getElementById("center").value;
        var cause = document.getElementById("cause").value;

        var formData = {
           date: date,
           nameTitle: nameTitle,
           studentFirstName: studentFirstName,
           studentLastName: studentLastName,
           studentId: studentId,
           studentYear: studentYear,
           studentField: studentField,
           addressNumber: addressNumber,
           moo: moo,
           tumbol: tumbol,
           amphur: amphur,
           province: province,
           postalcode: postalcode,
           mobilePhone: mobilePhone,
           phone: phone,
           advisor: advisor,
           subject: subject,
           teacher: teacher,
           center: center,
           cause: cause

        };

          fetch("http://localhost:5050/users/save", {
             method: "POST",
             headers: {
                 "Content-Type": "application/json"
             },
             body: JSON.stringify(formData)
         })
             .then(response => response.json())
             .then(data =>{
                console.log(data);
                document.getElementById("studentForm").reset();
                window.location.href = "finish.html";

             })
             .catch(error =>{
                console.error("เกิดข้อผิดพลาด" +error);
                document.getElementById("studentForm").reset();
             });
     });

    }

