package framework

class Position(var row: Int, var col: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null
            || other !is Position
            || other.col != col
            || other.row != row
        ) {
            return false
        }
        return true
    }

    override fun hashCode(): Int {
        return GameConstants.HashCodePrimeValue * row + col;
    }

    override fun toString(): String {
        return String.format("[$row,$col]")
    }
}