package terminal.educationalContent

import terminal.user.notShouldNull
import models.EducationalContent
import services.EducationalContentService

fun createEducationalContent(educationalContentService: EducationalContentService) {
    println("Digite o nome do conteúdo educacional:")
    var name = readlnOrNull() ?: ""
    name = notShouldNull("nome", name)

    println("Digite a duração do conteúdo educacional:")
    val duration = readlnOrNull()?.toInt() ?: 60

    val id = database.countEducationalContent() + 1

    val newEducationalContent = EducationalContent(id, name, duration)

    try {
        educationalContentService.create(newEducationalContent)
        println("Conteúdo criado com sucesso!")
    } catch (e: RuntimeException) {
        e.printStackTrace()
    }
}