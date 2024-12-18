package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156216zq {
    public final InterfaceC19630xq A00;

    public final void A00() {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77("seen_my_week_nux", true);
        ARD.apply();
    }

    public final void A01(boolean z) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77("my_week_enabled", z);
        ARD.apply();
        if (z) {
            A00();
        }
    }

    public C156216zq(UserSession userSession) {
        this.A00 = C1AT.A01(userSession).A04(C1AV.A2U, getClass());
    }
}
