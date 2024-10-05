package ru.collective.of.dangerous.top.gta.model

import jakarta.persistence.*
import ru.collective.of.dangerous.top.gta.model.enums.BaseType
import java.util.UUID

@Entity
@Table(name = "coordinates_supply")
class CoordinateSupply(

    @Id
    var id: UUID,

    var coordinate: String,

    @Enumerated(EnumType.STRING)
    var baseType: BaseType
)