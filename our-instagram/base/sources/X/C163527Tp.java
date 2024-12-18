package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163527Tp {
    public final InterfaceC19630xq A00;

    public C163527Tp(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C1AT.A01(userSession).A04(C1AV.A09, getClass());
    }

    public final Boolean A00(String str) {
        String A0R = AnonymousClass001.A0R("agent_embodiment_enabled_", str);
        InterfaceC19630xq interfaceC19630xq = this.A00;
        if (interfaceC19630xq.contains(A0R)) {
            return Boolean.valueOf(interfaceC19630xq.getBoolean(A0R, false));
        }
        return null;
    }

    public final void A01(String str, boolean z) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77(AnonymousClass001.A0R("agent_embodiment_enabled_", str), z);
        ARD.apply();
    }
}
