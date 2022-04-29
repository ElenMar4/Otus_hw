package otus_java_basic.Marchenko.ProjectWork;

import java.util.Scanner;

public class WorkWithConsole implements WorkWithConsoleInterface {

    public int selectNumber() {
        System.out.println("enter number to change:");
        Scanner sc = new Scanner(System.in);
        return (Integer.parseInt(sc.nextLine()));
    }

    public String selectCurrency(String listCurrency) {
        System.out.println("select currency: " + listCurrency);
        Scanner sc = new Scanner(System.in);
        String userSelectCurrency = sc.nextLine();

        if (userSelectCurrency.matches("^[a-zA-Z]+$")) {
            return userSelectCurrency;
        } else throw new AlphabetExc("use latin words from the list");
    }

    public void stringOutConsole(String convertUserNumberToString, String currencyStringOut) {
        System.out.println(convertUserNumberToString + " " + currencyStringOut);
    }
}