package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.66r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1346766r {
    public InterfaceC1346666q A00;

    public final void A00() {
        C1346566p c1346566p = (C1346566p) this.A00;
        if (c1346566p.get() != C6KP.A01) {
            try {
                c1346566p.A00.onComplete();
            } finally {
                C6KP.A01(c1346566p);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1wU, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public final void A01(InterfaceC1350869h interfaceC1350869h) {
        InterfaceC41801wU interfaceC41801wU;
        AtomicReference atomicReference = (AtomicReference) this.A00;
        ?? atomicReference2 = new AtomicReference(new C1350969i(interfaceC1350869h));
        do {
            interfaceC41801wU = (InterfaceC41801wU) atomicReference.get();
            if (interfaceC41801wU == C6KP.A01) {
                atomicReference2.dispose();
                return;
            }
        } while (!C1EM.A00(interfaceC41801wU, atomicReference2, atomicReference));
        if (interfaceC41801wU == null) {
            return;
        }
        interfaceC41801wU.dispose();
    }

    public final void A02(Object obj) {
        C1346566p c1346566p = (C1346566p) this.A00;
        if (obj == null) {
            c1346566p.A00(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (c1346566p.get() == C6KP.A01) {
                return;
            }
            c1346566p.A00.DVo(obj);
        }
    }
}
