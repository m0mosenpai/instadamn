package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GlP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37870GlP implements InterfaceC43071ya {
    public final C1BX A00;
    public final C62792tI A01;
    public final C64092vU A02;
    public final C37871GlQ A03;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer num;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C64092vU c64092vU = this.A02;
        String str = c59062n7.A05;
        C82383m1 A00 = c64092vU.A00(str);
        String A0R = AnonymousClass001.A0R(str, "_vpvd_impression");
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0 && A01 != A1R) {
            A00.A04(interfaceC57162jr);
            C62792tI c62792tI = this.A01;
            if (!c62792tI.A00.A0F(A0R)) {
                num = C05F.A00;
            } else if (!c62792tI.A03(A0R, 0L)) {
                return;
            } else {
                num = C05F.A01;
            }
            c64092vU.A01(new J2A(this.A03, num), A00, c59062n7.A03, c59062n7.A04);
            c62792tI.A02(A0R);
            return;
        }
        A00.A03(c59062n7, interfaceC57162jr);
    }

    public C37870GlP(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        C37871GlQ c37871GlQ = new C37871GlQ(interfaceC11380iw, userSession, c38321qM);
        C64092vU A0R = AbstractC37302Gc3.A0R(userSession);
        C1BX A0J = AbstractC37302Gc3.A0J(userSession);
        C62792tI A00 = C62792tI.A00(A0J);
        this.A02 = A0R;
        this.A03 = c37871GlQ;
        this.A00 = A0J;
        this.A01 = A00;
    }
}
