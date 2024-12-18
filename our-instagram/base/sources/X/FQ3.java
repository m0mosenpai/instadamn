package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQ3 {
    public final C18920wW A00;
    public final InterfaceC11380iw A01;
    public final C63702ur A02;
    public final String A03;

    public FQ3(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = interfaceC11380iw;
        this.A03 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A02 = new C63702ur(interfaceC11380iw, userSession);
    }

    public final void A00(C47P c47p, String str, int i) {
        AbstractC167017dG.A1N(c47p, str);
        C6PG c6pg = new C6PG(str, c47p.getId(), this.A01.getModuleName());
        c6pg.A00 = i;
        String CEI = c47p.CEI();
        if (CEI != null) {
            c6pg.A07 = CEI;
        }
        c6pg.A04 = c47p.getAlgorithm();
        c6pg.A0B = c47p.ByJ();
        c6pg.A05 = this.A03;
        this.A02.A09(new C6PH(c6pg));
    }
}
