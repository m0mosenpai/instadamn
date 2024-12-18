package X;

/* renamed from: X.GHq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36747GHq implements MPL {
    public final /* synthetic */ C32284EJv A00;

    public C36747GHq(C32284EJv c32284EJv) {
        this.A00 = c32284EJv;
    }

    @Override // X.MPL
    public final void Di0() {
        int i;
        C32284EJv c32284EJv = this.A00;
        C142846ck A00 = AbstractC147806l5.A00(AbstractC166987dD.A0r(c32284EJv.A0G));
        int A002 = AbstractC31180DnO.A00(c32284EJv);
        String A07 = AbstractC1345466e.A07(C32284EJv.A00(c32284EJv));
        String A02 = C32284EJv.A02(c32284EJv);
        boolean A08 = C32284EJv.A08(c32284EJv);
        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A00);
            AbstractC31174DnI.A1I(A0I, "save_qr_code");
            A0I.A0o("save_qr_code_button");
            if (A08) {
                i = 891;
            } else {
                i = 982;
            }
            A0I.A0h(AbstractC31179DnN.A0a(A0I, AbstractC43591JPw.A00(i), A07, A02, A002));
            A0I.Cht();
        }
    }
}
