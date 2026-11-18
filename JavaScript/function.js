function greet() {
  console.log("Hello, JavaScript!");
}
greet();

function greetUser (name){
    console.log(`hello ${name}`);   
}
greetUser("Priyanshu");
greetUser("Priya");

function add (a,b){
    console.log("sum =",a+b);
}
add(2,4);

function mul(a,b){
   return a*b;
}
let result = mul(2,3);
console.log("Multiplication:", result);

function CheckOddorEven(num){
   if(num%2===0){
    console.log("Even");
   }
   else{
    console.log("odd");  
   }
}
console.log(CheckOddorEven(10));
//Max of two number
