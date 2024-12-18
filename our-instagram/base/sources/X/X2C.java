package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes11.dex */
public final class X2C extends CancellationException {
    public static final X2C A00 = new CancellationException();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC65885Tvp.A00);
        return this;
    }
}
