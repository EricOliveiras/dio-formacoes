package services

import errors.EducationalContentNotFoundException
import models.EducationalContent
import repositories.EducationalContentRepository

class EducationalContentService(private val educationalContentRepository: EducationalContentRepository) {
    fun create(educationalContent: EducationalContent) {
        educationalContentRepository.create(educationalContent)
    }

    fun createManyEducationalContent(vararg educationalContent: List<EducationalContent>) {
        educationalContentRepository.createMany(*educationalContent)
    }

    @Throws(EducationalContentNotFoundException::class)
    fun getEducationalContentById(id: Int): EducationalContent {
        return educationalContentRepository.getById(id) ?: throw EducationalContentNotFoundException()
    }

    fun getAllEducationalContent(): List<EducationalContent> {
        return educationalContentRepository.getAll()
    }
}