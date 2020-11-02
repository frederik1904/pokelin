package test.kotlin

import junit.framework.Assert.assertEquals
import org.junit.Test


class TestSanity {
    @Test
    fun twoPlusOneEqualsThree() {
        assertEquals("2+1 was not equal 3",3,2+1)
    }
}