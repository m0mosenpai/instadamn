package X;

/* renamed from: X.ArK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24377ArK implements Runnable {
    public final /* synthetic */ C23630AdP A00;

    public RunnableC24377ArK(C23630AdP c23630AdP) {
        this.A00 = c23630AdP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C194808jg c194808jg;
        C66646URk A00;
        C23630AdP c23630AdP = this.A00;
        if (c23630AdP.A00 == null) {
            C23630AdP.A01(c23630AdP);
        }
        C23630AdP.A06(c23630AdP);
        C23630AdP.A05(c23630AdP);
        InterfaceC25221BDv interfaceC25221BDv = c23630AdP.A06;
        if (interfaceC25221BDv != null) {
            interfaceC25221BDv.F8C(c23630AdP.A0F);
        }
        if (!c23630AdP.A0B && (c194808jg = c23630AdP.A04) != null && (A00 = AbstractC226589zG.A00(c194808jg)) != null) {
            c23630AdP.A0N.A1K(A00);
        }
    }
}
