package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lv5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49551Lv5 implements C5OV {
    public final UserSession A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36327447569906255L)) {
            return false;
        }
        if ((!AbstractC43805JYs.A02(userSession) && !AbstractC43805JYs.A00(userSession) && !AbstractC43805JYs.A01(userSession)) || AbstractC43807JYu.A02(userSession) || AbstractC43807JYu.A00(userSession) || AbstractC43807JYu.A01(userSession)) {
            return false;
        }
        return true;
    }

    public C49551Lv5(UserSession userSession) {
        this.A00 = userSession;
    }
}
