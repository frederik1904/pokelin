package framework

enum class Types(val type: String) {
    BUG("Bug"), DARK("Dark"), DRAGON("Dragon"), ELECTRIC("Electric"), FAIRY("Fairy"),
    FIGHTING("Fighting"), FIRE("Fire"), FLYING("Flying"), GHOST("Ghost"), GRASS("Grass"),
    GROUND("Ground"), ICE("Ice"), NORMAL("Normal"), POISON("Poison"), PSYCHIC("Psychic"),
    ROCK("Rock"), STEEL("Steel"), WATER("Water");

    override fun toString(): String {
        return type
    }
}

enum class EffectLevel(val multiplier: Double) {
    Inefective(0.0), Weak(0.5), Normal(1.0), Strong(2.0);
}