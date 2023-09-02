package console

import services.UserService

fun getAllUsers(userService: UserService) {
    println("Lista de usuários:")
    println(userService.getAllUsers().toString())
}