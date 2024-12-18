package X;

/* renamed from: X.Ayl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24825Ayl implements Runnable {
    public final /* synthetic */ C22936A9g A00;
    public final /* synthetic */ BCS A01;
    public final /* synthetic */ AKN A02;
    public final /* synthetic */ boolean A03;

    public RunnableC24825Ayl(C22936A9g c22936A9g, BCS bcs, AKN akn, boolean z) {
        this.A02 = akn;
        this.A03 = z;
        this.A00 = c22936A9g;
        this.A01 = bcs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AKN akn = this.A02;
        akn.A0B.EGn(null);
        boolean z = this.A03;
        C23432Aa5 c23432Aa5 = akn.A09;
        C22936A9g c22936A9g = this.A00;
        BCS bcs = this.A01;
        if (z) {
            C23316AVb c23316AVb = new C23316AVb(bcs, akn);
            C22813A4g c22813A4g = new C22813A4g(bcs);
            c23432Aa5.ACs("LiteCameraController must be initialized before taking photo.");
            ((InterfaceC179997yp) c23432Aa5.A00.Aq0(InterfaceC179997yp.A00)).Eps(c22936A9g, c23316AVb, c22813A4g);
            return;
        }
        c23432Aa5.A06(c22936A9g, new C23317AVc(bcs, akn));
    }
}
