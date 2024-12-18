package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.14H, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C14H {
    public static C14H A00;
    public static InterfaceC09390do A01;
    public static boolean A02;
    public static final C14I A03 = new Object();

    public abstract Intent A02(Context context, int i);

    public abstract Intent A03(Context context, int i);

    public abstract Intent A04(Context context, android.net.Uri uri);

    public static final synchronized C14H A00() {
        C14H A002;
        synchronized (C14H.class) {
            A002 = A03.A00();
        }
        return A002;
    }

    public final Intent A01(Context context) {
        return A03(context, 335544320);
    }
}
