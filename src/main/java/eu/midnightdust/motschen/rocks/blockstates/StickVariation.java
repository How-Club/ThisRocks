package eu.midnightdust.motschen.rocks.blockstates;

import net.minecraft.util.StringIdentifiable;

public enum StickVariation implements StringIdentifiable {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private final String name;

    StickVariation(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }

    private static final StickVariation[] vals = values();

    public StickVariation next() {
        return vals[(this.ordinal() + 1) % vals.length];
    }
}
