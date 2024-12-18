package X;

import java.util.Arrays;

/* renamed from: X.0E2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E2 {
    public static String A00;
    public static final C0E2 A01 = new Object();
    public static volatile C0QI A02;

    public static final synchronized void A00(C0E2 c0e2, String str, Object... objArr) {
        synchronized (c0e2) {
            Object[] copyOf = Arrays.copyOf(objArr, 2);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            C14360o3.A07(format);
            android.util.Log.e("FbColdStartExperimentsLoader", format);
            if (A00 == null) {
                A00 = format;
            }
        }
    }
}
