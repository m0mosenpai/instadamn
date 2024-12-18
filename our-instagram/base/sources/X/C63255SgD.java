package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.SgD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63255SgD {
    public static volatile Handler A00;

    public static Handler A00() {
        if (A00 == null) {
            synchronized (C63255SgD.class) {
                if (A00 == null) {
                    A00 = AbstractC167007dF.A0J();
                }
            }
        }
        return A00;
    }

    public static void A01(Runnable runnable) {
        A00().postDelayed(runnable, 0L);
    }

    public static boolean A02() {
        return AbstractC167007dF.A1X(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
