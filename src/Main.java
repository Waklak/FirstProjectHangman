import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
    private static final String start = "N";
    private static final String exit = "E";
    public static void main(String[] args) throws Exception {
        Game hangman = new Game();
        boolean playAgain = true;


        while(playAgain){
            hangman.startGame();
            System.out.println();
            System.out.println();
            System.out.print("ВЫ ЗАКОНЧИЛИ ИГРУ");
            System.out.print("хотите начать новую[N] или выйти[E]");
            String nextGameAnswer = hangman.sc.nextLine();

            while(!nextGameAnswer.equals(start) && !nextGameAnswer.equals(exit)){
                System.out.println("Неправильный ввод, нужно либо N, либо E");
                nextGameAnswer = hangman.sc.nextLine();
            }
            if(nextGameAnswer.equals(start)){
                hangman.checking.getUsed().clear();
            }
            else if(nextGameAnswer.equals(exit)){
                playAgain = false;
                System.exit(0);
            }

        }
    }
}

