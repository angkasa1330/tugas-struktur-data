/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
class Player {
    private String name;
    private int attackPower;

    public Player(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public int attack() {
        System.out.println(name + " menyerang");
        return attackPower;
    }

    public String getName() {
        return name;
    }
}

class Enemy {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " HP: " + health);
    }

    public boolean isDefeated() {
        return health <= 0;
    }
}

public class PBO {
    public static void main(String[] args) {
        Player player = new Player("Hero", 20);
        Enemy enemy = new Enemy("Slime", 50);

        while (!enemy.isDefeated()) {
            enemy.takeDamage(player.attack());
            System.out.println("-----");
        }

        System.out.println("Musuh dikalahkan!");
    }
}