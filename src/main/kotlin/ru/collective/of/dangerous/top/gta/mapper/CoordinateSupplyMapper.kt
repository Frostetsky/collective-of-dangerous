package ru.collective.of.dangerous.top.gta.mapper

import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import ru.collective.of.dangerous.top.gta.dto.CoordinateSupplyDto
import ru.collective.of.dangerous.top.gta.model.CoordinateSupply

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface CoordinateSupplyMapper {

    fun toListDto(coordinateSupply: List<CoordinateSupply>): List<CoordinateSupplyDto>
}