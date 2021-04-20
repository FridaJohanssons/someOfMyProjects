function createNode(element) {
    return document.createElement(element);
}

function append(parent, el) {
    return parent.appendChild(el);
}

const ul = document.querySelector('#recept');
const url = 'data/data.json';
fetch(url)
    .then((resp) => resp.json())
    .then(function(data) {
        console.log(data.recept);
        console.log("Visa första i json-objektet: " + data.recept[0].receptTitle);
        let recept = data.recept;

        // Returnerar json-bjekten genom att skapa en ny array med map()
        return recept.map(function(recept) {
            let li = createNode('li');
            li.innerHTML = recept.receptDay + " " + recept.receptTitle ;
            append(ul, li);
        })
    })
    .catch(function(error) {
        console.log(error);
    });