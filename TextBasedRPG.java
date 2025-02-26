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
    public static String name;
    public static double cash = 20.00;





    public static void main(String[] args)
    {
        System.out.println("Welcome to our RPG game!");
        System.out.println("Press ENTER to begin the game...");
        scan.nextLine();
        typewriter("Please type your name: \n>");
        name = scan.nextLine();
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
        getStats();
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
            System.out.println("What do you want to do? Type 1 or 2: ");
            System.out.println("1. Respond to Chad's text.");
            System.out.println("2. Check in w/ your Girl.");
            String choice = scan.nextLine();
            if (choice.equals("1"))
            {
                textChad();
            }
            else if (choice.equals("2"))
            {
                checkOnGirl();
            }
            else
            {
                System.out.println("That was not an option");
                intro();
            }

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

    public static void typewriter(String text, int speed) {
        int i;
        for (i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(speed);//0.5s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
    }

    public static void getStats()
    {
        System.out.println("--------");
        System.out.println("");
        System.out.println("CHARACTER NAME: " + name);
        System.out.println("RANK: " + currentRank);
        System.out.println("AURA: " + currentAura + " / " + maxAura);
        System.out.println("CASH: $" + cash);

        System.out.println("");
        System.out.println("--------");
        System.out.println("Hit ENTER to continue: ");
        scan.nextLine();
    }


    public static void textChad()
    {
        typewriter("You pull your phone back out to fire off a message to Chad: ");
        System.out.println("");
        System.out.println("Press ENTER to send an angry reply: ");
        scan.nextLine();
        typewriter(": TO: CHAD :");
        typewriter("----------");
        System.out.println(" ---> YOU:");
        typewriter("          chad, my girl would never leave me for a chump like you. im gonna go talk to her and prove it.");
        System.out.println("Hit ENTER to send the message: ");
        scan.nextLine();
        typewriter("----------");
        System.out.println("");
        typewriter("CHAD is typing...");
        typewriter("...    ...    ...   ...", 100);
        System.out.println(" ---> Chad:");
        typewriter("          LMAOOOO...bro you are such a lil bozo...gl getting her back...NERD!!!");
        typewriter("----------");
        System.out.println("Hit ENTER to close the message");
        System.out.println("");
        scan.nextLine();
        System.out.println("");
        typewriter("Well, that did not go so well...");
        typewriter("Now, you decide you must go talk to your girl to clear things up...");
        checkOnGirl();

    }

    public static void checkOnGirl()
    {
        typewriter("After class, you go meet your girl by the Library to check in with her.");
        typewriter("When you see her, she is acting awkward and shady.");
        typewriter("What do you want to do? Type a number: ");
        System.out.println("1. ask her on a date.");
        System.out.println("2. (AURA CHECK: 500+) break up with her.");
        if (currentRank.equals("Bozo"))
        {
            System.out.println("*3. (Bozo rank only) *RISKY* Cry and beg for her respect.");
        }
        String choice = scan.nextLine();
        if (choice.equals("1"))
        {
            dateOptions();
        }
        else if (choice.equals("2"))
        {
            if (currentAura < 500)
            {
                typewriter("You don't even look at her.");
                typewriter("As you pop in an airpod, you hit her with the brutal truth:");
                typewriter("YOU: Sorry girl, you're for the streets...");
                typewriter("She looks at you with a blank stare.");
                System.out.println("Hit ENTER to break the awkward silence");
                scan.nextLine();
                typewriter("GIRL: uh...ok...");
                typewriter("Chad appears out of nowhere, throws his arm around her, and begins walking away.");
                typewriter("CHAD: SEE YA BOZO!!!!");
                System.out.println(">>>>> Wow, bad plan!!!!!");
                System.out.println("GAME OVER.");
            }
            else
            {
                typewriter("Your aura is so strong, she already knows the truth...");
                typewriter("GIRL: you're right " + name + "...");
                typewriter("GIRL: your aura is too powerful, I can't even be with you anymore...");
                typewriter("*** AURA INCREASED - 500 ***");
                currentAura += 500;
                currentRank = ranks[ranks.length-1];
                getStats();
                System.out.println("YOU WIN!!!!");


            }
        }
        else if (choice.equals("3"))
        {
            typewriter("you begin crying and screaming.");
            typewriter("you make a huge scene, and people begin to stop and look.");
            typewriter("your girl is standing there, stunned, unsure of what to say...");
            System.out.println("How many minutes do you want to cry for? Type a number.");
            int numMins = scan.nextInt();
            scan.nextLine();
            typewriter("You continue to cry for " + numMins + " minutes.");
            System.out.println("Hit ENTER to stop crying.");
            scan.nextLine();
            System.out.println("After the crying show ends, your girl has the ick");
            currentAura-=20;
            System.out.println("*** 20 AURA LOST***");
            getStats();
            System.out.println("Welp, may as well try to take her on a date now.");
            dateOptions();

        }
    }

    public static void dateOptions()
    {
        typewriter("YOU: Let's go out tonight.");
        typewriter("GIRL: Wow, that is such a sweet idea! <3");
        typewriter("What did you have in mind?");
        System.out.println("");
        System.out.println("What do you want to do? Type a number:");
        System.out.println("1. Taco Bell (Cost: $2)");
        System.out.println("2. Movies (Cost: $20)");
        System.out.println("YOU HAVE: $" + cash);
    }







    //file ends on next line
}