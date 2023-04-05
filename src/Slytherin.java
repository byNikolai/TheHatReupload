public class Slytherin extends Hogwarts{
    private int ambition;
    private int cunningness;
    private int heritage;
    private int resourcefulness;

    public Slytherin(String name, int spellPowers, int transgressionDistance, int ambition, int cunningness, int heritage, int resourcefulness) {
        super(name, spellPowers, transgressionDistance);
        this.ambition = ambition;
        this.cunningness = cunningness;
        this.heritage = heritage;
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getCunningness() {
        return cunningness;
    }

    public void setCunningness(int cunningness) {
        this.cunningness = cunningness;
    }

    public int getHeritage() {
        return heritage;
    }

    public void setHeritage(int heritage) {
        this.heritage = heritage;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    @Override
    public String toString() {
        return super.toString() + "As Slytherin student has " + ambition + " ambition, " + cunningness + " cunningness, " + heritage + " heritage and " + resourcefulness + " resourcefulness." ;
    }

    public int abilityScore() {

        return ambition + cunningness + heritage + resourcefulness;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int firstStudent = abilityScore();
        int secondStudent = slytherin.abilityScore();
        if (firstStudent > secondStudent) {
            System.out.printf("Slytherin student %s is more powerful then Slytherin student %s", getName(), slytherin.getName());
        } else if (secondStudent > firstStudent) {
            System.out.printf("Slytherin student %s is more powerful then Slytherin student %s", slytherin.getName(), getName());
        } else {
            System.out.printf("Slytherin students %s and %s are equally powerful!", getName(), slytherin.getName());
        }
    }

}
