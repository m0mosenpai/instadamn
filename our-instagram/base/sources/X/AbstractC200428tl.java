package X;

/* renamed from: X.8tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC200428tl implements InterfaceC200438tm {
    @Override // X.InterfaceC200438tm
    public final long AXs() {
        if (this instanceof C201928wP) {
            return ((C201928wP) this).A04;
        }
        if (this instanceof C214209eK) {
            return ((C214209eK) this).A02;
        }
        if (this instanceof C214179eH) {
            return Long.MAX_VALUE;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final int BD2() {
        if (this instanceof C201898wM) {
            return ((C201898wM) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm BWn() {
        if (this instanceof C201898wM) {
            return ((C201898wM) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm BWu() {
        if (this instanceof C214179eH) {
            return ((C214179eH) this).A00;
        }
        if (this instanceof C201928wP) {
            return ((C201928wP) this).A00;
        }
        if (this instanceof C214209eK) {
            return ((C214209eK) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm BWv() {
        if (this instanceof C200418tk) {
            return ((C200418tk) this).A00;
        }
        if (this instanceof C201888wL) {
            return ((C201888wL) this).A00;
        }
        if (this instanceof C201928wP) {
            return ((C201928wP) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm Bg2() {
        if (this instanceof C201928wP) {
            return ((C201928wP) this).A02;
        }
        if (this instanceof C214179eH) {
            return ((C214179eH) this).A01;
        }
        if (this instanceof C214209eK) {
            return ((C214209eK) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200438tm Bg3() {
        if (this instanceof C200418tk) {
            return ((C200418tk) this).A01;
        }
        if (this instanceof C201888wL) {
            return ((C201888wL) this).A01;
        }
        if (this instanceof C201928wP) {
            return ((C201928wP) this).A03;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final InterfaceC200208tP CEZ() {
        if (this instanceof C201898wM) {
            return ((C201898wM) this).A03;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final long CHz() {
        if (this instanceof C201888wL) {
            return ((C201888wL) this).A02;
        }
        if (this instanceof C201928wP) {
            return ((C201928wP) this).A05;
        }
        if (this instanceof C200418tk) {
            return Long.MAX_VALUE;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final void EP8(long time) {
        if (this instanceof C201928wP) {
            ((C201928wP) this).A04 = time;
        } else if (this instanceof C214209eK) {
            ((C214209eK) this).A02 = time;
        } else if (this instanceof C214179eH) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EZe(InterfaceC200438tm next) {
        if (this instanceof C214179eH) {
            ((C214179eH) this).A00 = next;
        } else if (this instanceof C201928wP) {
            ((C201928wP) this).A00 = next;
        } else {
            if (this instanceof C214209eK) {
                ((C214209eK) this).A00 = next;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EZf(InterfaceC200438tm next) {
        if (this instanceof C201888wL) {
            ((C201888wL) this).A00 = next;
        } else if (this instanceof C200418tk) {
            ((C200418tk) this).A00 = next;
        } else {
            if (this instanceof C201928wP) {
                ((C201928wP) this).A01 = next;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EbU(InterfaceC200438tm previous) {
        if (this instanceof C214179eH) {
            ((C214179eH) this).A01 = previous;
        } else if (this instanceof C201928wP) {
            ((C201928wP) this).A02 = previous;
        } else {
            if (this instanceof C214209eK) {
                ((C214209eK) this).A01 = previous;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void EbV(InterfaceC200438tm previous) {
        if (this instanceof C201888wL) {
            ((C201888wL) this).A01 = previous;
        } else if (this instanceof C200418tk) {
            ((C200418tk) this).A01 = previous;
        } else {
            if (this instanceof C201928wP) {
                ((C201928wP) this).A03 = previous;
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final void Egk(InterfaceC200208tP valueReference) {
        if (this instanceof C201898wM) {
            ((C201898wM) this).A03 = valueReference;
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC200438tm
    public final void EhQ(long time) {
        if (this instanceof C201928wP) {
            ((C201928wP) this).A05 = time;
        } else if (this instanceof C201888wL) {
            ((C201888wL) this).A02 = time;
        } else if (this instanceof C200418tk) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.InterfaceC200438tm
    public final Object getKey() {
        if (this instanceof C201898wM) {
            return ((C201898wM) this).A02;
        }
        throw new UnsupportedOperationException();
    }
}
