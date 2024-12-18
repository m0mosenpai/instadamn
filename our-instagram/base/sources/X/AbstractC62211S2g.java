package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.S2g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62211S2g {
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
                    String A0h = MSY.A0h(obj);
                    String A0q = AbstractC58322PtE.A0q(obj);
                    StringBuilder A0r = AbstractC58318PtA.A0r(AbstractC58319PtB.A05(A0h) + 1, AbstractC58319PtB.A05(A0q));
                    A0r.append(A0h);
                    A0r.append('@');
                    String A0x = AbstractC166997dE.A0x(A0q, A0r);
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    int length2 = A0x.length();
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", AbstractC58320PtC.A0w(length2, "Exception during lenientFormat for ", A0x), (Throwable) e);
                    String A0h2 = MSY.A0h(e);
                    StringBuilder A0r2 = AbstractC58318PtA.A0r(length2 + 9, AbstractC58319PtB.A05(A0h2));
                    A0r2.append("<");
                    A0r2.append(A0x);
                    A0r2.append(" threw ");
                    A0r2.append(A0h2);
                    obj = AbstractC166997dE.A0x(">", A0r2);
                }
            }
            objArr[i2] = obj;
            i2++;
        }
        int length3 = str.length();
        StringBuilder A0r3 = AbstractC58318PtA.A0r(length3, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0r3.append((CharSequence) str, i3, indexOf);
            A0r3.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0r3.append((CharSequence) str, i3, length3);
        if (i < length) {
            int A0B = AbstractC58322PtE.A0B(" [", A0r3, objArr, i);
            while (A0B < length) {
                A0B = AbstractC58322PtE.A0B(", ", A0r3, objArr, A0B);
            }
            A0r3.append(']');
        }
        return A0r3.toString();
    }
}
