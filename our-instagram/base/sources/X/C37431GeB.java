package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GeB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37431GeB implements InterfaceC43071ya {
    public final UserSession A00;
    public final AnonymousClass341 A01;
    public final String A02;

    public C37431GeB(UserSession userSession, AnonymousClass341 anonymousClass341, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(anonymousClass341, 2);
        this.A00 = userSession;
        this.A01 = anonymousClass341;
        this.A02 = str;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        C14360o3.A0B(c59062n7, 0);
        C38321qM c38321qM = (C38321qM) c59062n7.A03;
        if (c38321qM != null && c38321qM.A4Z() && !C14360o3.A0K(c38321qM.A0C.BBi(), true)) {
            c38321qM.A0C.EVQ(true);
            if (C14360o3.A0K(this.A01.toString(), "MEDIA_CONTEXTUAL_FEED")) {
                str = "profile";
            } else {
                str = null;
            }
            String A38 = c38321qM.A38();
            if (A38 != null) {
                C1ON A05 = AbstractC2044893h.A05(this.A00, A38, str, this.A02);
                A05.A00 = new C37484Gf2(5, c38321qM, this);
                C1GJ.A03(A05);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
