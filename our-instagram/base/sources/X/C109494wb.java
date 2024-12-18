package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109494wb {
    public final UserSession A00;
    public final InterfaceC19630xq A01;

    public final void A00(boolean z) {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("is_self_security_alert_enabled", z);
        ARD.apply();
        C9Q4.A00(new C25310BIf(z, 9), this.A00);
    }

    public final boolean A01() {
        if (!C18U.A06(C06090Tz.A06, this.A00, 36320283568120110L) || !this.A01.getBoolean(AbstractC111324zv.A00(4370), false)) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        InterfaceC19630xq interfaceC19630xq = this.A01;
        boolean contains = interfaceC19630xq.contains("is_self_security_alert_enabled");
        UserSession userSession = this.A00;
        if (contains) {
            return interfaceC19630xq.getBoolean("is_self_security_alert_enabled", ((Boolean) AbstractC47132Ef.A00(userSession).A06.A00()).booleanValue());
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36321438911112636L) && A01()) {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36320283568578865L);
            C14360o3.A0A(Boolean.valueOf(A06));
            return A06;
        }
        return ((Boolean) AbstractC47132Ef.A00(userSession).A06.A00()).booleanValue();
    }

    public C109494wb(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C1AT.A01(userSession).A04(C1AV.A1E, getClass());
    }
}
