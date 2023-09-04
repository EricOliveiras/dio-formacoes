package terminal

import database.addFormation
import database.addManyEducationalContent
import database.educationalContentIntro
import database.kotlinFormation
import terminal.educationalContent.educationalContentConsole
import terminal.formation.formationConsole
import terminal.user.userConsole

fun app() {
    println("Bem vindo ao Dio Formações")
    println("1 - Usuários")
    println("2 - Formaçãoe")
    println("3 - Conteúdos Educacionais")
    println("4 - Finalizar programa")
    print("Selecione uma opção: ")

    addManyEducationalContent(educationalContentIntro)
    addFormation(kotlinFormation)

    val choice = readln().toInt()

    when (choice) {
        1 -> {
            userConsole()
        }
        2 -> {
            formationConsole()
        }
        3 -> {
            educationalContentConsole()
        }
        4 -> {
            println("Finalizando o programa ...")
            return
        }
        else -> {
            println("Opção inválida. Tente novamente!")
            app()
        }
    }
}