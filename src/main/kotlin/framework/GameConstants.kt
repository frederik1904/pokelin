package framework

import framework.strategy.MoveOutsideBattleStrategy
import framework.strategy.NoMoveOutsideBattleStrategy

object GameConstants {
    const val HashCodePrimeValue: Int = 337213

}

enum class Types(private val type: String) {
    BUG("Bug"), DARK("Dark"), DRAGON("Dragon"), ELECTRIC("Electric"), FAIRY("Fairy"),
    FIGHTING("Fighting"), FIRE("Fire"), FLYING("Flying"), GHOST("Ghost"), GRASS("Grass"),
    GROUND("Ground"), ICE("Ice"), NORMAL("Normal"), POISON("Poison"), PSYCHIC("Psychic"),
    ROCK("Rock"), STEEL("Steel"), WATER("Water");

    override fun toString(): String {
        return type
    }
}

enum class EffectLevel(val multiplier: Double) {
    Ineffective(0.0), Weak(0.5), Normal(1.0), Strong(2.0);
}

enum class Category(val category: String) {
    SPECIAL("Special"), PHYSICAL("Physical");

    override fun toString(): String {
        return category
    }
}

enum class NonVolatileStatus() {
    EMPTY()
}

enum class VolatileStatus() {
    EMPTY()
}

enum class VulnerabilityState(val state : String) {
    DEFAULT("Normal"), FLYING("Flying"), UNDERGROUND("Underground");

    override fun toString(): String {
        return state
    }
}

enum class Move(
        val moveName : String,
        val category: Category,
        val type: Types,
        val power: Int = 0,
        val accuracy: Int = 100,
        val makesContact: Boolean = true,
        val lifeSteal: Int = 0,
        val chargeRounds : Int = 0,
        val rechargeRounds : Int = 0,
        val nonVolatileStatus: NonVolatileStatus = NonVolatileStatus.EMPTY,
        val volatileStatus: VolatileStatus = VolatileStatus.EMPTY,
        val moveOutsideBattleStrategy: MoveOutsideBattleStrategy = NoMoveOutsideBattleStrategy(),
        val vulnerabilityState: VulnerabilityState = VulnerabilityState.DEFAULT
        ) {
    //Normal Attacks
    TACKLE("Tackle", Category.PHYSICAL, Types.NORMAL,40)
}