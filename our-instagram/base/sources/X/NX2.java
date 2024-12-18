package X;

/* loaded from: classes9.dex */
public final class NX2 extends AbstractC53536Nm3 implements InterfaceC57911PmH {
    public final OWe A00;

    @Override // X.InterfaceC57911PmH
    public final void onPaused() {
        AbstractC195978lm.A02.A01("IGPauseHandler", "onUserEvent SGMediaStreamPaused");
        OWe oWe = this.A00;
        oWe.A0B.A01.DVj(C52055N1g.A00);
        AbstractC55106ObM A01 = oWe.A01();
        if (A01 != null) {
            A01.A0D(true);
        }
    }

    public NX2(OWe oWe) {
        this.A00 = oWe;
    }
}
