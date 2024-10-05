package ru.collective.of.dangerous.top.gta.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import ru.collective.of.dangerous.top.gta.dto.TeammateDto
import ru.collective.of.dangerous.top.gta.mapper.TeammateMapper
import ru.collective.of.dangerous.top.gta.service.TeammateService

@RestController
@RequestMapping("/admin")
class AdminController(
    private val teammateService: TeammateService,
    private val teammateMapper: TeammateMapper
) {

    @PostMapping("/add-teammate")
    @ResponseStatus(HttpStatus.CREATED)
    fun addTeammate(@RequestBody teammateDto: TeammateDto) =
        teammateMapper.toEntity(teammateDto)
            .let { teammateService.save(it) }

}