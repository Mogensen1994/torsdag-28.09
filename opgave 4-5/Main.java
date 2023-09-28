import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        GameMenu menu = new GameMenu(actions);
        String userChoice = menu.getAction();

        try {
            int choice = Integer.parseInt(userChoice);
            doAction(choice);
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting game now.");
                break;
            case 2:
                System.out.println("Fetching previous saved game data.");
                break;
            case 3:
                System.out.println("Game paused.");
                break;
            case 4:
                System.out.println("Ending game.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}

