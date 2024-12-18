package X;

/* renamed from: X.Ba8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25769Ba8 extends C2DC {
    public final long A00;
    public final InterfaceC137546La A01;
    public final InterfaceC137546La A02;

    @Override // X.C2DC
    public final void A04(InterfaceC1128857w interfaceC1128857w) {
        C14360o3.A0B(interfaceC1128857w, 0);
        long Bxc = interfaceC1128857w.Bxc();
        InterfaceC137546La interfaceC137546La = this.A01;
        long A00 = AbstractC119215ad.A00(C1H4.A01(C5YC.A02(Bxc)), C1H4.A01(C5YC.A00(Bxc)));
        long A08 = AbstractC25236BEt.A08(((C6LZ) interfaceC137546La).A00);
        C119815bf c119815bf = C119815bf.A00;
        interfaceC1128857w.AQk(null, interfaceC137546La, c119815bf, 1.0f, 3, 1, 0L, A08, 0L, A00);
        InterfaceC137546La interfaceC137546La2 = this.A02;
        interfaceC1128857w.AQk(null, interfaceC137546La2, c119815bf, 1.0f, 6, 1, 0L, AbstractC25236BEt.A08(((C6LZ) interfaceC137546La2).A00), 0L, AbstractC119215ad.A00(C1H4.A01(C5YC.A02(Bxc)), C1H4.A01(C5YC.A00(Bxc))));
    }

    @Override // X.C2DC
    public final long A03() {
        return AbstractC119215ad.A01(this.A00);
    }

    public C25769Ba8(InterfaceC137546La interfaceC137546La, InterfaceC137546La interfaceC137546La2) {
        this.A01 = interfaceC137546La;
        this.A02 = interfaceC137546La2;
        this.A00 = AbstractC25236BEt.A08(((C6LZ) interfaceC137546La).A00);
    }
}
