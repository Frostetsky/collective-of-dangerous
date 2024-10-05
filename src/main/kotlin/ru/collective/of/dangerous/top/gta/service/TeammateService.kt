package ru.collective.of.dangerous.top.gta.service

import ru.collective.of.dangerous.top.gta.model.Teammate

interface TeammateService {

    fun save(teammate: Teammate): Teammate

    fun getAll(): List<Teammate>

    fun getAllByActive(isActive: Boolean): List<Teammate>
}