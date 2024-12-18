package X;

/* loaded from: classes5.dex */
public final class BZS extends C122485gj {
    public InterfaceC16660sJ A00;
    public boolean A01;
    public final InterfaceC16820sZ A02;

    public BZS(InterfaceC118065Vq interfaceC118065Vq, C5XO c5xo, C5XQ c5xq, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(interfaceC118065Vq, c5xo, c5xq, null, new C50168MDv(2, interfaceC16660sJ, z), z2);
        this.A01 = z;
        this.A00 = interfaceC16660sJ;
        this.A02 = new DGT(this, 24);
    }

    @Override // X.AbstractC114345Dz
    public final void A0K(InterfaceC113515Ao interfaceC113515Ao) {
        C6OT c6ot;
        if (this.A01) {
            c6ot = C6OT.On;
        } else {
            c6ot = C6OT.Off;
        }
        interfaceC113515Ao.EOx(AbstractC113545Ar.A0U, c6ot);
    }
}
