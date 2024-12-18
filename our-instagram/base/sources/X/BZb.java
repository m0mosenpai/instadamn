package X;

/* loaded from: classes5.dex */
public final class BZb extends C6KS implements InterfaceC30984Djg {
    public static final InterfaceC16620sF A03 = DZN.A00;
    public boolean A00;
    public final C28277CdM A01 = new C28277CdM(this);
    public final C6Nv A02 = new C6Nv();

    @Override // X.InterfaceC30984Djg
    public final void CgI(Object obj, Object obj2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE) {
        DRS drs;
        C6Nv c6Nv = this.A02;
        if (obj != null) {
            drs = DRS.A00(obj, 37);
        } else {
            drs = null;
        }
        c6Nv.A01(1, new C28758Cmq(drs, DRS.A00(null, 38), new C30193DRy(interfaceC16660sJ, 7), C5UA.A04(new C30750Dfn(interfaceC16610sE, 0), -34608120, true)));
        this.A00 = true;
    }

    @Override // X.InterfaceC30984Djg
    public final void CgP(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16600sD interfaceC16600sD, int i) {
        this.A02.A01(i, new C28758Cmq(interfaceC16660sJ, interfaceC16660sJ2, A03, interfaceC16600sD));
    }

    public BZb(InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC16660sJ.invoke(this);
    }

    @Override // X.C6KS
    public final /* bridge */ /* synthetic */ InterfaceC138166Nw A00() {
        return this.A02;
    }
}
