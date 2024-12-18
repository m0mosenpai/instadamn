package X;

import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154616xB {
    public final UserSession A00;

    public final IGAdProfileProductTabDict A00(String str) {
        InterfaceC39541sb injected;
        C38321qM A02 = C1DW.A00(this.A00).A02(str);
        if (A02 != null && (injected = A02.A0C.getInjected()) != null) {
            return injected.Bi3();
        }
        return null;
    }

    public final boolean A01(String str, String str2) {
        IGAdProfileProductTabDict A00;
        List BhR;
        C38321qM A02;
        UserSession userSession = this.A00;
        if (!C18U.A06(C06090Tz.A05, userSession, 36328980873363366L) || (A00 = A00(str)) == null || (BhR = A00.BhR()) == null) {
            return false;
        }
        User user = null;
        if (str != null && (A02 = C1DW.A00(userSession).A02(str)) != null) {
            user = A02.A2E(userSession);
        }
        if (str2 == null || !C14360o3.A0K(AbstractC76433bn.A00(user), str2)) {
            return false;
        }
        if (!(!BhR.isEmpty()) && !C14360o3.A0K(A00.BUz(), true)) {
            return false;
        }
        return true;
    }

    public C154616xB(UserSession userSession) {
        this.A00 = userSession;
    }
}
