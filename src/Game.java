import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final HangmanPrinter construction = new HangmanPrinter();
    public InputChecker checking = new InputChecker();
    public Scanner sc = new Scanner(System.in);

    public void startGame() throws Exception {
        System.out.println("\n\nИгра виселица. Ты должен угадать слово по одной букве\n" +
                "В начале тебе даётся 7 попыток\n" +
                "После каждой неверной буквы будет рисоваться часть виселицы\n\n");

        String filename = "GameWords2.txt";
        List<Character> gameWord = WordPicker.chooseWord(filename);
        List<Character> display = new ArrayList<>();
        boolean curStatus = true;
        int tryCount = 0;

        for(int i = 0; i < gameWord.size(); i++){
            display.add('*');
        }

        this.printDisplayWord(display);

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
                System.out.println("Буква не подошла");
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
                this.printDisplayWord(display);
                if(!display.contains('*')){
                    System.out.println("Вы победили!");
                    curStatus = false;
                }
            }
        }
    }

    private void printDisplayWord(List<Character> charWord){
        System.out.println("Твоё слово:\n");
        for(Character character : charWord){
            System.out.print(character + " ");
        }
        System.out.println("\n\n");
    }
}
