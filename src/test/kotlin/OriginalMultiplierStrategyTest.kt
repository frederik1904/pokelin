import framework.EffectLevel
import framework.Types
import standard.OriginalMultiplierStrategy
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is
import org.junit.Test

class OriginalMultiplierStrategyTest {
    val multiplierStrategy = OriginalMultiplierStrategy();
    @Test
    fun shouldBeStrongAgainst() {
        assertThat(multiplierStrategy.multiplier(Types.WATER, Types.ROCK), Is(equalTo(EffectLevel.Strong)))
        assertThat(multiplierStrategy.multiplier(Types.FIRE, Types.BUG), Is(equalTo(EffectLevel.Strong)))
    }

    @Test
    fun shouldBeWeakAgainst() {
        assertThat(multiplierStrategy.multiplier(Types.NORMAL, Types.ROCK), Is(equalTo(EffectLevel.Weak)))
        assertThat(multiplierStrategy.multiplier(Types.GHOST, Types.DARK), Is(equalTo(EffectLevel.Weak)))
    }

    @Test
    fun shouldBeIneffectiveAgainst() {
        assertThat(multiplierStrategy.multiplier(Types.NORMAL, Types.GHOST), Is(equalTo(EffectLevel.Ineffective)))
        assertThat(multiplierStrategy.multiplier(Types.GROUND, Types.FLYING), Is(equalTo(EffectLevel.Ineffective)))
    }

    @Test
    fun shouldBeNormalAgainst() {
        assertThat(multiplierStrategy.multiplier(Types.NORMAL, Types.NORMAL), Is(equalTo(EffectLevel.Normal)))
        assertThat(multiplierStrategy.multiplier(Types.GROUND, Types.WATER), Is(equalTo(EffectLevel.Normal)))
    }
}