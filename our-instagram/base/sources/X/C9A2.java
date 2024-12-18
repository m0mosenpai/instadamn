package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9A2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9A2 {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public C9A2(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = AbstractC09440dt.A01(new C9E3(this, 37));
        this.A01 = AbstractC09440dt.A01(new C9E3(this, 36));
    }

    public final void A00(long j) {
        UserSession userSession = this.A00;
        C9A3 c9a3 = (C9A3) userSession.A01(C9A3.class, new C37056GUm(userSession, 40));
        InterfaceC19610xo ARD = C1AT.A01(c9a3.A00).A04(C1AV.A0E, c9a3.getClass()).ARD();
        ARD.EEj(String.valueOf(j));
        ARD.apply();
    }
}
