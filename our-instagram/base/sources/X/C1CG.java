package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.1CG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CG {
    public static volatile Looper A00;

    public static final Looper A00() {
        Looper looper = A00;
        if (looper == null) {
            synchronized (C1CG.class) {
                looper = A00;
                if (looper == null) {
                    HandlerThread handlerThread = new HandlerThread("IgLooper.backgroundLooper", 9);
                    AbstractC09770fa.A00(handlerThread);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                    A00 = looper;
                }
            }
            C14360o3.A09(looper);
        }
        return looper;
    }
}
