package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class O8M {
    public final C4QF A00;
    public final InterfaceC19630xq A01;

    public O8M(UserSession userSession) {
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A2h, C4QF.class);
        this.A01 = A04;
        this.A00 = new C4QF(new SharedPreferencesC19650xs(A04), "p_reels_swipe");
    }
}
