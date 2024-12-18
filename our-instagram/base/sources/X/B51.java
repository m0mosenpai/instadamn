package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class B51 extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public B51() {
        super("Mutation interrupted");
    }
}
