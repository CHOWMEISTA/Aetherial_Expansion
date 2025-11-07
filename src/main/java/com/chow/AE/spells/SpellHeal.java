package com.chow.AE.spells;

/**
 * A basic healing spell.
 */
public class SpellHeal extends SpellBase {
    @Override
    public String getName() {
        return "Heal";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
