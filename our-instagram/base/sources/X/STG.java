package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public abstract class STG {
    public static final Handler A00 = AbstractC167007dF.A0J();

    public static void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
