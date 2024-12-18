package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Pvl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58460Pvl extends CancellationException {
    public C58460Pvl() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC58463Pvo.A00);
        return this;
    }
}
