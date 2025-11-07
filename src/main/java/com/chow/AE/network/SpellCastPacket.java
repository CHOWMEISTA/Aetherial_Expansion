package com.chow.AE.network;

/**
 * Represents a packet for spell casting events.
 */
public class SpellCastPacket {
    private final String spellName;

    public SpellCastPacket(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellName() {
        return spellName;
    }
}
