import java.util.Scanner;

/**
 *
 */
public class Refresher {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = read.nextLine();
        Beard joshBeard;
        String color;
        if(name.isEmpty())
        {
            System.out.println("Why you shy? Let me tell you who you are.");
            joshBeard = new Beard();
        } else {
            joshBeard = new Beard(name);
            System.out.println("What color is your beard?");
            color = read.nextLine();
            joshBeard.setColor(color);

            joshBeard.setEyeColor("Brown");
            joshBeard.setMouthLength(2);
            joshBeard.setNoseLength(2);
            joshBeard.setHairColor("Brown");
        }
        read.close();

        Face amandaFace = new Face("Amanda", "Female");
        amandaFace.setEyeColor("Blue");
        amandaFace.setHairColor("Blonde");
        amandaFace.setMouthLength(2);
        amandaFace.setNoseLength(2);
        stats(joshBeard);
        stats(amandaFace);
        stats(new Face());
        stats(new Beard());
    }

    public static void stats(Face person) {
        String name = person.getName();

        System.out.println(name + "'s stats:");
        if(person.getGender().equals("Male")) {
            System.out.println("He has " + person.getHairColor() + " hair");
            System.out.println("He has " + person.getEyeColor() + " eyes");
            System.out.println("He has a " + person.getNoseLength() + " inch long nose");
            System.out.println("He has a " + person.getMouthLength() + " inch long mouth");
            person.itch();

        } else {
            System.out.println("She has " + person.getHairColor() + " hair");
            System.out.println("She has " + person.getEyeColor() + " eyes");
            System.out.println("She has a " + person.getNoseLength() + " inch long nose");
            System.out.println("She has a " + person.getMouthLength() + " inch long mouth");
            person.kiss();
        }
    }
}
