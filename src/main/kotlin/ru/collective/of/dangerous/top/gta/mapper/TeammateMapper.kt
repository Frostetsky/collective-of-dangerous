package ru.collective.of.dangerous.top.gta.mapper

import ru.collective.of.dangerous.top.gta.dto.TeammateDto
import ru.collective.of.dangerous.top.gta.model.Teammate

interface TeammateMapper {

    fun toEntity(teammateDto: TeammateDto): Teammate
}