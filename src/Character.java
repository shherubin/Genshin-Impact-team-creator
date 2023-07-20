public class Character {

    private String firstName;
    private String lastName;
    private String elementalType;
    private String weapon;

    public Character(String firstName, String lastName, String elementalType, String weapon) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.elementalType = elementalType;
        this.weapon = weapon;
    }

    public Character() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getElementalType() {
        return elementalType;
    }

    public void setElementalType(String elementalType) {
        this.elementalType = elementalType;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return firstName + lastName + " uses a " + weapon + " and is a " + elementalType + " character.";
    }


}
