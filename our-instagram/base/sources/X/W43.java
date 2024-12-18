package X;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class W43 {
    public static final W43 A00 = new Object();
    public static final ImmutableSet A01;

    public final String A00(String str, BigDecimal bigDecimal) {
        int length = str.length();
        if (AbstractC167007dF.A1P(length, 3)) {
            C2FP.A08();
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(C1Q2.A02());
            currencyInstance.setCurrency(Currency.getInstance(str));
            char minusSign = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getMinusSign();
            String format = currencyInstance.format(bigDecimal);
            C14360o3.A07(format);
            String A1A = AbstractC25228BEl.A1A(format);
            if (AbstractC002300n.A0h(A1A, "(", false) && AbstractC002300n.A0f(A1A, ")", false)) {
                return AnonymousClass001.A0D(AbstractC002300n.A0d(AbstractC002300n.A0d(A1A, "(", "", false), ")", "", false), minusSign);
            }
            return A1A;
        }
        throw new IllegalArgumentException(Strings.A00("Invalid currency length: %d for currencyCode: %s", Integer.valueOf(length), str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.W43] */
    static {
        ImmutableSet A002 = ImmutableSet.A00(new Locale("ar", "AR"), new Locale("he", "IL"));
        C14360o3.A07(A002);
        A01 = A002;
    }
}
