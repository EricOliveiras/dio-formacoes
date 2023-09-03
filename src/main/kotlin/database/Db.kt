package database

import models.EducationalContent
import models.User

val dataUser: MutableList<User> = mutableListOf()

fun addUser(user: User) {
    dataUser.add(user)
}

fun getUserById(id: Int): User? {
    return dataUser.find { it.id == id }
}

fun getUserByEmail(email: String): Boolean {
    return dataUser.any { it.email == email}
}

fun getAllUsers(): List<User> {
    return dataUser.toList()
}

fun countUsers(): Int {
    return dataUser.count()
}

val dataEducationalContent: MutableList<EducationalContent> = mutableListOf()

fun addEducationalContent(educationalContent: EducationalContent) {
    dataEducationalContent.add(educationalContent)
}

fun addManyEducationalContent(vararg educationalContent: List<EducationalContent>) {
    educationalContent.forEach { data -> dataEducationalContent.addAll(data) }
}

fun getEducationalContentById(id: Int): EducationalContent? {
    return dataEducationalContent.find { it.id == id }
}

fun getAllEducationalContent(): List<EducationalContent> {
    return dataEducationalContent.toList()
}

fun countEducationalContent(): Int {
    return dataEducationalContent.count()
}

val educationalContentIntro: MutableList<EducationalContent> = mutableListOf(
    EducationalContent(1, "Olá_Mundo"),
    EducationalContent(2, "Funções"),
    EducationalContent(3, "Variáveis"),
    EducationalContent(4, "Variáveis"),
    EducationalContent(5, "Null Safety"),
    EducationalContent(6, "Classes"),
    EducationalContent(7, "Generics"),
)
