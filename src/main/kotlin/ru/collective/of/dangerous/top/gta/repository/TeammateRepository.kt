package ru.collective.of.dangerous.top.gta.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.collective.of.dangerous.top.gta.model.Teammate
import java.util.UUID

@Repository
interface TeammateRepository : CrudRepository<Teammate, UUID> {

    fun getAllByActive(active: Boolean): List<Teammate>
}