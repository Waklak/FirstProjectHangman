import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        boolean playAgain = true;
        String filename = "GameWords2.txt";
        ConstructionPrint construction = new ConstructionPrint();
        CheckInput checking = new CheckInput();
        Scanner sc = new Scanner(System.in);

        while(playAgain){
            boolean curStatus = true;
            System.out.println("Игра виселица. Ты должен угадать слово по одной букве\n" +
                    "В начале тебе даётся 7 попыток\n" +
                    "После каждой неверной буквы будет рисоваться часть виселицы\n\n");

            //Выборка слова и отображение этого слова в процессе игры
            List<Character> gameWord = wordChoise(filename);
            List<Character> display = new ArrayList<>();
            for(int i = 0; i < gameWord.size(); i++){
                display.add('*');
            }
            int tryCount = 0;

            while(curStatus){
                System.out.println("Выбери букву: ");
                String input = sc.nextLine();

                //Проверяем введеное значение и присваиваем его
                while(!checking.checkKeyboardInput(input)){
                    System.out.println("Неправильный ввод, исправь");
                    input = sc.nextLine();
                }
                char letter = input.charAt(0);

                boolean answer = gameWord.contains(letter);
                if(!answer){
                    tryCount += 1;
                    construction.printConstruct(tryCount);
                    if(tryCount == 7){
                        System.out.println("Вы проиграли");
                        curStatus = false;

                    }
                }
                else{
                    System.out.println("Вы угадали букву: " + letter);
                    for(int i = 0; i < display.size(); i++){
                        if(gameWord.get(i) == letter){
                            display.set(i, letter);
                        }
                    }
                    System.out.println(display);
                    if(!display.contains('*')){
                        System.out.println("Вы победили!");
                        curStatus = false;
                    }
                }
            }
            System.out.println("\n\nВЫ ЗАКОНЧИЛИ ИГРУ\nхотите начать новую[N] или выйти[E]");
            String nextGameAnswer = sc.nextLine();
            while(!nextGameAnswer.equals("N") && !nextGameAnswer.equals("E")){
                System.out.println("Неправильный ввод, нужно либо N, либо E");
                nextGameAnswer = sc.nextLine();
            }
            if(nextGameAnswer.equals("N")){

            }
            else if(nextGameAnswer.equals("E")){
                playAgain = false;
                System.exit(0);
            }

        }
    }

    //Функция для выбора случайного слова из файла
    public static List<Character> wordChoise(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader("GameWords2.txt"))){
            //Получение случайного слова из файла
            List<String> words = new ArrayList<String>();
            Random rnd = new Random();
            while(br.readLine() != null){
                words.add(br.readLine());
            }
            String Word = words.get(rnd.nextInt(words.size()));
            //Преобразование его в итоговый список
            List<Character> res = new ArrayList<>();
            for(char c : Word.toCharArray()){
                res.add(c);
            }
            return res;
        }
        catch (IOException e) {
            System.out.print("Ошибка при чтении файла!");
            e.printStackTrace();
            return null;
        }
    }
}
