package terminal.formation

import repositories.FormationRepository
import repositories.UserRepository
import services.FormationService

val formationRepository = FormationRepository()
val userRepository = UserRepository()
val formationService = FormationService(formationRepository, userRepository)