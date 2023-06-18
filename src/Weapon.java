public class Weapon {
private String weaponClass;
private String weaponName;

    public Weapon(String weaponClass, String weaponName){
this.weaponClass =weaponClass;
this.weaponName  =weaponName;

    }

    public String getWeaponClass() {
        return weaponClass;
    }

    public void setWeaponClass(String weaponClass) {
        this.weaponClass = weaponClass;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}

