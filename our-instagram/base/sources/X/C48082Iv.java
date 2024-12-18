package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2Iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48082Iv {
    public final InterfaceC19630xq A00;

    public C48082Iv(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C1AT.A01(userSession).A04(C1AV.A1A, getClass());
    }

    public final void A00() {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7G("last_used_time", System.currentTimeMillis());
        ARD.apply();
    }
}
