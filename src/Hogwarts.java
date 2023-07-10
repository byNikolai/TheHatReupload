public class Hogwarts {
    protected int spellPowers;
    protected int transgressionDistance;
    protected String name;

    public Hogwarts( String name, int spellPowers, int transgressionDistance) {
        this.spellPowers = spellPowers;
        this.transgressionDistance = transgressionDistance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellPowers() {
        return spellPowers;
    }

    public void setSpellPowers(int spellPowers) {
        this.spellPowers = spellPowers;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int abilityScore() {

        return spellPowers + transgressionDistance;
    }

    public void studentCompare(Hogwarts hogwarts) {
        int firstStudent = abilityScore();
        int secondStudent = hogwarts.abilityScore();
        if (firstStudent > secondStudent) {
            System.out.printf("Student %s has %d Ability Score and is more powerful then student %s with %d Ability Score", getName(), abilityScore(), hogwarts.getName(), hogwarts.abilityScore());
        } else if (secondStudent > firstStudent) {
            System.out.printf("Student %s has %d Ability Score and is more powerful then student %s with %d Ability Score", hogwarts.getName(), hogwarts.abilityScore(), getName(), abilityScore());
        } else {
            System.out.printf("The student %s and %s are equally powerful, both have %d Ability Score!", getName(), hogwarts.getName(), abilityScore());
        }
    }



    @Override
    public String toString() {
        return "Student " + name + " have " + spellPowers + " Spell Power and can Transgress within " + transgressionDistance + " meters.";
    }

    public void print() {
        System.out.printf(toString());
    }

}