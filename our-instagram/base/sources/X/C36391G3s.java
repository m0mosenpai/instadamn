package X;

/* renamed from: X.G3s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36391G3s implements JH1 {
    public final int A00;
    public final Object A01;

    public C36391G3s(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JH1
    public final void DGi() {
        if (this.A00 == 0) {
            C32282EJt c32282EJt = (C32282EJt) this.A01;
            C31892Dzy c31892Dzy = c32282EJt.A01;
            c31892Dzy.A01 = false;
            c31892Dzy.notifyDataSetChanged();
            c32282EJt.A06 = false;
            c32282EJt.A08 = true;
        }
    }

    @Override // X.JH1
    public final void DVY(C35003Fba c35003Fba) {
        if (this.A00 != 0) {
            C14360o3.A0B(c35003Fba, 0);
            C32314ELd c32314ELd = (C32314ELd) this.A01;
            c32314ELd.A0f = AbstractC166987dD.A1b(AbstractC31172DnG.A19(c35003Fba.A04));
            C32314ELd.A0C(c32314ELd);
            return;
        }
        C32282EJt c32282EJt = (C32282EJt) this.A01;
        C32282EJt.A02(c32282EJt, c35003Fba);
        C31892Dzy c31892Dzy = c32282EJt.A01;
        c31892Dzy.A01 = false;
        c31892Dzy.notifyDataSetChanged();
        c32282EJt.A06 = false;
        c32282EJt.A08 = false;
        c32282EJt.A02.getClass();
        AbstractC25651Mw.A00(c32282EJt.A00).E4s(new C161037Jm(c32282EJt.A04, c32282EJt.A02.A00));
    }
}
