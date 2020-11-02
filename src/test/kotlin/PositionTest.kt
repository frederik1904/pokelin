import junit.framework.Assert.*
import org.junit.Test
import framework.Position

class PositionTest {
    val position: Position = Position(1, 10);

    @Test
    fun twoEqualsPositionsShouldBeEqual() {
        assertTrue(position.equals(Position(1, 10)))
    }

    @Test
    fun twoNonEqualsPositionsShouldNotBeEqual() {
        assertFalse(position.equals(Position(-1, 10)))
        assertFalse(position.equals(Position(1, -10)))
    }

    @Test
    fun otherObjectTypesShouldNotEquals() {
        assertFalse(position.equals(null))
        assertFalse(position.equals("Hello world"))
    }
}