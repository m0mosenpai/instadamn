package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.10C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10C extends CancellationException {
    public final transient Object A00;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C10C(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.A00 = obj;
    }
}
