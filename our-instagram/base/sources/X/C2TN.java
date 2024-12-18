package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2TN, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2TN {
    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C05F.A0C != C08730cb.A00(userSession).A00().A0M()) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        String str2 = userSession.userId;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession, C17D c17d) {
        C14360o3.A0B(userSession, 0);
        String str = userSession.userId;
        if (c17d != null && c17d.getId() != null && str != null && str.equals(c17d.getId())) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return A07(userSession.userId, str);
    }

    public static final boolean A07(String str, String str2) {
        return (str2 == null || str2.length() == 0 || str == null || str.length() == 0 || !str.equals(str2)) ? false : true;
    }

    public static final boolean A00(UserSession userSession) {
        if (userSession != null && C1C0.A00(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A06(User user) {
        if (user != null && C05F.A01 == user.A0M()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final boolean A03(UserSession userSession, C38321qM c38321qM) {
        ?? r4;
        if (c38321qM.A58()) {
            List<InterfaceC102194ip> sponsorTags = c38321qM.A0C.getSponsorTags();
            if (sponsorTags != null) {
                r4 = new ArrayList();
                for (InterfaceC102194ip interfaceC102194ip : sponsorTags) {
                    if (!C14360o3.A0K(interfaceC102194ip.Ca9(), true)) {
                        r4.add(interfaceC102194ip.BzF().getId());
                    }
                }
            } else {
                r4 = C16930sl.A00;
            }
            if (r4.contains(userSession.userId)) {
                return true;
            }
        }
        return false;
    }
}
