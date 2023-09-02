package database

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
    return  dataUser.count()
}