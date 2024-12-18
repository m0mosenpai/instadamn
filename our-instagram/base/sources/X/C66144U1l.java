package X;

/* renamed from: X.U1l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66144U1l implements InterfaceC43071ya {
    public final C66137U1e A00;
    public final C66138U1f A01;

    public C66144U1l(C66137U1e c66137U1e, C66138U1f c66138U1f) {
        this.A00 = c66137U1e;
        this.A01 = c66138U1f;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
            C66138U1f c66138U1f = this.A01;
            String str = ((C70789Wh2) c59062n7.A03).A01;
            if (c66138U1f.AHA(str)) {
                C66137U1e c66137U1e = this.A00;
                Object obj = c59062n7.A04;
                C14360o3.A06(obj);
                c66137U1e.A00((Tx0) obj, null, null, "KEYWORD", "", str, "", null);
            }
        }
    }
}
