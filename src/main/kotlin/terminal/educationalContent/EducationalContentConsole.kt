package terminal.educationalContent

import terminal.app

fun educationalContentConsole() {
    println("|======== Conteúdos Educacionais ========|")
    println("1 - Adicionar conteúdo")
    println("2 - Buscar conteúdo")
    println("3 - Buscar todos os conteúdos")
    println("4 - Voltar ao menu principal.")

    val choice = readln().toInt()

    when (choice) {
        1 -> {
            createEducationalContent(educationalContentService)
            educationalContentConsole()
        }
        2 -> {
            getEducationalContent(educationalContentService)
            educationalContentConsole()
        }
        3 -> {
            getAllEducationalContent(educationalContentService)
            educationalContentConsole()
        }
        4 -> {
            app()
        }
        else -> {
            println("Opção inválida. Tente novamente!")
            educationalContentConsole()
        }
    }
}