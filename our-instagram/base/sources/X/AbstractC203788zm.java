package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.8zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203788zm {
    public static final void A00(Handler handler, Runnable runnable) {
        Looper looper;
        if (handler != null) {
            looper = handler.getLooper();
        } else {
            looper = null;
        }
        if (!C14360o3.A0K(looper, Looper.getMainLooper()) && handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            runnable.run();
        }
    }
}
