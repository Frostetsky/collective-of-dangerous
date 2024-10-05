package ru.collective.of.dangerous.top.gta.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.collective.of.dangerous.top.gta.model.Teammate
import ru.collective.of.dangerous.top.gta.service.TeammateService

@RestController
@RequestMapping("/teammates")
class TeammateController(
    private val teammateService: TeammateService
) {

    @GetMapping
    fun getAll(): List<Teammate> = teammateService.getAll()

    @GetMapping
    fun getAllByActive(@RequestParam(name = "isActive") isActive: Boolean): List<Teammate> =
        teammateService.getAllByActive(isActive)

}