package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XNu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72100XNu extends C6DA {
    public final InterfaceC42061ww A00;
    public final InterfaceC42061ww A01;
    public final AtomicReference A02;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        this.A00.EpF(interfaceC42071wx);
    }

    @Override // X.C6DA
    public final void A03(C6DH c6dh) {
        C72059XMb c72059XMb;
        while (true) {
            AtomicReference atomicReference = this.A02;
            c72059XMb = (C72059XMb) atomicReference.get();
            if (c72059XMb != null && c72059XMb.A02.get() != C72059XMb.A05) {
                break;
            }
            C72059XMb c72059XMb2 = new C72059XMb(atomicReference);
            if (C1EM.A00(c72059XMb, c72059XMb2, atomicReference)) {
                c72059XMb = c72059XMb2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = c72059XMb.A00;
        boolean z = true;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            z = false;
        }
        try {
            c6dh.accept(c72059XMb);
            if (z) {
                this.A01.EpF(c72059XMb);
            }
        } catch (Throwable th) {
            AbstractC62281S5a.A00(th);
            throw Y4X.A00(th);
        }
    }

    public C72100XNu(InterfaceC42061ww interfaceC42061ww, InterfaceC42061ww interfaceC42061ww2, AtomicReference atomicReference) {
        this.A00 = interfaceC42061ww;
        this.A01 = interfaceC42061ww2;
        this.A02 = atomicReference;
    }
}
