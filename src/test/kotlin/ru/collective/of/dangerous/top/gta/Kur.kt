package ru.collective.of.dangerous.top.gta

import org.junit.jupiter.api.Test
import org.springframework.http.HttpMethod
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestTemplate

class Kur {

    @Test
    fun test() {

        val restTemplate = RestTemplate()
        val listSuccessIndex = mutableListOf<Int>()


        for (i in 1 .. 1000) {
            val url = "https://top-gta.net/media/paintjobs/${i}_main.png"
            try {
                val rsd = restTemplate.exchange(url, HttpMethod.GET, null, String::class.java)
                listSuccessIndex += i
            } catch (e: HttpClientErrorException) {
                Thread.sleep(1000)
                println(e.message)
            }
        }

        println(listSuccessIndex)
    }
}