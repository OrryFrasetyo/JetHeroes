package com.orryfrasetyo.jetheroes.data

import com.orryfrasetyo.jetheroes.model.Hero
import com.orryfrasetyo.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}