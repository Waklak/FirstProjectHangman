import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Game hangman = new Game();
        boolean playAgain = true;

        while(playAgain){
            hangman.startGame();
            System.out.println("\n\nВЫ ЗАКОНЧИЛИ ИГРУ\nхотите начать новую[N] или выйти[E]");
            String nextGameAnswer = hangman.sc.nextLine();

            while(!nextGameAnswer.equals("N") && !nextGameAnswer.equals("E")){
                System.out.println("Неправильный ввод, нужно либо N, либо E");
                nextGameAnswer = hangman.sc.nextLine();
            }
            if(nextGameAnswer.equals("N")){
                hangman.checking.used.clear();
            }
            else if(nextGameAnswer.equals("E")){
                playAgain = false;
                System.exit(0);
            }

        }
    }
}

