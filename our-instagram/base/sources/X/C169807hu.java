package X;

/* renamed from: X.7hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169807hu implements InterfaceC169817hv {
    public final int A00;
    public final int A01;
    public final AbstractC61802rh A02;
    public final C169787hs A03;
    public final C169777hr A04;

    @Override // X.InterfaceC169817hv
    public final InterfaceC170457iy BMU(C2XE c2xe) {
        return new C170447ix(c2xe.A0C, this.A00);
    }

    @Override // X.InterfaceC169817hv
    public final int BZc() {
        return this.A00;
    }

    @Override // X.InterfaceC169817hv
    public final C169777hr BlG() {
        return this.A04;
    }

    @Override // X.InterfaceC169817hv
    public final AbstractC61802rh By2() {
        return this.A02;
    }

    public C169807hu(AbstractC61802rh abstractC61802rh, C169787hs c169787hs, C169777hr c169777hr, int i, int i2) {
        if (i == 1 && i2 != Integer.MIN_VALUE && i2 != -1 && i2 != Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
        }
        this.A00 = i;
        this.A01 = i2;
        this.A02 = abstractC61802rh;
        this.A04 = c169777hr;
        this.A03 = c169787hs;
    }
}
