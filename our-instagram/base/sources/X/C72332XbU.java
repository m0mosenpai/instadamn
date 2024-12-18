package X;

/* renamed from: X.XbU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72332XbU extends AbstractC137406Kl {
    public Object A00;
    public final InterfaceC42071wx A01;

    @Override // X.InterfaceC136006Df
    public final int EJ7(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        set(4);
        this.A00 = null;
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        lazySet(32);
        this.A00 = null;
    }

    public C72332XbU(InterfaceC42071wx interfaceC42071wx) {
        this.A01 = interfaceC42071wx;
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        return MSY.A1S(get(), 16);
    }

    @Override // X.InterfaceC136016Dg
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.A00;
        this.A00 = null;
        lazySet(32);
        return obj;
    }
}
