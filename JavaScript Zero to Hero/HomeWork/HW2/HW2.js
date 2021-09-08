// 1. Create two number variables and perform all kinds of binary operation on them
var num1 = 8;
var num2 = 2;

var add = num1 + num2;
console.log(`Sum of ${num1} and ${num2} is: ${add}`);

var sub = num1 - num2;
console.log(`Subtraction of ${num1} and ${num2} is: ${sub}`);

var mul = num1 * num2;
console.log(`Multiplication of ${num1} and ${num2} is: ${mul}`);

var div = num1 / num2;
console.log(`Division of ${num1} and ${num2} is: ${div}`);

var mod = num1 % num2;
console.log(`Mod of ${num1} and ${num2} is: ${mod}`);

// 2. Create a array with 10 numbers and print only the even numbers with a loop from that array

var arr = [1,2,3,4,5,6,7,8,9,10];

for(var i = 0; i < arr.length; i++){
    if(arr[i] % 2 == 0){
        console.log(arr[i]);
    }
}

// 3. Create a array with five city names and print it in reverse order

var city = ['Brampton', 'Toronto', 'Ottawa', 'Calgary', 'Vancouver'];
for(let i  = city.length-1; i >= 0; i--){
    console.log(city[i]);
}