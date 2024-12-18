package X;

/* renamed from: X.U1k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66143U1k implements InterfaceC43071ya {
    public final Tx0 A00;
    public final C66137U1e A01;
    public final C66138U1f A02;

    public C66143U1k(C66137U1e c66137U1e, C66138U1f c66138U1f) {
        this.A01 = c66137U1e;
        this.A02 = c66138U1f;
        C65954Twz c65954Twz = new C65954Twz();
        c65954Twz.A09 = "empty_results";
        this.A00 = new Tx0(c65954Twz);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00 && this.A02.AHA(String.valueOf(((C69749Vuj) c59062n7.A03).A00))) {
            this.A01.A00(this.A00, null, null, "", "", "", "", null);
        }
    }
}
