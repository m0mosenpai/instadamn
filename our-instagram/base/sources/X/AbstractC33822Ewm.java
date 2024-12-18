package X;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.Ewm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33822Ewm {
    public static final String A00(C6FW c6fw) {
        String format;
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, A0f);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance((String) A03));
        String A00 = new C11L("\\D").A00((String) A032, "");
        if (A00.length() <= 0) {
            A00 = "0";
        }
        double parseDouble = Double.parseDouble(A00) / Math.pow(10.0d, currencyInstance.getCurrency().getDefaultFractionDigits());
        if (parseDouble > 0.0d) {
            format = currencyInstance.format(parseDouble);
        } else {
            format = currencyInstance.format(0.0d);
        }
        if (parseDouble > 2.147483646E9d) {
            return AbstractC25227BEk.A0w(format, 0, format.length() - 1);
        }
        return format;
    }
}
