package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G0i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36313G0i implements InterfaceC43071ya {
    public static C63702ur A04;
    public final UserSession A00;
    public final InterfaceC11380iw A01;
    public final String A02;
    public final InterfaceC09390do A03;

    public C36313G0i(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, InterfaceC09390do interfaceC09390do) {
        AbstractC25233BEq.A0w(1, userSession, str, interfaceC09390do);
        this.A00 = userSession;
        this.A01 = interfaceC11380iw;
        this.A02 = str;
        this.A03 = interfaceC09390do;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C63702ur c63702ur;
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            if (A04 == null) {
                UserSession userSession = this.A00;
                if (!C18U.A06(C06090Tz.A05, userSession, 36330638730871755L)) {
                    A04 = new C63702ur(this.A01, userSession);
                }
            }
            E71 e71 = (E71) c59062n7.A03;
            C6PG c6pg = new C6PG("recommended_users_direct_inbox", AbstractC31171DnF.A0g(e71.A01), this.A02);
            String str = e71.A02;
            if (str != null) {
                c6pg.A07 = str;
            }
            c6pg.A00 = e71.A00;
            if (C18U.A06(C06090Tz.A05, this.A00, 36330638730871755L)) {
                c63702ur = (C63702ur) this.A03.getValue();
            } else {
                c63702ur = A04;
                if (c63702ur == null) {
                    return;
                }
            }
            c63702ur.A09(new C6PH(c6pg));
        }
    }
}
