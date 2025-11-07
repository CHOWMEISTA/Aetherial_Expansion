package com.chow.AE.network;

/**
 * Syncs player mana data to the client.
 */
public class SyncManaPacket {
    private final int mana;

    public SyncManaPacket(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }
}
