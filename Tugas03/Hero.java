package Tugas03;

public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;
    
    public Hero(){
    }
    public Hero (String name, double hp, double attack, double defense){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }
    public String getName() {
        return name;
    }
    public double getHp() {
        return hp;
    }
    public double getAttack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }
    public double rumusHero(double hp, double attack, double defense){
        return ((hp - attack) + defense);
    }
}
