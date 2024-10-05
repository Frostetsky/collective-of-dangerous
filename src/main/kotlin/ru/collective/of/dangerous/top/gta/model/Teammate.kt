package ru.collective.of.dangerous.top.gta.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "teammates")
class Teammate(

    @Id
    var id: UUID,

    var nickName: String,

    var isActive: Boolean
)