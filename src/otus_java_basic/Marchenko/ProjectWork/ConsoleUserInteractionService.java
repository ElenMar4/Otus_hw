package otus_java_basic.Marchenko.ProjectWork;

import java.util.Scanner;

public class ConsoleUserInteractionService implements UserInteractionService {

    public int selectNumber() {
        System.out.println("\nenter number to change:");
        Scanner sc = new Scanner(System.in);
        int selectNumber = Integer.parseInt(sc.nextLine());
        if (selectNumber < 0){
            throw new NumberFormatException("Число должно быть >0");
        }
        return selectNumber;
    }

    public String selectCurrency(String listCurrency) {
        System.out.println("select currency: " + listCurrency);
        Scanner sc = new Scanner(System.in);
        String userSelectCurrency = sc.nextLine();
        if (userSelectCurrency.matches("^[a-zA-Z]+$")) {
            return userSelectCurrency;
        } else throw new AlphabetException("use latin words from the list");
    }

    public void outputToConsole(String convertUserNumberToString, String currencyStringOut) {
        System.out.println(convertUserNumberToString + currencyStringOut);
    }
}