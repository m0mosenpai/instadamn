package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FVK {
    public static final C008302x A00(UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, str);
        return C0JE.A00(new MC9(str, userSession, (InterfaceC23621Ds) null, 49));
    }

    public static final void A01(UserSession userSession, C1GL c1gl, GZ7 gz7, String str) {
        AbstractC167017dG.A1N(str, userSession);
        C14360o3.A0B(c1gl, 3);
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            gz7.Dpv(A0h);
            return;
        }
        C1ON A04 = AbstractC2044893h.A04(userSession, str);
        C31456Ds0.A00(A04, gz7, userSession, 29);
        c1gl.schedule(A04);
    }
}
