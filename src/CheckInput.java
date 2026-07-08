import java.util.ArrayList;
import java.util.List;

public class CheckInput {
    public List<Character> used = new ArrayList<>();
    public CheckInput(){}

    public boolean checkKeyboardInput(String input){
        if(input.length() == 1){
            if(input.charAt(0)  >= 'а' && input.charAt(0) <= 'я'){
                if(used.contains(input.charAt(0))){
                    System.out.println("Нельзя повторно вводить одинаковые символы");
                    return false;
                }
                else {
                    used.add(input.charAt(0));
                    return true;
                }
            }
            else return false;
        }
        else return false;
    }
}
