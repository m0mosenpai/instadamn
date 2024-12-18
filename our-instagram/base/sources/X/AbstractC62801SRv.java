package X;

import java.util.HashMap;

/* renamed from: X.SRv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62801SRv {
    public static String A00(long j) {
        return AbstractC58318PtA.A0k("%.3f", new Object[]{AbstractC37302Gc3.A0S(j)});
    }

    public static HashMap A01(String... strArr) {
        int length = strArr.length;
        if (length % 2 == 0) {
            HashMap A1G = AbstractC166987dD.A1G();
            for (int i = 0; i < length; i += 2) {
                String str = strArr[i];
                if (str == null) {
                    str = "";
                }
                String str2 = strArr[i + 1];
                if (str2 == null) {
                    str2 = "";
                }
                A1G.put(str, str2);
            }
            return A1G;
        }
        throw AbstractC166987dD.A12("Map must have an even (or zero) number of parameters");
    }
}
