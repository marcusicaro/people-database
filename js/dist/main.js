(()=>{const t=document.getElementById("body");!async function(){try{const e=await fetch("http://localhost:8080/api/person",{mode:"cors",method:"GET",headers:{"Content-Type":"application/json"},body:JSON.stringify()}),n=await e.json();n.forEach((e=>function(e){const n=document.createElement("tr"),o=document.createElement("td");o.textContent=e.name;const c=document.createElement("td");c.textContent=e.surname;const d=document.createElement("td");d.textContent=e.height;const a=document.createElement("td");a.textContent=e.weight;const h=document.createElement("td");h.textContent=e.age;const i=document.createElement("td");i.textContent=(e.weight/(e.height*e.height)).toFixed(2),n.appendChild(o),n.appendChild(c),n.appendChild(d),n.appendChild(a),n.appendChild(h),n.appendChild(i),t.appendChild(n)}(e))),console.log(n)}catch(t){console.log(t)}}()})();