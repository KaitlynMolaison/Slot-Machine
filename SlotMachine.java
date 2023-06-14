
import java.util.Random;
import java.util.Scanner;



public class SlotMachine {
    public static void main(String[] args){

        int balance = 10;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (balance >= 1) {
            System.out.println("Your balance: $" + balance);
            System.out.println("Press 's' to spin the slot machine or 'q' to quit: ");
               String spin = scanner.nextLine();
               if (spin.equals("q")){
                   break;
               } else if (spin.equals("s")){
                   balance = 1;
                   int slot1 = random.nextInt(7) + 1;
                   int slot2 = random.nextInt(7) + 1;
                   int slot3 = random.nextInt(7) + 1;
                   System.out.println("Your slots are: " + slot1 + " " + slot2 + " " + slot3);
                   if (slot1 != slot2 && slot1 != slot3 && slot2 != slot3){
                       System.out.println("0 numbers match, Try again");
                   } else if (slot1 == slot2 && slot2 == slot3 && slot3 == 7){
                       balance += 100;
                       System.out.println("JACKPOT! 3 numbers match with a value of 7. You win $100!");
                   } else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3){
                       balance += 2;
                       System.out.println("2 numbers match, You win $2!");
                   } else{
                       balance += 50;
                       System.out.println("3 numbers match, You win $50!");
                   }
            } else {
                   System.out.println("Invlid input, Try again");
               }
        }
        System.out.println("Game over, You end with a balance of $" + balance);
        scanner.close();
    }
}
