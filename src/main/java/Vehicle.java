import java.io.Console;

public abstract class Vehicle {

    private int healthValue;
    private String type;
    private int attackValue;

    public Vehicle(int healthValue, String type, int attackValue) {
        this.healthValue = healthValue;
        this.type = type;
        this.attackValue = attackValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public String getType() {
        return type;
    }

    public void reduceHealth(int attackValue) {
        healthValue -= attackValue;
    }

    public void attack(Kaiju monster){
        monster.reduceHealthValue(attackValue);
    }

    public void superAttack(Kaiju monster) {
        monster.reduceHealthValue((attackValue * 3));
    }
}
