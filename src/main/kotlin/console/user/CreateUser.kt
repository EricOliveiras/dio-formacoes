package console.user

import models.User
import services.UserService
import java.lang.IllegalArgumentException

fun createUser(userService: UserService) {
    println("Digite o nome do usuário:")
    var firstName = readln()
    firstName = notShouldNull("nome", firstName)

    println("Digite o sobrenome do usuário:")
    val lastName = readlnOrNull() ?: ""

    println("Digite o email do usuário:")
    var email = readln()
    email = notShouldNull("email", email)

    val id = database.countUsers() + 1

    val newUser = User(id, firstName, lastName, email)

    try {
        userService.create(newUser)
        println("Usuário adicionado com sucesso!")
    } catch (e: RuntimeException) {
        e.printStackTrace()
    }
}

fun notShouldNull(valName: String, args: String): String {
    if (args.isEmpty()) {
        println("$valName não pode estar vazio.")
        val newArg = readlnOrNull() ?: ""
        return notShouldNull(valName, newArg)
    }
    return args
}