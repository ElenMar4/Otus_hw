package otus_java_basic.Marchenko.ProjectWork;

import java.util.HashMap;
import java.util.Map;

public class WorkWithCurrency implements WorkWithCurrencyInterface {

    private final Map<String, String[]> currency = new HashMap<>();

    public WorkWithCurrency() {
        currency.put("rub", new String[]{"рубль", "рубля", "рублей"});
        currency.put("usd", new String[]{"доллар", "доллара", "долларов"});
        currency.put("eur", new String[]{"евро", "евро", "евро"});
    }

    public String getListCurrency() {
        StringBuilder listCurrency = new StringBuilder();
        for (String temp : currency.keySet()) {
            listCurrency.append(temp).append(" / ");
        }
        return listCurrency.toString();
    }

    public String getUserCurrency(int intValue, String userSelectCurrency) {
        String[] currencyTemp = currency.get(userSelectCurrency);
        int value = intValue/10;
        if (value % 10 == 1){
            return currencyTemp[2];
        } else {
            return (switch (intValue % 10) {
                case 1 -> currencyTemp[0];
                case 2, 3, 4 -> currencyTemp[1];
                case 5, 6, 7, 8, 9, 0 -> currencyTemp[2];
                default -> throw new IllegalStateException("Unexpected value: " + intValue % 10);
            });
        }
    }
}

