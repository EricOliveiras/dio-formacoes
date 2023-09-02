package interfaces

import models.User

interface UserInterface {
    fun create(user: User)
    fun getById(id: Int): User?
    fun getByEmail(email: String): Boolean
    fun getAll(): List<User>
}