import framework.EffectLevel
import framework.Types
import junit.framework.Assert.assertTrue
import org.junit.Test
import standard.OriginalMultiplierStrategy

class OriginalMultiplierStrategyTest {
    val multiplierStrategy = OriginalMultiplierStrategy();
    @Test
    fun shouldBeStrongAgainst() {
        assertTrue(multiplierStrategy.multiplier(Types.WATER, Types.ROCK) == EffectLevel.Strong)
        assertTrue(multiplierStrategy.multiplier(Types.FIRE, Types.BUG) == EffectLevel.Strong)
    }

    @Test
    fun shouldBeWeakAgainst() {
        assertTrue(multiplierStrategy.multiplier(Types.NORMAL, Types.ROCK) == EffectLevel.Weak)
        assertTrue(multiplierStrategy.multiplier(Types.GHOST, Types.DARK) == EffectLevel.Weak)
    }

    @Test
    fun shouldBeIneffectiveAgainst() {
        assertTrue(multiplierStrategy.multiplier(Types.NORMAL, Types.GHOST) == EffectLevel.Inefective)
        assertTrue(multiplierStrategy.multiplier(Types.GROUND, Types.FLYING) == EffectLevel.Inefective)
    }

    @Test
    fun shouldBeNormalAgainst() {
        assertTrue(multiplierStrategy.multiplier(Types.NORMAL, Types.NORMAL) == EffectLevel.Normal)
        assertTrue(multiplierStrategy.multiplier(Types.GROUND, Types.WATER) == EffectLevel.Normal)
    }
}