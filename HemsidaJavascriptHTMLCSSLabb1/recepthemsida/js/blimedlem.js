const elUsername = document.querySelector('#username');   // Username input
const elMsg = document.querySelector('#feedback');   // Error msg element

const elForm = document.querySelector('#formReg');
const elOutput = document.querySelector('#output');

function checkUsername(minLength) {                     // Declare function
    if (elUsername.value.length < minLength) {            // If username too short
        // Set the error message
        elMsg.innerHTML = 'Användarnamn måste vara minst ' + minLength + ' bokstäver långt';
    } else {                                             // Otherwise
        elMsg.innerHTML = '';                              // Clear msg
    }
}

function showName(event){
    // Använd value när man hämtar från input i formuläret
    let name = elUsername.value;

    //console.log("Textfält i funktion " + name);
    if(elUsername.value.length < 5) {
        elMsg.innerHTML = '';
    }
    else{
        elOutput.textContent = 'Välkommen ' + name + '! Du är nu inloggad';
    }

    // Submittar inte formuläret
    event.preventDefault(); //
}

elUsername.addEventListener('blur', function() {        // When it loses focus
    checkUsername(5);                                     // Pass argument here
}, false);

elForm.addEventListener('submit', showName, false);