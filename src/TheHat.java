import java.util.Random;

public class TheHat {

    private static final Random GENERATOR = new Random();

    private static Gryffindor generateScoresGryffindor(String name) {
        return new Gryffindor(name, GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100));
    }
    private static Ravenclaw generateScoresRavenclaw(String name) {
        return new Ravenclaw(name, GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100));
    }
    private static Hufflepuff generateScoresHufflepuff(String name) {
        return new Hufflepuff(name, GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100));
    }
    private static Slytherin generateScoresSlytherin(String name) {
        return new Slytherin(name, GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100), GENERATOR.nextInt(100));
    }

    public static void main(String[] args) {
        Gryffindor harry = generateScoresGryffindor("Harry Potter");
        Gryffindor ron = generateScoresGryffindor("Ron Weasley");
        Gryffindor hermione = generateScoresGryffindor("Hermione Granger");
        Ravenclaw cho = generateScoresRavenclaw("Cho Chang");
        Ravenclaw padma = generateScoresRavenclaw("Padma Patil");
        Ravenclaw marcus = generateScoresRavenclaw("Marcus Belby");
        Hufflepuff zacharias = generateScoresHufflepuff("Zacharias Smith");
        Hufflepuff cedric = generateScoresHufflepuff("Cedric Diggory");
        Hufflepuff justin = generateScoresHufflepuff("Justin Finch-Fletchley");
        Slytherin gregory = generateScoresSlytherin("Gregory Goyle");
        Slytherin graham = generateScoresSlytherin("Graham Montague");
        Slytherin draco = generateScoresSlytherin("Draco Malfoy");

        harry.print();
        System.out.println("");
        ron.print();
        System.out.println("");
        hermione.print();
        System.out.println("");
        cho.print();
        System.out.println("");
        padma.print();
        System.out.println("");
        marcus.print();
        System.out.println("");
        zacharias.print();
        System.out.println("");
        cedric.print();
        System.out.println("");
        justin.print();
        System.out.println("");
        gregory.print();
        System.out.println("");
        graham.print();
        System.out.println("");
        draco.print();
        System.out.println("");
        System.out.println("");

        harry.compareGryffindor(hermione);
        System.out.println("");
        harry.studentCompare(draco);
        System.out.println("");
        graham.studentCompare(padma);
        System.out.println("");

    }

}
