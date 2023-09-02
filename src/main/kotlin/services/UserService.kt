package services

import errors.UserAlreadyExistsException
import errors.UserNotFoundException
import models.User
import repositories.UserRepository

class UserService(private val userRepository: UserRepository) {
    @Throws(UserAlreadyExistsException::class)
    fun create(user: User) {
        val checkIfUserAlreadyExist = userRepository.getByEmail(user.email)
        if (checkIfUserAlreadyExist) {
            throw UserAlreadyExistsException()
        }
        userRepository.create(user)
    }

    @Throws(UserNotFoundException::class)
    fun getUser(id: Int): User {
        return userRepository.getById(id) ?: throw UserNotFoundException()
    }

    fun getAllUsers(): List<User> {
        return userRepository.getAll()
    }
}