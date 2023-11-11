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