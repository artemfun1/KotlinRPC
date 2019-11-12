

fun main() {
    val option = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(option)
    val userChoice = getUserChoice(option)
    printResult(userChoice,gameChoice)
}
fun getGameChoice(optionsParam:Array<String>)=
    optionsParam [(Math.random()* optionsParam.size).toInt()]
fun getUserChoice(optionsParam: Array<String>):String{

    var isValidChoise = false
    var userChoise = ""


    while (!isValidChoise) {
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        var userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoise = true
            userChoise = userInput
        }
        if (!isValidChoise) println("You must enter a valid choice")
    }
    return userChoise
}

fun printResult(userChoise:String, gameChoise:String){
    var result:String
    if (userChoise == gameChoise) result = "Tie"
    else if ((userChoise == "Rock" && gameChoise == "Scissors") ||
        (userChoise == "Paper" && gameChoise == "Rock")||
        (userChoise == "Scissors" && gameChoise == "Paper")) result = "You win! =)"
    else result = "You lose! =("
    println("You choise $userChoise. I choise $gameChoise. $result")
}