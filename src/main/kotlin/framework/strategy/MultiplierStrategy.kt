package framework.strategy
import framework.EffectLevel
import framework.Types

interface MultiplierStrategy {
    /**
     * This method takes as input two types and returns the calculated effectiveness level of this
     * @param attacker The type of the attacker
     * @param defender The type of the defender
     * @return The multiplier that this combo gives
     */
    fun multiplier(attacker: Types, defender: Types): EffectLevel
}