package X;

import android.content.Context;

/* renamed from: X.1FO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FO {
    public static String A00;

    public static final String A01(String str) {
        C14360o3.A0B(str, 0);
        String A0g = AnonymousClass001.A0g(str, " ", A00());
        C14360o3.A07(A0g);
        return A0g;
    }

    public static final synchronized String A00() {
        String str;
        synchronized (C1FO.class) {
            str = A00;
            if (str == null) {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                str = AbstractC12270kV.A00(context);
                A00 = str;
            }
        }
        return str;
    }
}
