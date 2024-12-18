package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FzZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36282FzZ implements InterfaceC13000lm {
    public boolean A00;
    public final UserSession A01;

    public C36282FzZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36314506833431203L) && this.A00 && C18U.A06(c06090Tz, userSession, 36314506833496740L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C36282FzZ.class);
    }
}
