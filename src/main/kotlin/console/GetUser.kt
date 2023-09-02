package console

import services.UserService

fun getUser(userService: UserService) {
    println("Digite o id do usuário:")

    val id = readln().toInt()

    try {
        val user = userService.getUser(id)
        println(user.toString())
    } catch (e: RuntimeException) {
        e.printStackTrace()
    }
}