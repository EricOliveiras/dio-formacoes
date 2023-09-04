package models

import interfaces.Level

data class Formation(
    val id: Int,
    val name: String,
    val level: Level,
    val educationalContent: MutableList<EducationalContent>,
    val subscribed: MutableList<User>
) {
    fun enroll(user: User) {
        if (!subscribed.contains(user)) {
            subscribed.add(user)
            println("${user.firstName} foi matriculado na formação $name.")
        } else {
            println("${user.firstName} já está matriculado na formação $name.")
        }
    }
}
