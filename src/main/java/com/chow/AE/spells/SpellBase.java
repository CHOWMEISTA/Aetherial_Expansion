package com.chow.AE.spells;

import com.chow.AE.systems.ManaSystem;

/**
 * Base class for all spells.
 */
public abstract class SpellBase {
    public abstract String getName();
    public abstract int getCost();

    public void cast() {
        if (ManaSystem.use(getCost())) {
            System.out.println("[AE] Casted spell: " + getName());
        } else {
            System.out.println("[AE] Not enough mana to cast " + getName());
        }
    }
}
