package X;

/* loaded from: classes9.dex */
public final class NXQ extends AbstractC86353t7 {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ AbstractC13100lw A01;
    public final /* synthetic */ C169297h3 A02;
    public final /* synthetic */ C8YH A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public NXQ(C25814BbV c25814BbV, AbstractC13100lw abstractC13100lw, C169297h3 c169297h3, C8YH c8yh, String str, String str2) {
        this.A00 = c25814BbV;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = abstractC13100lw;
        this.A02 = c169297h3;
        this.A03 = c8yh;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        C25814BbV c25814BbV = this.A00;
        String str = this.A05;
        String str2 = this.A04;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC13100lw abstractC13100lw = this.A01;
        long A00 = abstractC13100lw.A00();
        int i = abstractC13100lw.A00;
        abstractC13100lw.A00 = 0;
        C51618MrB c51618MrB = new C51618MrB(null, str, str2, i, A00, false);
        C169297h3 c169297h3 = this.A02;
        C169297h3.A00(c169297h3);
        c25814BbV.A0J(c51618MrB, Math.max(c169297h3.A02 - c169297h3.A00, 0), true);
        this.A03.A05(c169297h3);
    }
}
