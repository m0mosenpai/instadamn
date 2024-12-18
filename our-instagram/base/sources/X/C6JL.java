package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6JL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JL extends AtomicReference implements C6JM {
    public int A00;
    public C6JN A01;
    public final int A02;

    public C6JL(int i) {
        this();
        this.A02 = 1;
    }

    @Override // X.C6JM
    public final void EH6(C6JO c6jo) {
        if (c6jo.getAndIncrement() == 0) {
            int i = 1;
            do {
                AtomicReference atomicReference = (AtomicReference) c6jo.A00;
                if (atomicReference == null) {
                    atomicReference = (AtomicReference) get();
                    c6jo.A00 = atomicReference;
                }
                while (!c6jo.A03) {
                    C6JN c6jn = (C6JN) atomicReference.get();
                    if (c6jn != null) {
                        if (EnumC42671xv.A00(c6jo.A01, c6jn.A00)) {
                            c6jo.A00 = null;
                            return;
                        }
                        atomicReference = c6jn;
                    } else {
                        c6jo.A00 = atomicReference;
                        i = c6jo.addAndGet(-i);
                    }
                }
                return;
            } while (i != 0);
        }
    }

    public C6JL() {
        C6JN c6jn = new C6JN(null);
        this.A01 = c6jn;
        set(c6jn);
    }
}
