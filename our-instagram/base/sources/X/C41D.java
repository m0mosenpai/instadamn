package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.41D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41D {
    public static final C41D A00 = new Object();

    public final boolean A02(UserSession userSession, C38321qM c38321qM) {
        String str;
        User CDj;
        User CDj2;
        String str2 = userSession.userId;
        User CDj3 = c38321qM.A0C.CDj();
        if (CDj3 != null) {
            str = CDj3.getId();
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str2, str) && (CDj = c38321qM.A0C.CDj()) != null && C14360o3.A0K(CDj.A0J(), true) && (CDj2 = c38321qM.A0C.CDj()) != null && !CDj2.A26()) {
            return true;
        }
        return false;
    }

    public static final Integer A00(C38321qM c38321qM) {
        List AmB = c38321qM.A0C.AmB();
        if (AmB == null) {
            return null;
        }
        int A15 = c38321qM.A15();
        int size = AmB.size();
        if (A15 != -1) {
            size--;
        }
        return Integer.valueOf(size);
    }

    public final boolean A01(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.A6c(userSession) && !c38321qM.A6Z(userSession)) {
            Integer A002 = A00(c38321qM);
            if (A002 != null && A002.intValue() >= C41754IeU.A00(userSession)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
