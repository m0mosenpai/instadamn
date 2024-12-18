package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC128095qd {
    public static String A01(InterfaceC120995dr interfaceC120995dr, UserSession userSession) {
        User A2E;
        C14360o3.A0B(userSession, 1);
        C38321qM BQN = interfaceC120995dr.BQN();
        boolean z = true;
        if (BQN == null || !BQN.A4r()) {
            z = false;
        }
        C38321qM BQN2 = interfaceC120995dr.BQN();
        if (z) {
            if (BQN2 == null) {
                return null;
            }
            A2E = BQN2.A0C.BAR();
        } else {
            if (BQN2 == null) {
                return null;
            }
            A2E = BQN2.A2E(userSession);
        }
        if (A2E == null) {
            return null;
        }
        return A2E.getUsername();
    }

    public static EnumC40111tc A00(InterfaceC120995dr interfaceC120995dr) {
        C38321qM BQN = interfaceC120995dr.BQN();
        if (BQN != null) {
            return BQN.BRp();
        }
        return null;
    }

    public static boolean A02(InterfaceC120995dr interfaceC120995dr) {
        C38321qM BQN = interfaceC120995dr.BQN();
        if (BQN != null) {
            return BQN.A4g();
        }
        return false;
    }
}
