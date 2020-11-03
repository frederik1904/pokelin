package standard
import framework.EffectLevel
import framework.EffectLevel.*
import framework.Types
import framework.Types.*
import framework.strategy.MultiplierStrategy

class OriginalMultiplierStrategy : MultiplierStrategy {
    private val effectivenessMap = mapOf(
        Pair(NORMAL, ROCK) to Weak, Pair(NORMAL, GHOST) to Ineffective, Pair(NORMAL, STEEL) to Weak,

        Pair(FIGHTING, NORMAL) to Strong, Pair(FIGHTING, FLYING) to Weak, Pair(FIGHTING, POISON) to Weak,
        Pair(FIGHTING, ROCK) to Strong, Pair(FIGHTING, BUG) to Weak, Pair(FIGHTING, GHOST) to Ineffective,
        Pair(FIGHTING, STEEL) to Strong, Pair(FIGHTING, PSYCHIC) to Weak, Pair(FIGHTING, ICE) to Strong,
        Pair(FIGHTING, DARK) to Strong, Pair(FIGHTING, FAIRY) to Weak,

        Pair(FLYING, FIGHTING) to Strong, Pair(FLYING, ROCK) to Weak, Pair(FLYING, BUG) to Strong,
        Pair(FLYING, STEEL) to Weak, Pair(FLYING, GRASS) to Strong, Pair(FLYING, ELECTRIC) to Weak,

        Pair(POISON, POISON) to Weak, Pair(POISON, GROUND) to Weak, Pair(POISON, ROCK) to Weak,
        Pair(POISON, GHOST) to Weak, Pair(POISON, STEEL) to Ineffective, Pair(POISON, GRASS) to Strong,
        Pair(POISON, FAIRY) to Strong,

        Pair(GROUND, FLYING) to Ineffective, Pair(GROUND, POISON) to Strong, Pair(GROUND, ROCK) to Strong,
        Pair(GROUND, BUG) to Weak, Pair(GROUND, STEEL) to Strong, Pair(GROUND, FIRE) to Strong,
        Pair(GROUND, GRASS) to Weak, Pair(GROUND, ELECTRIC) to Strong,

        Pair(ROCK, FIGHTING) to Weak, Pair(ROCK, FLYING) to Strong, Pair(ROCK, GROUND) to Weak,
        Pair(ROCK, BUG) to Strong, Pair(ROCK, STEEL) to Weak, Pair(ROCK, FIRE) to Strong,
        Pair(ROCK, ICE) to Strong,

        Pair(BUG, FIGHTING) to Weak, Pair(BUG, FLYING) to Weak, Pair(BUG, POISON) to Weak,
        Pair(BUG, GHOST) to Weak, Pair(BUG, STEEL) to Weak, Pair(BUG, FIRE) to Weak,
        Pair(BUG, GRASS) to Strong, Pair(BUG, PSYCHIC) to Strong, Pair(BUG, DARK) to Strong,
        Pair(BUG, FAIRY) to Weak,

        Pair(GHOST, NORMAL) to Ineffective, Pair(GHOST, GHOST) to Strong, Pair(GHOST, PSYCHIC) to Strong,
        Pair(GHOST, DARK) to Weak,

        Pair(STEEL, ROCK) to Strong, Pair(STEEL, STEEL) to Weak, Pair(STEEL, FIRE) to Weak,
        Pair(STEEL, WATER) to Weak, Pair(STEEL, ELECTRIC) to Weak, Pair(STEEL, ICE) to Strong,
        Pair(STEEL, FAIRY) to Strong,

        Pair(FIRE, ROCK) to Weak, Pair(FIRE, BUG) to Strong, Pair(FIRE, STEEL) to Strong,
        Pair(FIRE, FIRE) to Weak, Pair(FIRE, WATER) to Weak, Pair(FIRE, GRASS) to Strong,
        Pair(FIRE, ICE) to Strong, Pair(FIRE, DRAGON) to Weak,

        Pair(WATER, GROUND) to Strong, Pair(WATER, ROCK) to Strong, Pair(WATER, FIRE) to Strong,
        Pair(WATER, WATER) to Weak, Pair(WATER, GRASS) to Weak, Pair(WATER, DRAGON) to Weak,

        Pair(GRASS, FLYING) to Weak, Pair(GRASS, POISON) to Weak, Pair(GRASS, GROUND) to Strong,
        Pair(GRASS, ROCK) to Strong, Pair(GRASS, BUG) to Weak, Pair(GRASS, STEEL) to Weak,
        Pair(GRASS, FIRE) to Weak, Pair(GRASS, WATER) to Strong, Pair(GRASS, GRASS) to Weak,
        Pair(GRASS, DRAGON) to Weak,

        Pair(ELECTRIC, FLYING) to Strong, Pair(ELECTRIC, ROCK) to Ineffective, Pair(ELECTRIC, FIRE) to Strong,
        Pair(ELECTRIC, GRASS) to Weak, Pair(ELECTRIC, ELECTRIC) to Weak, Pair(ELECTRIC, DRAGON) to Weak,

        Pair(PSYCHIC, FLYING) to Strong, Pair(PSYCHIC, POISON) to Strong, Pair(PSYCHIC, STEEL) to Weak,
        Pair(PSYCHIC, PSYCHIC) to Weak, Pair(PSYCHIC, DARK) to Ineffective,

        Pair(ICE, FLYING) to Strong, Pair(ICE, ROCK) to Strong, Pair(ICE, STEEL) to Weak, Pair(ICE, FIRE) to Weak,
        Pair(ICE, WATER) to Weak, Pair(ICE, GRASS) to Strong, Pair(ICE, ICE) to Weak, Pair(ICE, DRAGON) to Strong,

        Pair(DRAGON, STEEL) to Weak, Pair(DRAGON, DRAGON) to Strong, Pair(DRAGON, FAIRY) to Ineffective,

        Pair(DARK, FIGHTING) to Weak, Pair(DARK, GHOST) to Strong, Pair(DARK, PSYCHIC) to Strong,
        Pair(DARK, DARK) to Weak, Pair(DARK, FAIRY) to Weak,

        Pair(FAIRY, FLYING) to Strong, Pair(FAIRY, POISON) to Weak, Pair(FAIRY, STEEL) to Weak,
        Pair(FAIRY, FIRE) to Weak, Pair(FAIRY, DRAGON) to Strong, Pair(FAIRY, DARK) to Strong
        )

    override fun multiplier(attacker: Types, defender: Types): EffectLevel {
        return effectivenessMap.getOrDefault(Pair(attacker, defender), Normal)
    }
}