package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.U1j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66142U1j implements InterfaceC43071ya {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C66138U1f A03;

    public C66142U1j(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C66138U1f c66138U1f) {
        this.A03 = c66138U1f;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C && this.A00) {
            String A01 = ((C50622MWj) c59062n7.A03).A00.A01();
            if (this.A03.AHA(A01)) {
                UserSession userSession = this.A02;
                InterfaceC11380iw interfaceC11380iw = this.A01;
                C63702ur c63702ur = new C63702ur(interfaceC11380iw, userSession);
                int i = ((Tx0) c59062n7.A04).A00;
                C6PG c6pg = new C6PG("su_in_search_null_state", A01, interfaceC11380iw.getModuleName());
                c6pg.A00 = i;
                c63702ur.A09(new C6PH(c6pg));
            }
        }
    }
}
