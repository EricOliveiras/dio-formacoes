package terminal.user

import terminal.app

fun userConsole() {
    println("|=========== Usuários ===========|")
    println("1 - Adicione um usuário.")
    println("2 - Buscar um usuário.")
    println("3 - Buscar todos os usuários.")
    println("4 - Voltar ao menu principal.")
    print("Escolha uma opção: ")

    val choice = readln().toInt()

    when (choice) {
        1 -> {
            createUser(userService)
            userConsole()
        }
        2 -> {
            getUser(userService)
            userConsole()
        }
        3 -> {
            getAllUsers(userService)
            userConsole()
        }
        4 -> {
            app()
        }
        else -> {
            println("Opção inválida. Tente novamente!")
            userConsole()
        }
    }
}