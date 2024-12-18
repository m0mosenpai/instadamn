package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.PUq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57101PUq implements InterfaceC16660sJ {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03 = AtomicIntegerFieldUpdater.newUpdater(C57101PUq.class, "_state$volatile");
    public C19D A00;
    public final Thread A01 = Thread.currentThread();
    public final AnonymousClass195 A02;
    public volatile /* synthetic */ int _state$volatile;

    public final void A00() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A03;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    }
                    throw AbstractC31175DnJ.A0U("Illegal state ", i);
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                C19D c19d = this.A00;
                if (c19d == null) {
                    return;
                }
                c19d.dispose();
                return;
            }
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A03;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    throw AbstractC31175DnJ.A0U("Illegal state ", i);
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 2)) {
                this.A01.interrupt();
                atomicIntegerFieldUpdater.set(this, 3);
                break;
            }
        }
        return C0eB.A00;
    }

    public C57101PUq(AnonymousClass195 anonymousClass195) {
        this.A02 = anonymousClass195;
    }
}
