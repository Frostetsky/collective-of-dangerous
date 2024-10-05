package ru.collective.of.dangerous.top.gta.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.collective.of.dangerous.top.gta.model.CoordinateSupply
import ru.collective.of.dangerous.top.gta.model.enums.BaseType
import java.util.UUID

@Repository
interface CoordinateSupplyRepository : CrudRepository<CoordinateSupply, UUID> {

    fun getAllByBaseType(baseType: BaseType): List<CoordinateSupply>
}