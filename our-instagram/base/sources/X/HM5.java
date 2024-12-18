package X;

/* loaded from: classes7.dex */
public final class HM5 extends AbstractC49521Lua {
    public final /* synthetic */ InterfaceC678133v A00;
    public final /* synthetic */ C38511GwW A01;
    public final /* synthetic */ C38337GtX A02;
    public final /* synthetic */ HYM A03;

    public HM5(InterfaceC678133v interfaceC678133v, C38511GwW c38511GwW, C38337GtX c38337GtX, HYM hym) {
        this.A00 = interfaceC678133v;
        this.A02 = c38337GtX;
        this.A01 = c38511GwW;
        this.A03 = hym;
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPlayTimeUpdated(int i) {
        InterfaceC678133v interfaceC678133v = this.A00;
        int A00 = AbstractC40750I4e.A00(interfaceC678133v.Azm(), 30000, this.A03.A0C);
        float min = (i - A00) / Math.min(30000, interfaceC678133v.Azm() - A00);
        if (min >= 1.0f) {
            interfaceC678133v.EJa(false);
        } else {
            this.A01.A0C.setProgress(min);
        }
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackPrepared(int i) {
        HYM hym = this.A03;
        int A00 = AbstractC40750I4e.A00(i, 30000, hym.A0C);
        InterfaceC678133v interfaceC678133v = this.A00;
        interfaceC678133v.seekTo(A00);
        interfaceC678133v.E4S();
        C38337GtX c38337GtX = this.A02;
        C38337GtX.A00(hym.A02, this.A01, c38337GtX);
    }

    @Override // X.AbstractC49521Lua, X.InterfaceC150336ph
    public final void onCurrentTrackStopped() {
        this.A00.AHi();
        C38337GtX c38337GtX = this.A02;
        C38337GtX.A00(this.A03.A02, this.A01, c38337GtX);
    }
}
