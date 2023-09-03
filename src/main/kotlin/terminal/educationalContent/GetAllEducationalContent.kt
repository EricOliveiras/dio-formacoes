package terminal.educationalContent

import services.EducationalContentService

fun getAllEducationalContent(educationalContentService: EducationalContentService) {
    println("Lista de conteúdos:")
    println(educationalContentService.getAllEducationalContent())
}