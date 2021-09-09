// functions 

// function doSomething(name,surname)
// {
//     console.log("i am "+name);
//     // return "saurabh";
// }


// doSomething(223,"Odinson");


// function demo(){
//     console.log("Hello");
// }

// document.getElementById('one').innerText="Hello";

// alert("hello");


// function putText(){
//     document.getElementById('two').innerHTML="<h1>Hello Everyone</h1>";
// }




function addTask(){
    let data=document.getElementById('inp').value;
    document.getElementById('two').innerHTML+=`<h1 class='todo'>${data}</h1>`;
    document.getElementById('inp').value="";
}

function changeColor(){

    document.getElementById('two').style.backgroundColor="yellowgreen";

}








