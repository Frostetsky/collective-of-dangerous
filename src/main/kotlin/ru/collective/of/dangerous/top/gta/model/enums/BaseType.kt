package ru.collective.of.dangerous.top.gta.model.enums

import ru.collective.of.dangerous.top.gta.exceptions.BaseTypeNotFoundException

enum class BaseType(
    private val number: String,
    private val category: String
) {

    BASE_FIRST_SIX_CATEGORY("1", "6");

    companion object {

        @JvmStatic
        fun getBaseType(number: String, category: String): BaseType =
            BaseType.values().find { it.number == number && it.category == category }
                ?: throw BaseTypeNotFoundException(number, category)
    }
}