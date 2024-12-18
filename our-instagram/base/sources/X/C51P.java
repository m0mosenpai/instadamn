package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.51P, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C51P {
    public static final void A00(Throwable th, InterfaceC24751Is interfaceC24751Is) {
        CancellationException cancellationException = null;
        if (th != null && (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null)) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        interfaceC24751Is.AGH(cancellationException);
    }
}
