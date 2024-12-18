package X;

import android.content.Context;

/* renamed from: X.Ky1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47472Ky1 {
    public static C47472Ky1 A01;
    public InterfaceC19630xq A00;

    /* JADX WARN: Type inference failed for: r2v2, types: [X.Ky1, java.lang.Object] */
    public static synchronized C47472Ky1 A00() {
        C47472Ky1 c47472Ky1;
        synchronized (C47472Ky1.class) {
            C47472Ky1 c47472Ky12 = A01;
            c47472Ky1 = c47472Ky12;
            if (c47472Ky12 == null) {
                Context context = AbstractC12290kX.A00;
                ?? obj = new Object();
                obj.A00 = AbstractC19750y3.A00(context, "autobackupprefs");
                A01 = obj;
                c47472Ky1 = obj;
            }
        }
        return c47472Ky1;
    }
}
