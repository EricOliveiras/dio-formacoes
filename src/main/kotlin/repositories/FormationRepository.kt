package repositories

import database.addFormation
import database.enrollUserInFormation
import database.getAllFormations
import interfaces.FormationInterface
import models.Formation
import models.User

class FormationRepository: FormationInterface {
    override fun create(formation: Formation) {
        addFormation(formation)
    }

    override fun enrollUser(formation: Formation, user: User) {
        enrollUserInFormation(formation, user)
    }

    override fun getAll(): List<Formation> {
        return getAllFormations()
    }
}