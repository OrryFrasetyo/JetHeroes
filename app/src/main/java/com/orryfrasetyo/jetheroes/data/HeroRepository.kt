package com.orryfrasetyo.jetheroes.data

import com.orryfrasetyo.jetheroes.model.Hero
import com.orryfrasetyo.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}