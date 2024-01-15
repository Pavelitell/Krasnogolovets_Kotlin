fun main() {
    println("Enter something")
    //read user text
    val userText: String = readln()
    try {
        //check is seven
        if (userText.toIntOrNull() == 7) {
            println("Привет")
        }
    } finally {
        //check is name
        if (userText == "Вячеслав") {
            println("Привет, Вячеслав")
        }
        //check is it another text
        else if (userText != "Вячеслав" && !userText.contains("[0-9]".toRegex())) {
            println("Нет такого имени")
        }
        //check is it array of numbers
        else if (userText.contains(("[0-9]".toRegex())) && userText.contains(" ")) {

            val nums = userText.split(" ").toTypedArray()
            nums.forEachIndexed { _, element ->
                if (element.toInt() % 3 == 0) {
                    println(element)
                }
                
            }
        }
    }
}