package X;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.Vyw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69979Vyw {
    public static Long A00(String str) {
        long parseLong;
        String replaceAll = str.replaceAll("\\D", "");
        if (replaceAll.equals("")) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(replaceAll);
        }
        return Long.valueOf(parseLong);
    }

    public static String A01(Double d, Currency currency, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(0);
        currencyInstance.setMinimumFractionDigits(0);
        return currencyInstance.format(d).trim();
    }
}
