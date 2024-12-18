package X;

/* renamed from: X.PJh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56811PJh implements InterfaceC30958DjF {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ AbstractC13100lw A01;
    public final /* synthetic */ C169287h2 A02;
    public final /* synthetic */ C169297h3 A03;
    public final /* synthetic */ C8YH A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C56811PJh(C25814BbV c25814BbV, AbstractC13100lw abstractC13100lw, C169287h2 c169287h2, C169297h3 c169297h3, C8YH c8yh, String str, String str2) {
        this.A00 = c25814BbV;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = c169287h2;
        this.A01 = abstractC13100lw;
        this.A03 = c169297h3;
        this.A04 = c8yh;
    }

    @Override // X.InterfaceC30958DjF
    public final void DAn() {
        C25814BbV c25814BbV = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC13100lw abstractC13100lw = this.A01;
        long A00 = abstractC13100lw.A00();
        int i = abstractC13100lw.A00;
        abstractC13100lw.A00 = 0;
        C51618MrB c51618MrB = new C51618MrB(null, str, str2, i, A00, false);
        C169297h3 c169297h3 = this.A03;
        C169297h3.A00(c169297h3);
        c25814BbV.A0J(c51618MrB, Math.max(c169297h3.A02 - c169297h3.A00, 0), true);
        this.A04.A05(c169297h3);
    }
}
