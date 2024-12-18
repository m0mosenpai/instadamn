package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59712oE {
    public final UserSession A00;

    public final boolean A02(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A5w()) {
            if (C18U.A06(C06090Tz.A05, this.A00, 2342171212698238279L)) {
                return false;
            }
        }
        if (c38321qM.A0f) {
            return false;
        }
        if (C18U.A06(C06090Tz.A05, this.A00, 36328203484151107L)) {
            return true;
        }
        return false;
    }

    public final boolean A00() {
        return C18U.A06(C06090Tz.A05, this.A00, 36328203484216644L);
    }

    public final boolean A01() {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36328203484151107L) && !C18U.A06(c06090Tz, userSession, 36328203484609864L)) {
            return false;
        }
        return true;
    }

    public C59712oE(UserSession userSession) {
        this.A00 = userSession;
    }
}
