package X;

/* renamed from: X.GFc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36682GFc implements InterfaceC169507hQ {
    public final /* synthetic */ EVU A00;
    public final /* synthetic */ FMW A01;

    public C36682GFc(EVU evu, FMW fmw) {
        this.A00 = evu;
        this.A01 = fmw;
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        EVU evu = this.A00;
        EVU.A0D(evu, interfaceC169517hR.B3l(), interfaceC169517hR.BC6());
        FMW fmw = this.A01;
        String BjQ = interfaceC169517hR.BjQ();
        if (BjQ != null && !BjQ.isEmpty()) {
            fmw.A02 = false;
            fmw.A00 = null;
        } else {
            fmw.A03 = false;
            fmw.A00 = null;
            fmw.A02 = false;
            fmw.A00 = null;
            EVU.A0C(evu, EVU.A03(evu, interfaceC169517hR), evu.A0M(), EVU.A05(evu, AbstractC31171DnF.A0m(interfaceC169517hR)), false);
        }
        evu.A0I = interfaceC169517hR.Bo9();
    }
}
