
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int heroHealth = 100;
        int heroStrike = damageDone();
        int enemyHealth = 100;
        int enemyStrike = damageDone();
        enemyHealth -= heroStrike;
        heroHealth -= enemyStrike;


    startGame(input);
    enemy1();
    damageDone();

        System.out.println("Would you like to attack? Y/N");
        String attackQ = input.nextLine();
        do{
        if(attackQ.equalsIgnoreCase("y")) {
            System.out.println("Your hit caused " + heroStrike + "% damage!");
            System.out.println("Frankenstein's health is now at " + enemyHealth + "%!");
            System.out.println("\nEnemy hit you for " + enemyStrike + "% damage!");
            System.out.println("Your health is now " + heroHealth + "%!\n");
            heroStrike = damageDone();
            enemyStrike = damageDone();
            enemyHealth -= heroStrike;
            heroHealth -= enemyStrike;
            }
        }while(heroHealth > 0 || enemyHealth > 0);

        if (heroHealth > enemyHealth) {
            System.out.println("Your won!");
        } else {
            System.out.println("You lost!");
        }

    }
    public static void startGame (Scanner input) {
        System.out.println("Are you ready to start the adventure!");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes")){
            hero(input);
        }
    }

    public static void enemy1 () {
        System.out.println("\n===================");
        System.out.println("Your enemy is: Frankenstein");
        int enemyHealth = 100;
        System.out.printf("Health: %s", enemyHealth);
        System.out.println("\nWeakness: Fire");
    }

    public static void hero (Scanner input) {
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.printf("Welcome %s", name);

        int health = 100;
        int sheild = 85;

        System.out.printf("\nYour Health: %s", health);
        System.out.printf("\nYour shield: %s", sheild);
    }

    public static int damageDone () {
        int max = 30;
        int min = 15;
        int range = max- min +1;
        return (int) (Math.random() *range) + min;
    }


}
