package terminal.formation

import interfaces.Level
import models.Formation
import services.FormationService
import terminal.user.notShouldNull

fun createFormation(formationService: FormationService) {
    println("Digite o nome da formação:")
    var name = readln()
    name = notShouldNull("nome", name)

    println("Digite o nível da formação:")
    println("1 -> Básico, 2 -> Intermediário, 3 -> Avançado")
    var level: Level = Level.BASICO

    var choice = readln()

    choice = notShouldNull("nivel", choice)

    when (choice.toInt()) {
        1 -> level = Level.BASICO
        2 -> level = Level.INTERMEDIARIO
        3 -> level = Level.AVANCADO
        else -> println("Nível inválido.")
    }

    val id = database.countFormations() + 1

    val formation = Formation(
        id,
        name,
        level = level,
        educationalContent = mutableListOf(),
        subscribed = mutableListOf()
    )

    try {
        formationService.createFormation(formation)
        println("Formação criada com sucesso.")
    } catch (e: RuntimeException) {
        e.printStackTrace()
    }
}