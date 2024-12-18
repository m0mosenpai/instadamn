package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.TtU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65755TtU extends CancellationException {
    public C65755TtU() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC65885Tvp.A00);
        return this;
    }
}
