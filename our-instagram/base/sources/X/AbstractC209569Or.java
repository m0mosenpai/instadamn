package X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.9Or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209569Or {
    public static final Map A00 = AbstractC166987dD.A1G();
    public static final Map A01 = AbstractC166987dD.A1G();

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        for (XOX xox : XOX.values()) {
            String replace = xox.toString().replace("_", "");
            Locale locale = Locale.US;
            A1G.put(replace.toUpperCase(locale), xox);
            A01.put(xox.toString().toUpperCase(locale), xox);
        }
        for (EnumC1825988f enumC1825988f : EnumC1825988f.values()) {
            Object obj = A1G.get(enumC1825988f.toString().toUpperCase(Locale.US));
            if (obj != null) {
                A00.put(obj, enumC1825988f);
            }
        }
    }
}
