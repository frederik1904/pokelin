package framework.strategy
import framework.EffectLevel
import framework.Types

interface MultiplierStrategy {
    fun multiplier(attacker: Types, defender: Types): EffectLevel
}