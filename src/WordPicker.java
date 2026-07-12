import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordPicker {
    public static List<Character> chooseWord(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            //Получение случайного слова из файла
            List<String> words = new ArrayList<String>();
            Random random = new Random();
            String line ;

            while((line = br.readLine()) != null){
                words.add(line);
            }
            if(words.size() == 0){
                System.out.println("Файл не содержит слов. Игра невозможна");
                System.exit(0);
            }
            String word = words.get(random.nextInt(words.size()));
            //Преобразование его в итоговый список
            List<Character> result = new ArrayList<>();

            for(char c : word.toCharArray()){
                result.add(c);
            }
            return result;
        }
        catch (IOException e) {
            System.out.print("Ошибка при чтении файла!");
            System.exit(0);
            return null;
        }
    }
}
