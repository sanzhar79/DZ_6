import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
Boss boss= new Boss();
boss.setBossName("Darkness Knight");
boss.setBossHealth(1000);
boss.setBossAttack(100);
boss.getBossWeapon();

        System.out.println("Boss name: "+ boss.getBossName()+ " Boss health: "+ boss.getBossHealth()+ " Boss attack: "+ boss.getBossAttack()+" Weapon type: "+boss.getBossWeapon().getWeaponClass()+ " Weapon name: "+ boss.getBossWeapon().getWeaponName());

    }
}