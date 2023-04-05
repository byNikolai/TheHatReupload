public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int spellPowers, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, spellPowers, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    public int abilityScore() {

        return nobility + honor + courage;
    }
    @Override
    public String toString() {
        return super.toString() + "As Gryffindor student has " + nobility + " nobility, " + honor + " honor, " + courage + " courage.";
    }


    public void compareGryffindor(Gryffindor gryffindor) {
        int firstStudent = abilityScore();
        int secondStudent = gryffindor.abilityScore();
        if (firstStudent > secondStudent) {
            System.out.printf("Gryffindor student %s is more powerful then Gryffindor student %s", getName(), gryffindor.getName());
        } else if (secondStudent > firstStudent) {
            System.out.printf("Gryffindor student %s is more powerful then Gryffindor student %s", gryffindor.getName(), getName());
        } else {
            System.out.printf("Gryffindor students %s and %s are equally powerful!", getName(), gryffindor.getName());
        }
    }

}
