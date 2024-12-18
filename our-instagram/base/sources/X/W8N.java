package X;

import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class W8N {
    public static final AtomicReference A00 = new AtomicReference();

    public static void A00(boolean z) {
        AtomicReference atomicReference = A00;
        if (atomicReference.get() == null || z) {
            synchronized (W8N.class) {
                if (atomicReference.get() == null || z) {
                    HandlerThread handlerThread = new HandlerThread("HeroPlayerSharedThread", -2);
                    AbstractC09770fa.A00(handlerThread);
                    handlerThread.start();
                    handlerThread.getLooper();
                    atomicReference.set(handlerThread);
                }
            }
        }
    }
}
