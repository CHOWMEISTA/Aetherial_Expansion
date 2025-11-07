package com.chow.AE.spells;

/**
 * A basic offensive fireball spell.
 */
public class SpellFireball extends SpellBase {
    @Override
    public String getName() {
        return "Fireball";
    }

    @Override
    public int getCost() {
        return 15;
    }
}
