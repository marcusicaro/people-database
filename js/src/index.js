const tableBody = document.getElementById('body');

function populateTableBody(obj) {
  const container = document.createElement('tr');
  const name = document.createElement('td');
  name.textContent = obj.name;
  const surname = document.createElement('td');
  surname.textContent = obj.surname;
  const height = document.createElement('td');
  height.textContent = obj.height;
  const weight = document.createElement('td');
  weight.textContent = obj.weight;
  const age = document.createElement('td');
  age.textContent = obj.age;
  const imcCalc = document.createElement('td');
  imcCalc.textContent = (obj.weight / (obj.height * obj.height)).toFixed(2);

  container.appendChild(name);
  container.appendChild(surname);
  container.appendChild(height);
  container.appendChild(weight);
  container.appendChild(age);
  container.appendChild(imcCalc);

  tableBody.appendChild(container);
}

async function getPersonData() {
  try {
    const response = await fetch('http://localhost:8080/api/person', {
      mode: 'cors',
      method: 'GET',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(),
    });

    const personData = await response.json();

    personData.forEach((el) => populateTableBody(el));
    console.log(personData);
  } catch (err) {
    console.log(err);
  }
}

getPersonData();
