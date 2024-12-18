package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes9.dex */
public final class PWB extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
