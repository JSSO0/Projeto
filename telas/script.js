document.getElementById("form-upload").addEventListener("submit", function(event) {
    event.preventDefault();
    var fileInput = document.getElementById("file-input");
    var file = fileInput.files[0];
    var formData = new FormData();
    formData.append("file", file);
  
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/uploadFile");
    xhr.send(formData);
  });
  