package jp.ac.uryukyu.ie.e235716;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 10);
        Enemy slime = new Enemy("スライムもどき", 45, 100);
        for(int i = 0; i < 3; i++){
            demoHero.attackWithWeponSkill(slime);
        }
        slime.attack(demoHero);
       assertEquals(defaultHeroHp, demoHero.getHitPoint());
    }
}
