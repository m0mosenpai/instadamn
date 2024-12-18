package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.66p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1346566p extends AtomicReference implements InterfaceC41801wU, InterfaceC1346666q {
    public final InterfaceC42071wx A00;

    public C1346566p(InterfaceC42071wx interfaceC42071wx) {
        this.A00 = interfaceC42071wx;
    }

    public final void A00(Throwable th) {
        if (get() == C6KP.A01) {
            AbstractC142886co.A02(th);
            return;
        }
        try {
            this.A00.onError(th);
        } finally {
            C6KP.A01(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        C6KP.A01(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
