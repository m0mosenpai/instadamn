package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160487Hi extends C160477Hh {
    public final boolean A05() {
        C2EE c2ee;
        if (((InterfaceC160517Hl) this.A05.invoke()).CPX() && !((Boolean) this.A06.invoke()).booleanValue() && !A01() && A03() && (((c2ee = this.A01) == null || !c2ee.Ccj()) && ((Boolean) this.A02.A04.getValue()).booleanValue())) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36324071725608822L)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A06(boolean z) {
        C2EE c2ee;
        long j;
        if (((InterfaceC160517Hl) this.A05.invoke()).CXm() && !((Boolean) this.A06.invoke()).booleanValue() && !A01() && A03() && (c2ee = this.A01) != null && !c2ee.Ccj() && c2ee.BBy() && ((Boolean) this.A02.A09.getValue()).booleanValue()) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (z) {
                j = 36321086723335313L;
            } else {
                j = 36321086723597459L;
            }
            boolean A06 = C18U.A06(c06090Tz, userSession, j);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (A06) {
                return true;
            }
        }
        return false;
    }
}
