package console

import errors.AppErrorException
import repositories.UserRepository
import services.UserService

fun console() {
    try {
        val userRepository = UserRepository()
        val userService = UserService(userRepository)

        println("Escolha uma opção:")
        println("1 - Adicione um usuário.")
        println("2 - Buscar um usuário.")
        println("3 - Buscar todos os usuários.")
        println("4 - Fechar o programa.")

        val choice = readln().toInt()

        when (choice) {
            1 -> {
                createUser(userService)
                console()
            }
            2 -> {
                getUser(userService)
                console()
            }
            3 -> {
                getAllUsers(userService)
                console()
            }
            4 -> {
                println("Saindo do programa.")
                return
            }
            else -> {
                println("Opção inválida. Tente novamente!")
                console()
            }
        }
    } catch (e: AppErrorException) {
        e.printStackTrace()
    }
}