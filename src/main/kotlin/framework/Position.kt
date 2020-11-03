package framework

/**
 * This class might become useless when the gui library is introduced,
 * but it can be used as a skeleton as to ensure that if we change the gui library used in the future
 * then we can just extend/implement it in this class
 */
class Position(var row: Int, var col: Int) {
    override fun hashCode(): Int {
        return GameConstants.HashCodePrimeValue * row + col;
    }

    override fun toString(): String {
        return "[$row,$col]"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Position

        if (row != other.row) return false
        if (col != other.col) return false

        return true
    }
}