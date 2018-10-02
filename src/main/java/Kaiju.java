public abstract class Kaiju {



    private String name;
    private String roar;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.roar = roar;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String roar() {
        return "ROAAARRR";
    }

    public void attack(Vehicle target) {
         target.reduceHealth(attackValue);
    }

    public String move() {
        return name + " moved";
    }

    public  void reduceHealthValue(int attackValue) {
        healthValue -= attackValue;
    }
}

