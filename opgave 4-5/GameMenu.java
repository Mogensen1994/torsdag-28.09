import java.util.ArrayList;
import java.util.Scanner;
public class GameMenu {
private ArrayList<String> actions;
public GameMenu(ArrayList<String> actions){
    this.actions= actions;
}
public void displayMenu(){
    System.out.println("Menu");
    for(String action : actions){
        System.out.println(action);
    }
}
public String getAction(){
        System.out.println("choice you action by chossing a number on the list");
        displayMenu();
        Scanner scanner= new Scanner(System.in);
        String choice = scanner.nextLine();
    scanner.close();
    return choice;
    }
    
}
