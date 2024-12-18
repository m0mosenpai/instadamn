package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.B4i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C25008B4i extends WeakReference implements InterfaceC200438tm {
    public final int A00;
    public final InterfaceC200438tm A01;
    public volatile InterfaceC200208tP A02;

    @Override // X.InterfaceC200438tm
    public final long AXs() {
        if (this instanceof C214249eO) {
            return ((C214249eO) this).A04;
        }
        if (this instanceof C214229eM) {
            return ((C214229eM) this).A02;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final int BD2() {
        return this.A00;
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm BWn() {
        return this.A01;
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm BWu() {
        if (this instanceof C214249eO) {
            return ((C214249eO) this).A00;
        }
        if (this instanceof C214229eM) {
            return ((C214229eM) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm BWv() {
        if (this instanceof C214239eN) {
            return ((C214239eN) this).A00;
        }
        if (this instanceof C214249eO) {
            return ((C214249eO) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm Bg2() {
        if (this instanceof C214249eO) {
            return ((C214249eO) this).A02;
        }
        if (this instanceof C214229eM) {
            return ((C214229eM) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm Bg3() {
        if (this instanceof C214239eN) {
            return ((C214239eN) this).A01;
        }
        if (this instanceof C214249eO) {
            return ((C214249eO) this).A03;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200208tP CEZ() {
        return this.A02;
    }

    @Override // X.InterfaceC200438tm
    public final long CHz() {
        if (this instanceof C214239eN) {
            return ((C214239eN) this).A02;
        }
        if (this instanceof C214249eO) {
            return ((C214249eO) this).A05;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final void EP8(long time) {
        if (this instanceof C214249eO) {
            ((C214249eO) this).A04 = time;
        } else {
            if (this instanceof C214229eM) {
                ((C214229eM) this).A02 = time;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EZe(InterfaceC200438tm next) {
        if (this instanceof C214249eO) {
            ((C214249eO) this).A00 = next;
        } else {
            if (this instanceof C214229eM) {
                ((C214229eM) this).A00 = next;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EZf(InterfaceC200438tm next) {
        if (this instanceof C214239eN) {
            ((C214239eN) this).A00 = next;
        } else {
            if (this instanceof C214249eO) {
                ((C214249eO) this).A01 = next;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EbU(InterfaceC200438tm previous) {
        if (this instanceof C214249eO) {
            ((C214249eO) this).A02 = previous;
        } else {
            if (this instanceof C214229eM) {
                ((C214229eM) this).A01 = previous;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EbV(InterfaceC200438tm previous) {
        if (this instanceof C214239eN) {
            ((C214239eN) this).A01 = previous;
        } else {
            if (this instanceof C214249eO) {
                ((C214249eO) this).A03 = previous;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EhQ(long time) {
        if (this instanceof C214239eN) {
            ((C214239eN) this).A02 = time;
        } else {
            if (this instanceof C214249eO) {
                ((C214249eO) this).A05 = time;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    public C25008B4i(InterfaceC200438tm queue, Object key, ReferenceQueue hash, int next) {
        super(key, hash);
        this.A02 = ConcurrentMapC200188tN.A0L;
        this.A00 = next;
        this.A01 = queue;
    }

    @Override // X.InterfaceC200438tm
    public final void Egk(InterfaceC200208tP valueReference) {
        this.A02 = valueReference;
    }

    @Override // X.InterfaceC200438tm
    public final Object getKey() {
        return get();
    }
}
