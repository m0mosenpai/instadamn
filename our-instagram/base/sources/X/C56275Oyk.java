package X;

/* renamed from: X.Oyk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56275Oyk implements InterfaceC58112Ppb {
    public final /* synthetic */ OXA A00;

    public C56275Oyk(OXA oxa) {
        this.A00 = oxa;
    }

    @Override // X.InterfaceC58112Ppb
    public final Integer BWJ() {
        return C05F.A01;
    }

    @Override // X.InterfaceC58112Ppb
    public final void D01() {
        C50968Mfb c50968Mfb = this.A00.A07;
        if (c50968Mfb.A00 != null) {
            c50968Mfb.A02.F8s(new Object());
            c50968Mfb.A00 = null;
            c50968Mfb.A01 = "";
        }
    }

    @Override // X.InterfaceC58112Ppb
    public final String getTitle() {
        OXA oxa = this.A00;
        return oxa.A07.A00(oxa.A04);
    }
}
