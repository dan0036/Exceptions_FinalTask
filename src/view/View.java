package view;

import java.util.Scanner;

public class View {
    public String input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a string, consisting of: \n" +
                "Last First Surname, birthdate (dd.mm.yyyy), \n" +
                "phone # (11dig), sex(m/f), \n" +
                "separated by commas,");
        return scan.nextLine();
    }
}
