package X;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class CJ6 {
    public static final ArrayList A00(String str) {
        C17320tT A01 = AbstractC19750y3.A01(C1AV.A1V.toString());
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 0;
        do {
            String string = A01.getString(AnonymousClass001.A0W("switcher_overflow_recent_search_", str, '_', i), null);
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                A1E.add(string);
            }
            i++;
        } while (i < 3);
        return A1E;
    }
}
