// Call the dataTables jQuery plugin
$(document).ready(function() {

});


async function Calcular() {

    let numer1 = document.getElementById('txtnum1').value;
    let numer2 = document.getElementById('txtnum2').value;
    let slt = document.getElementById('selectoper');
    let valor = slt.options[slt.selectedIndex].value;

    if((numer1 == "") || (numer2 == "")){
        alert("blank fields not allowed. ");
        return false;
    }

    if(valor == "value1"){
        alert("you must select a operation. ");
        return false;
    }


    const request = await fetch('api/oper/'+numer1+'/'+numer2+'/'+valor, {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

    });

    var operation = await request.json();
    alert("Result : " + operation);
    

}