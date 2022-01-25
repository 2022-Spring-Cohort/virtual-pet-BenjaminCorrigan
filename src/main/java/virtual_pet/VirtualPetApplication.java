package virtual_pet;

import java.util.Scanner;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSInput;

public class VirtualPetApplication {

    public static void main(String[] args) {
        new VirtualPetApplication().game();
    }

    public void game() {

        Cat myCat = new Cat("Simba", "Yellow", 10, 10, 10);
        System.out.println();
        Cat.greeting();
        boolean keepPlaying = true;
        System.out.println("Will you feed him, give him water or 3 play?");
        Scanner scan = new Scanner(System.in);
        int userSelection;


        while (keepPlaying) {
            System.out.println(myCat.healhtStatus());


            mainMenu();
            userSelection = scan.nextInt();
            if (userSelection == 1) {
                System.out.println("Option 1 picked");
                myCat.feed();
            }
            if (userSelection == 2) {
                System.out.println("Option 2 picked");
                myCat.water();
            }
            if (userSelection == 3) {
                System.out.println("Option 3 picked");
                myCat.play();
            }
            if (myCat.getHunger() ==0) {
                myCat.gameOver();
                break;
            }
            if  (myCat.getHunger() ==20) {
                myCat.youWon();
                break;
            }
            if (myCat.getThirst() ==0) {
                myCat.gameOver();
                break;
            }
            if (myCat.getThirst() ==20) {
                myCat.youWon();
                break;
            }
            if (myCat.getBoredom()==0) {
                myCat.gameOver();
                break;
            }
            if (myCat.getBoredom()==20) {
                myCat.youWon();
                break;
            }

            myCat.tick();

            }


        }

        public void mainMenu() {
        System.out.println("Enter option 1, 2, or 3");

    }

}
//break;

//System.out.println("Game over!");
//keepPlaying = false;
//myCat.gameOver();
//}
//System.out.println(myCat.healhtStatus());
//keepPlaying = myCat.getHunger() < 20;
//keepPlaying = myCat.getThirst() > 0;
//keepPlaying = myCat.getThirst() < 20;
//keepPlaying = myCat.getBoredom() > 0;
//keepPlaying = myCat.getBoredom() < 20;