package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.S2e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62209S2e {
    public static String A00(String str, Object... objArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                obj = "null";
            } else {
                try {
                    obj = obj.toString();
                } catch (Exception e) {
                    String A0T = AnonymousClass001.A0T(MSY.A0h(obj), AbstractC58322PtE.A0q(obj), '@');
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A0T), (Throwable) e);
                    obj = AnonymousClass001.A11("<", A0T, " threw ", MSY.A0h(e), ">");
                }
            }
            objArr[i2] = obj;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A0r = AbstractC58318PtA.A0r(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0r.append((CharSequence) str, i3, indexOf);
            A0r.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0r.append((CharSequence) str, i3, length2);
        if (i < length) {
            int A0B = AbstractC58322PtE.A0B(" [", A0r, objArr, i);
            while (A0B < length) {
                A0B = AbstractC58322PtE.A0B(", ", A0r, objArr, A0B);
            }
            A0r.append(']');
        }
        return A0r.toString();
    }
}
