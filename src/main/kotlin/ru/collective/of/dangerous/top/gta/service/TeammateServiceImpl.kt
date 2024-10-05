package ru.collective.of.dangerous.top.gta.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import ru.collective.of.dangerous.top.gta.model.Teammate
import ru.collective.of.dangerous.top.gta.repository.TeammateRepository

@Service
class TeammateServiceImpl(
    private val teammateRepository: TeammateRepository
) : TeammateService {

    @Transactional
    override fun save(teammate: Teammate): Teammate = teammateRepository.save(teammate)

    @Transactional(readOnly = true)
    override fun getAll(): List<Teammate> = teammateRepository.findAll().toList()

    @Transactional(readOnly = true)
    override fun getAllByActive(isActive: Boolean): List<Teammate> = teammateRepository.getAllByActive(isActive)
}