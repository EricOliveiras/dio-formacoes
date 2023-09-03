package terminal.user

import repositories.UserRepository
import services.UserService

val userRepository = UserRepository()
val userService = UserService(userRepository)