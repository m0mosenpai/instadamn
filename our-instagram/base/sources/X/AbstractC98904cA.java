package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.4cA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC98904cA {
    public static C4C7 A00(C4B0 c4b0, C4BB c4bb, C4C6 c4c6, String str, int i) {
        Map emptyMap = Collections.emptyMap();
        android.net.Uri A00 = c4b0.A00(str);
        long j = c4b0.A02;
        long j2 = c4b0.A01;
        String A02 = c4bb.A02();
        if (A02 == null) {
            A02 = c4b0.A00(((C92134At) c4bb.A04.get(0)).A03).toString();
        }
        C4B8.A02(A00);
        return new C4C7(A00, c4c6, A02, emptyMap, null, 1, i, 0L, j, j2);
    }
}
