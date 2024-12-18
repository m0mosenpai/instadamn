package X;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.CLa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27733CLa {
    public static final void A00(C12W c12w, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC54354O0m.A00.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(c12w, th);
            } catch (RkE unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C2Ql.A01(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            C2Ql.A01(th, new D3R(c12w));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
