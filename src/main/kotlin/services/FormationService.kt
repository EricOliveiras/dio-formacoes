package services

import errors.UserNotFoundException
import models.Formation
import repositories.FormationRepository
import repositories.UserRepository

class FormationService(
    private val formationRepository: FormationRepository,
    private val userRepository: UserRepository
) {
    fun createFormation(formation: Formation) {
        formationRepository.create(formation)
    }

    @Throws(UserNotFoundException::class)
    fun enrollUser(formation: Formation, id: Int) {
        val user = userRepository.getById(id) ?: throw UserNotFoundException()
        formationRepository.enrollUser(formation, user)
    }

    fun getAllFormations(): List<Formation> {
        return formationRepository.getAll()
    }
}