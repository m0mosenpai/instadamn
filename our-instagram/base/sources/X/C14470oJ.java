package X;

import android.content.Context;

/* renamed from: X.0oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14470oJ {
    public static Long A00;

    public static synchronized long A00(Context context) {
        long longValue;
        synchronized (C14470oJ.class) {
            Long l = A00;
            if (l == null) {
                C15900qk.A01();
                l = Long.valueOf(C15900qk.A00(context, true));
                A00 = l;
            }
            longValue = l.longValue();
        }
        return longValue;
    }
}
