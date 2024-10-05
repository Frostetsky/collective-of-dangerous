package ru.collective.of.dangerous.top.gta.dto

import ru.collective.of.dangerous.top.gta.model.enums.BaseType

data class CoordinateSupplyDto(

    val coordinate: String,

    val baseType: BaseType
)