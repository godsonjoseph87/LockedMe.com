import com.lockedme.util.MenuOperations;

public class LockedMeMain {
    public static void main(String[] args) {
        String directoryPath = "/home/me/Documents";
        MenuOperations menu = new MenuOperations(directoryPath);
        menu.WelcomeScreen();
        menu.showMenu();
    }
}