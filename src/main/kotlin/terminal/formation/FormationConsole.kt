package terminal.formation

import terminal.app
import enrollUser

fun formationConsole() {
    println("|=========== Formaçãoes ===========|")
    println("1 - Adicione uma formação.")
    println("2 - Matricular um aluno.")
    println("3 - Buscar todas as formações.")
    println("4 - Voltar ao menu principal.")
    print("Escolha uma opção: ")

    val choice = readln().toInt()

    when (choice) {
        1 -> {
            createFormation(formationService)
            formationConsole()
        }
        2 -> {
            enrollUser()
            formationConsole()
        }
        3 -> {
            getAllFormations(formationService)
            formationConsole()
        }
        4 -> {
            app()
        }
        else -> {
            println("Opção inválida. Tente novamente!")
            formationConsole()
        }
    }
}