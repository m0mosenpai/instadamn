package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6MD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MD {
    public final AtomicReference A00 = new AtomicReference(null);
    public final AnonymousClass139 A01 = new AnonymousClass139();

    public static final void A00(C9HI c9hi, C6MD c6md) {
        AtomicReference atomicReference;
        C9HI c9hi2;
        do {
            atomicReference = c6md.A00;
            c9hi2 = (C9HI) atomicReference.get();
            if (c9hi2 != null && c9hi.A00.compareTo(c9hi2.A00) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C1EM.A00(c9hi2, c9hi, atomicReference));
        if (c9hi2 != null) {
            c9hi2.A01.AGH(new CancellationException() { // from class: X.9HM
                @Override // java.lang.Throwable
                public final Throwable fillInStackTrace() {
                    setStackTrace(new StackTraceElement[0]);
                    return this;
                }
            });
        }
    }
}
