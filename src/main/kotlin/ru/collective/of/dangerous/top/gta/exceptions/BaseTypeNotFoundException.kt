package ru.collective.of.dangerous.top.gta.exceptions

class BaseTypeNotFoundException(
    number: String,
    category: String
) : Exception("База категории $category и номером $number не существует.")



