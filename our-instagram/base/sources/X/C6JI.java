package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6JI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JI implements InterfaceC137386Kj {
    public final AtomicReference A01 = new AtomicReference();
    public final AtomicReference A00 = new AtomicReference();

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        if (this.A00.get() != this.A01.get()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.atomic.AtomicReference, X.6JJ] */
    @Override // X.InterfaceC136016Dg
    public final boolean offer(Object obj) {
        if (obj != null) {
            ?? atomicReference = new AtomicReference();
            atomicReference.A00 = obj;
            ((AtomicReference) this.A01.getAndSet(atomicReference)).lazySet(atomicReference);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // X.InterfaceC137386Kj, X.InterfaceC136016Dg
    public final Object poll() {
        AtomicReference atomicReference = this.A00;
        AtomicReference atomicReference2 = (AtomicReference) atomicReference.get();
        C6JJ c6jj = (C6JJ) atomicReference2.get();
        if (c6jj == null) {
            if (atomicReference2 == this.A01.get()) {
                return null;
            }
            do {
                c6jj = (C6JJ) atomicReference2.get();
            } while (c6jj == null);
        }
        Object obj = c6jj.A00;
        c6jj.A00 = null;
        atomicReference.lazySet(c6jj);
        return obj;
    }

    public C6JI() {
        AtomicReference atomicReference = new AtomicReference();
        this.A00.lazySet(atomicReference);
        this.A01.getAndSet(atomicReference);
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }
}
