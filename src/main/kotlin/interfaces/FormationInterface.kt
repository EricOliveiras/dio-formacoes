package interfaces

import models.Formation
import models.User

interface FormationInterface {
    fun create(formation: Formation)
    fun enrollUser(formation: Formation, user: User)
    fun getAll(): List<Formation>
}