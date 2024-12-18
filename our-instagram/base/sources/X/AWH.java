package X;

/* loaded from: classes4.dex */
public final class AWH implements MPR {
    public final /* synthetic */ AKN A00;

    public AWH(AKN akn) {
        this.A00 = akn;
    }

    @Override // X.MPR
    public final void Dpk(C22857A6a c22857A6a) {
        AKN akn = this.A00;
        String str = akn.A0I;
        C14360o3.A0B(str, 0);
        C1819085a c1819085a = new C1819085a();
        c1819085a.A05 = AbstractC166997dE.A0o();
        c1819085a.A03 = str;
        C1819185b A00 = c1819085a.A00();
        BD9 bd9 = akn.A03;
        if (bd9 != null) {
            bd9.Dkx(A00);
        }
        akn.A07.ETc(c22857A6a.A00, akn.A06, new C23321AVg(akn), A00, c22857A6a.A01);
    }

    @Override // X.MPR
    public final void onFailure(Exception exc) {
        BD9 bd9 = this.A00.A03;
        if (bd9 != null) {
            bd9.onFailure(exc);
        }
    }
}
