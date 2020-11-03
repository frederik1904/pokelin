package test.kotlin

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is
import org.junit.Test


class TestSanity {
    @Test
    fun twoPlusOneEqualsThree() {
        assertThat(2 + 1, Is(equalTo(3)))
    }
}