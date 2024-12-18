package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.94I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94I {
    public final C4QF A00;
    public final InterfaceC19630xq A01;

    public C94I(UserSession userSession) {
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A16, C4QF.class);
        this.A01 = A04;
        this.A00 = new C4QF(new SharedPreferencesC19650xs(A04), "scroll_speed");
    }
}
