package ru.collective.of.dangerous.top.gta.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.collective.of.dangerous.top.gta.dto.CoordinateSupplyDto
import ru.collective.of.dangerous.top.gta.mapper.CoordinateSupplyMapper
import ru.collective.of.dangerous.top.gta.model.enums.BaseType
import ru.collective.of.dangerous.top.gta.service.CoordinateSupplyService

@RestController
@RequestMapping("/coordinates-supply")
class CoordinateSupplyController(
    private val coordinateSupplyService: CoordinateSupplyService,
    private val coordinateSupplyMapper: CoordinateSupplyMapper
) {

    @GetMapping("/base-type")
    fun getAllByBaseType(
        @RequestParam("number") number: String,
        @RequestParam("category") category: String
    ): List<CoordinateSupplyDto> {
        val baseType = BaseType.getBaseType(number, category)
        return coordinateSupplyService.getAllByBaseType(baseType)
            .let { coordinateSupplyMapper.toListDto(it) }
    }
}