package interfaces

import models.EducationalContent

interface EducationalContentInterface {
    fun create(educationalContent: EducationalContent)
    fun createMany(vararg educationalContent: List<EducationalContent>)
    fun getById(id: Int): EducationalContent?
    fun getAll(): List<EducationalContent>
}