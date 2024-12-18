package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public abstract class CLX {
    public static final void A00(C12W c12w, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) c12w.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(c12w, th);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C2Ql.A01(runtimeException, th);
                th = runtimeException;
            }
        }
        AbstractC27733CLa.A00(c12w, th);
    }
}
