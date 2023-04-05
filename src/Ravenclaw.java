public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int spellPowers, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(name, spellPowers, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int abilityScore() {

        return smart + wise + creative + witty;
    }

    @Override
    public String toString() {
        return super.toString() + "As Ravenclaw student has " + smart + " smart, " + wise + " wise, " + witty + " witty and " + creative + " creativity." ;
    }

    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int firstStudent = abilityScore();
        int secondStudent = ravenclaw.abilityScore();
        if (firstStudent > secondStudent) {
            System.out.printf("Ravenclaw student %s is more powerful then Ravenclaw student %s", getName(), ravenclaw.getName());
        } else if (secondStudent > firstStudent) {
            System.out.printf("Ravenclaw student %s is more powerful then Ravenclaw student %s", ravenclaw.getName(), getName());
        } else {
            System.out.printf("Ravenclaw students %s and %s are equally powerful!", getName(), ravenclaw.getName());
        }
    }

}
