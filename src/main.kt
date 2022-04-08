/* Questions

1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)

2.Create a function that takes in an array of names and returns the number of
names longer than 5 characters (2pts)

3.You are creating a robot to serve drinks at a party. The robot is required to
serve a glass of milk for guests under the age of 6. For guests under the age of
15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
else gets a bottle of coca cola. Create a function that will make these decisions,
printing out the name of the drink each person gets according to their age.
(2pts)

4.Write a function that prints each number from 1 to 100 on a new line. For each
multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
"Buzz" instead of the number. For numbers which are multiples of both 3 and
5, print "FizzBuzz" instead of the number*/
fun main(){
    oddNumbers()
   var number= (longerNames(arrayOf("Kate","Kayitete","Angelina")))
    println(number)
    serveDrinks(9)
    serveDrinks(3)
    serveDrinks(16)
    serveDrinks(6)
    multiples()


}
//1
fun oddNumbers(){
    for(num in 1..100)
    if (num%2 !=0){
        println(num)
    }

}

//2
fun longerNames(names:Array<String>): Int{
    var number=0
    names.forEach{ name ->
        if(name.length>5)
            number++
        }
    return number
}

fun serveDrinks(age:Int){
    if (age<6){
        println("A glass of milk")
    }
    else if(age in 6..15) {
        println("A bottle of Fanta")
    }
    else{
        println("A bottle of Coca cola")
    }
}
fun multiples(){
    for (number in 1 .. 100) {
        if (number % 3 == 0)
            println("Fizz")
        else if (number % 5 == 0)
            println("Buzz")
        else if (number % 3 == 0 && number % 5 == 0)
            println("FizzBuzz")
        else{
            println(number)
        }

    }
            }


