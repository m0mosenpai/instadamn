package X;

/* loaded from: classes5.dex */
public final class D1H implements Runnable {
    public final /* synthetic */ C26831Bst A00;

    public D1H(C26831Bst c26831Bst) {
        this.A00 = c26831Bst;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26831Bst c26831Bst = this.A00;
        C26829Bsr c26829Bsr = c26831Bst.A02;
        String str = "headerFragment";
        if (c26829Bsr != null) {
            c26829Bsr.A00(c26831Bst.A0H);
            C26829Bsr c26829Bsr2 = c26831Bst.A02;
            if (c26829Bsr2 != null) {
                c26829Bsr2.A00 = c26831Bst;
                C26732BrD c26732BrD = c26831Bst.A00;
                str = "ctaFragment";
                if (c26732BrD != null) {
                    C05A c05a = c26831Bst.A0G;
                    C14360o3.A0B(c05a, 0);
                    C25830Bbl c25830Bbl = (C25830Bbl) c26732BrD.A03.getValue();
                    InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(c25830Bbl.A00);
                    c25830Bbl.A00 = AbstractC25226BEj.A1L(new C57156PZa(c25830Bbl, c05a, A0s, 34), AbstractC141776au.A00(c25830Bbl));
                    C26732BrD c26732BrD2 = c26831Bst.A00;
                    if (c26732BrD2 != null) {
                        c26732BrD2.A02 = c26831Bst;
                        C26837Bsz c26837Bsz = c26831Bst.A01;
                        str = "gridFragment";
                        if (c26837Bsz != null) {
                            c26837Bsz.A00(((C25833Bbo) c26831Bst.A0F.getValue()).A03);
                            C26837Bsz c26837Bsz2 = c26831Bst.A01;
                            if (c26837Bsz2 != null) {
                                ((C25831Bbm) c26837Bsz2.A0D.getValue()).A00 = new C29111Csc(c26831Bst);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
