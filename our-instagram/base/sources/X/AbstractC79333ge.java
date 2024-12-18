package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79333ge {
    public static final boolean A00(UserSession userSession, C79313gc c79313gc) {
        String str;
        Boolean BBR;
        C14360o3.A0B(userSession, 1);
        C38321qM c38321qM = c79313gc.A00;
        if (c38321qM.A4c()) {
            User CDj = c38321qM.A0C.CDj();
            if (CDj != null) {
                str = CDj.getId();
            } else {
                str = "";
            }
            if (!C14360o3.A0K(str, userSession.userId) || (BBR = C08730cb.A00(userSession).A00().A03.BBR()) == null || !BBR.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C79313gc c79313gc, boolean z) {
        String str;
        Boolean BBR;
        C38321qM c38321qM = c79313gc.A00;
        if (!c38321qM.A4c() && !C18U.A06(C06090Tz.A05, userSession, 36323096769539040L)) {
            return false;
        }
        List A3j = c38321qM.A3j();
        if ((A3j == null || A3j.isEmpty()) && !z) {
            return false;
        }
        User CDj = c38321qM.A0C.CDj();
        if (CDj != null) {
            str = CDj.getId();
        } else {
            str = "";
        }
        return (C14360o3.A0K(str, userSession.userId) && (BBR = C08730cb.A00(userSession).A00().A03.BBR()) != null && BBR.booleanValue()) ? false : true;
    }
}
