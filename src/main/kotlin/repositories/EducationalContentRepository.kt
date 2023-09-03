package repositories

import database.addEducationalContent
import database.addManyEducationalContent
import database.getAllEducationalContent
import database.getEducationalContentById
import interfaces.EducationalContentInterface
import models.EducationalContent

class EducationalContentRepository: EducationalContentInterface {
    override fun create(educationalContent: EducationalContent) {
        addEducationalContent(educationalContent)
    }

    override fun createMany(vararg educationalContent: List<EducationalContent>) {
        addManyEducationalContent(*educationalContent)
    }

    override fun getById(id: Int): EducationalContent? {
        return getEducationalContentById(id)
    }

    override fun getAll(): List<EducationalContent> {
        return getAllEducationalContent()
    }
}