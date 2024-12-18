package X;

/* loaded from: classes4.dex */
public final class AYI implements InterfaceC169817hv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AbstractC61802rh A03;
    public final C225139wc A04;
    public final C169777hr A05;

    @Override // X.InterfaceC169817hv
    public final InterfaceC170457iy BMU(C2XE c2xe) {
        return new AYM(c2xe.A0C, this.A02, this.A00);
    }

    @Override // X.InterfaceC169817hv
    public final int BZc() {
        return this.A00;
    }

    @Override // X.InterfaceC169817hv
    public final C169777hr BlG() {
        return this.A05;
    }

    @Override // X.InterfaceC169817hv
    public final AbstractC61802rh By2() {
        return this.A03;
    }

    public AYI(AbstractC61802rh abstractC61802rh, C225139wc c225139wc, C169777hr c169777hr, int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A05 = c169777hr;
        this.A04 = c225139wc;
        this.A01 = i3;
        this.A03 = abstractC61802rh;
    }
}
