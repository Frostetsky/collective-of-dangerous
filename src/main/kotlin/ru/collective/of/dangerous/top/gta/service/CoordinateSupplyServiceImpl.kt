package ru.collective.of.dangerous.top.gta.service

import org.springframework.stereotype.Service
import ru.collective.of.dangerous.top.gta.model.CoordinateSupply
import ru.collective.of.dangerous.top.gta.model.enums.BaseType
import ru.collective.of.dangerous.top.gta.repository.CoordinateSupplyRepository

@Service
class CoordinateSupplyServiceImpl(
    private val coordinateSupplyRepository: CoordinateSupplyRepository
) : CoordinateSupplyService {

    override fun getAllByBaseType(baseType: BaseType): List<CoordinateSupply> =
        coordinateSupplyRepository.getAllByBaseType(baseType)
}