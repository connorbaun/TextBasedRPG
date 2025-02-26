import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    //determines the amount of items you can carry
    public static int maxItems = 5;
    //this is your actual inventory
    public static String[] inventory = new String[maxItems];
    public static int currentAura = 50;
    public static int maxAura = 1000;
    public static String[] ranks = {"Bozo", "L Rizz", "W Rizz", "Mid", "Chill Guy", "Sigma"};
    public static String currentRank = ranks[0];





    public static void main(String[] args)
    {
        System.out.println("Welcome to our RPG game!");
        System.out.println("Press ENTER to begin the game...");
        scan.nextLine();
        typewriter("Please type your name: \n>");
        String name = scan.nextLine();
        System.out.println("Ah, so your name is " + name + "?\n>");
        String response = scan.nextLine();
        while (!response.equalsIgnoreCase("yes"))
        {
            typewriter("Please type your name: \n>");
            name = scan.nextLine();
            System.out.println("Ah, so your name is " + name + "?\n>");
            response = scan.nextLine();
        }
        System.out.println("Great, let's continue, " + name + "!");
        System.out.println("");
        intro();
    }

    public static void intro()
    {
        typewriter("Our story begins here...");
        typewriter("You are in high school, your senior year, at Hatboro Horsham High School.");
        typewriter("After years of having absolutely zero game, you finally got a girlfriend.");
        typewriter("The problem is, she just met this cool guy named Chad in Science class. He is a football player, jacked, 6 foot 11, and has a lambo.");
        typewriter("Last night, Chad sent you a DM with the following message: ");
        System.out.println("Press ENTER to open Chad's DM: ");
        scan.nextLine();
        typewriter(": SENT FROM iPHONE :");
        typewriter("----------");
        System.out.println("");
        System.out.println(" ---> Chad:");
        System.out.println("          sup loser. just met your girl in Leddys class. pretty cute. she told me your a complete bozo.");
        System.out.println(" ---> Chad:");
        System.out.println("          LMAO gonna ask her to prom sorry chief...ggs");
        System.out.println("");
        typewriter("----------");
        System.out.println("Hit ENTER to close the message");
        scan.nextLine();
        System.out.println("");
        typewriter("Compared to chad, you are an absolute bozo...");
        typewriter("With only 1 week till Prom, you need to gain as much aura as possible, or risk losing your girl forever!!!");


        //use typewriter( ) to print out the intro setup for your story.

        //1. tell us the lore of your world
        //2. tell us who our character is
        //3. let us input in a name for our character
        //4. give us a quest
        //5. it should end with a choice/decision

    }

    public static void typewriter(String text) {
        int i;
        for (i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(25);//0.5s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
    }







    //file ends on next line
}