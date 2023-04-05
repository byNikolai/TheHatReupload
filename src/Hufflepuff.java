public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int spellPowers, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, spellPowers, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int abilityScore() {

        return hardworking + loyal + honest;
    }
    @Override
    public String toString() {
        return super.toString() + "As Hufflepuff student has " + hardworking + " hardworking, " + loyal + " loyal, " + honest + " honest." ;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int firstStudent = abilityScore();
        int secondStudent = hufflepuff.abilityScore();
        if (firstStudent > secondStudent) {
            System.out.printf("Hufflepuff student %s is more powerful then Hufflepuff student %s", getName(), hufflepuff.getName());
        } else if (secondStudent > firstStudent) {
            System.out.printf("Hufflepuff student %s is more powerful then Hufflepuff student %s", hufflepuff.getName(), getName());
        } else {
            System.out.printf("Hufflepuff students %s and %s are equally powerful!", getName(), hufflepuff.getName());
        }
    }

}
