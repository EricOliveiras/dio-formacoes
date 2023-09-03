package terminal.educationalContent

import services.EducationalContentService

fun getEducationalContent(educationalContentService: EducationalContentService) {
    println("Digite o id do conteúdo:")

    val id = readln().toInt()

    try {
        val educationalContent = educationalContentService.getEducationalContentById(id)
        println(educationalContent.toString())
    } catch (e: RuntimeException) {
        e.printStackTrace()
    }
}