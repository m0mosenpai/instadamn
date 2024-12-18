package X;

import java.util.HashMap;

/* renamed from: X.1T5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T5 {
    public static final int A00(C1T7 c1t7) {
        byte A00 = c1t7.A00();
        byte A002 = c1t7.A00();
        return (c1t7.A00() << 24) + ((c1t7.A00() & 255) << 16) + ((A002 & 255) << 8) + (A00 & 255);
    }

    public static final long A01(C1T7 c1t7) {
        long A00 = c1t7.A00();
        long A002 = c1t7.A00();
        long A003 = c1t7.A00();
        long A004 = c1t7.A00();
        long A005 = c1t7.A00();
        return (c1t7.A00() << 56) + ((c1t7.A00() & 255) << 48) + ((c1t7.A00() & 255) << 40) + ((A005 & 255) << 32) + ((A004 & 255) << 24) + ((A003 & 255) << 16) + ((A002 & 255) << 8) + (A00 & 255);
    }

    public final String A02(C1T7 c1t7) {
        int A00 = A00(c1t7);
        String str = new String(c1t7.A02, c1t7.A00, A00, C1T4.A01);
        int i = c1t7.A00 + A00;
        if (i <= c1t7.A01) {
            c1t7.A00 = i;
            return str;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final HashMap A03(C1T7 c1t7) {
        int A00 = A00(c1t7);
        HashMap hashMap = new HashMap(A00);
        for (int i = 0; i < A00; i++) {
            hashMap.put(A02(c1t7), A02(c1t7));
        }
        return hashMap;
    }
}
