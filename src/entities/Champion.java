package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armour;

    public Champion(String name, int life, int attack, int armour){
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armour = armour;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLife(){
        return life;
    }

    public void setLife(int life){
        this.life = life;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getArmour(){
        return armour;
    }

    public void setArmour(int armour){
        this.armour = armour;
    }

    public void takeDamage(Champion champion){
        int aux = Math.abs(champion.getAttack() - this.armour);
        if (this.armour >= aux) this.life--;
        else this.life -= aux;
    }

    public String status(Champion champion){
        String dead = champion.getLife() == 0 ? String.format("%d de vida (morreu)", champion.life) : String.format("%d de vida", champion.life);
        return String.format("%s: %s", champion.name, dead);
    }
}
