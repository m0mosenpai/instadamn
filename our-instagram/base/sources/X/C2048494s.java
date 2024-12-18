package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.94s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2048494s {
    public final C4QF A00;
    public final InterfaceC19630xq A01;

    public C2048494s(UserSession userSession) {
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A15, C4QF.class);
        this.A01 = A04;
        this.A00 = new C4QF(new SharedPreferencesC19650xs(A04), "P_DELAYED_CTA");
    }
}
