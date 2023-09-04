package terminal.formation

import services.FormationService

fun getAllFormations(formationService: FormationService) {
    println("|========== Lista de Formações ==========|")
    println(formationService.getAllFormations())
}