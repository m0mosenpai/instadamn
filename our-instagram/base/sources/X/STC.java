package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public abstract class STC {
    public static final Handler A00 = AbstractC167007dF.A0J();

    public static final void A00(Runnable runnable) {
        if (C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
