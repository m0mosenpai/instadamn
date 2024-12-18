package X;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.VPq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68408VPq {
    public static final String A00(C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.Number");
        double doubleValue = ((Number) A02).doubleValue();
        int A0D = AbstractC25230BEn.A0D(c6fw.A00(), "null cannot be cast to non-null type kotlin.Number");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance(A0d));
        currencyInstance.setMinimumFractionDigits(A0D);
        return currencyInstance.format(doubleValue);
    }
}
