package repositories

import database.addUser
import database.getAllUsers
import database.getUserByEmail
import database.getUserById
import interfaces.UserInterface
import models.User

class UserRepository: UserInterface  {
    override fun create(user: User) {
        addUser(user)
    }

    override fun getById(id: Int): User? {
        return getUserById(id)
    }

    override fun getByEmail(email: String): Boolean {
        return getUserByEmail(email)
    }

    override fun getAll(): List<User> {
        return getAllUsers()
    }
}