
/*document.querySelector('#result').innerHTML =
    localStorage.getItem('favorites');*/

document.querySelector('#result').innerHTML = JSON.parse(localStorage.getItem('favorites'));





