public class ConstructionPrint {

    public void printConstruct(int n){
        switch(n){
            case 1:
                System.out.println("|\n|\n|\n|\n|\n|\n|\n");
                System.out.println("Осталось 6 попыток");
                break;
            case 2:
                System.out.println("----------------");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.println("Осталось 5 попыток");
                break;
            case 3:
                System.out.println("--------|--------");
                System.out.print("|       |");
                System.out.print("\n|       |");
                System.out.print("\n|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.println("Осталось 4 попытки");
                break;
            case 4:
                System.out.println("--------|--------");
                System.out.print("|       |");
                System.out.print("\n|       |");
                System.out.print("\n|       ○\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.println("Осталось 3 попытки");
                break;
            case 5:
                System.out.println("--------|--------");
                System.out.print("|       |");
                System.out.print("\n|       |");
                System.out.print("\n|       ○\n");
                System.out.print("|       ◊\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.println("Осталось 2 попытки");
                break;
            case 6:
                System.out.println("--------|--------");
                System.out.print("|       |");
                System.out.print("\n|       |");
                System.out.print("\n|       ○\n");
                System.out.print("|     /-◊-\\ \n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.println("Осталось 1 попытка");
                break;
            case 7:
                System.out.println("--------|--------");
                System.out.print("|       |");
                System.out.print("\n|       |");
                System.out.print("\n|       ○\n");
                System.out.print("|     /-◊-\\ \n");
                System.out.print("|      /\\\n");
                System.out.print("|\n");
                System.out.print("|\n");
                System.out.print("|\n");
                break;
        }
    }
    public ConstructionPrint(){}
}
