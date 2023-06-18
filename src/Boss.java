public class Boss extends GameEntity {

    Weapon bossWeapon= new Weapon("Sword", "Destroyer");

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    @Override
    public String getBossName() {
        return super.getBossName();
    }

    @Override
    public int getBossHealth() {
        return super.getBossHealth();
    }

    @Override
    public int getBossAttack() {
        return super.getBossAttack();
    }
    public void setBossName(String bossName){
        this.bossName=bossName;
    }
    public void setBossHealth(int bossHealth){
        this.bossHealth=bossHealth;
    }
    public void setBossAttack(int bossAttack){
        this.bossAttack=bossAttack;
    }

}


