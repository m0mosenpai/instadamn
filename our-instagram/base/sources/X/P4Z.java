package X;

/* loaded from: classes9.dex */
public final class P4Z implements InterfaceC58153PqI {
    public final /* synthetic */ C52573NNt A00;
    public final /* synthetic */ OUJ A01;

    public P4Z(C52573NNt c52573NNt, OUJ ouj) {
        this.A00 = c52573NNt;
        this.A01 = ouj;
    }

    @Override // X.InterfaceC58153PqI
    public final void DVA() {
        C52573NNt c52573NNt = this.A00;
        ((C50992Mfz) c52573NNt.A03.getValue()).A01(MSW.A0e(c52573NNt.A04).A0V, false);
    }

    @Override // X.InterfaceC58153PqI
    public final void Dar() {
        C52573NNt c52573NNt = this.A00;
        C50992Mfz c50992Mfz = (C50992Mfz) c52573NNt.A03.getValue();
        InterfaceC09390do interfaceC09390do = c52573NNt.A04;
        c50992Mfz.A00(MSW.A0e(interfaceC09390do).A0V, false);
        C55046OZv.A00.A01(AbstractC31172DnG.A04(c52573NNt), c52573NNt.requireArguments(), c52573NNt, MSW.A0e(interfaceC09390do).A0H, c52573NNt, this.A01, MSW.A0e(interfaceC09390do).A0W);
    }

    @Override // X.InterfaceC58153PqI
    public final void onDismiss() {
        this.A00.A08(true);
    }

    @Override // X.InterfaceC58153PqI
    public final void onShow() {
        C52573NNt c52573NNt = this.A00;
        ((C50992Mfz) c52573NNt.A03.getValue()).A02(MSW.A0e(c52573NNt.A04).A0V, false);
    }
}
