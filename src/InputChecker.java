import java.util.ArrayList;
import java.util.List;

public class InputChecker {
    private List<Character> used = new ArrayList<>();
    public InputChecker(){}
    public List<Character> getUsed(){
        return this.used;
    }

    public boolean checkKeyboardInput(String input) throws Exception {
        if(input.length() == 1){
            if((input.charAt(0)  >= 'а' && input.charAt(0) <= 'я') || input.charAt(0) == 'ё'){
                char letter = input.charAt(0);
                return this.addUsedLetter(letter);
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }

    public boolean isLetterUsed(char letter){
        return used.contains(letter);
    }

    public boolean addUsedLetter(char letter) throws Exception {
        if(isLetterUsed(letter)){
            System.out.println("Нельзя вставлять одинаковые буквы");
            return false;
        }
        used.add(letter);
        return true;
    }
}
