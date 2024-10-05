package ru.collective.of.dangerous.top.gta.service

import ru.collective.of.dangerous.top.gta.model.CoordinateSupply
import ru.collective.of.dangerous.top.gta.model.enums.BaseType

interface CoordinateSupplyService {

    fun getAllByBaseType(baseType: BaseType): List<CoordinateSupply>
}