package ru.collective.of.dangerous.top.gta.model

import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import ru.collective.of.dangerous.top.gta.model.enums.Server
import java.util.*

class GpsNumber(

    var id: UUID,

    @Enumerated(EnumType.STRING)
    var server: Server,

    var gps: String

)