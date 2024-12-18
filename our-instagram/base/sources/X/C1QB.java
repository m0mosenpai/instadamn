package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1QB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QB {
    public final UserSession A00;

    public C1QB(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final int A00() {
        int i = AbstractC23021Ah.A00(this.A00).A01.getInt("data_saver_network_resources_quality", -1);
        if (i == -1) {
            return 1;
        }
        return i;
    }

    public final boolean A01() {
        UserSession userSession = this.A00;
        boolean z = false;
        if (AbstractC23021Ah.A00(userSession).A01.getInt("data_saver_mode_on", -1) != -1) {
            z = true;
        }
        if (!z || AbstractC23021Ah.A00(userSession).A01.getInt("data_saver_mode_on", -1) != 1) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        int A00;
        if (A01() && (A00 = A00()) != -1) {
            if (A00 != 0) {
                if (A00 == 1) {
                    C14360o3.A07(AbstractC12290kX.A00);
                    if (!AbstractC15820qc.A0G(r0)) {
                        return true;
                    }
                    return false;
                }
                if (A00 != 2) {
                    throw new IllegalArgumentException("Unexpected network setting value");
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
