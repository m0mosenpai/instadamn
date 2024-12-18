package X;

import android.util.SparseArray;
import java.util.Map;

/* renamed from: X.SUe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62857SUe {
    public static final SparseArray A00 = new Q4D();
    public static final Map A01 = AbstractC166987dD.A1G();

    static {
        int i = 0;
        while (true) {
            SparseArray sparseArray = A00;
            if (i < sparseArray.size()) {
                AbstractC37301Gc2.A1T(sparseArray.valueAt(i), A01, sparseArray.keyAt(i));
                i++;
            } else {
                return;
            }
        }
    }

    public static String A00(String str) {
        if (!str.startsWith("/")) {
            try {
                return (String) A00.get(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return str;
    }
}
