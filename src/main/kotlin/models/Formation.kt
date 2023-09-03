package models

import interfaces.Level

data class Formation(val name: String, val level: Level, val educationalContent: List<EducationalContent>)