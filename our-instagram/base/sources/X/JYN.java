package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JYN implements C5OV {
    public final UserSession A00;
    public final JUW A01 = JUW.A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        if (AbstractC41841wY.A00(userSession).A00() && !new C5zZ(userSession).A02.A01(1) && JUW.A02(userSession, true)) {
            return true;
        }
        return false;
    }

    public JYN(UserSession userSession) {
        this.A00 = userSession;
    }
}
