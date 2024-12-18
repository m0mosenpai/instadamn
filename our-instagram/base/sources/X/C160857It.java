package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7It, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160857It {
    public static final C160857It A00 = new Object();

    public static final String A00(C81543kP c81543kP, String str, int i) {
        C14360o3.A0B(str, 0);
        if (A02(c81543kP, str, i)) {
            return "creator";
        }
        if (A05(c81543kP, str, i)) {
            return "collaborator";
        }
        if (A06(c81543kP, str, i)) {
            return MSV.A00(517);
        }
        return "viewer";
    }

    public static final boolean A02(C81543kP c81543kP, String str, int i) {
        String str2;
        C14360o3.A0B(str, 0);
        if (i == 29) {
            if (c81543kP != null) {
                str2 = c81543kP.A07;
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A03(C81543kP c81543kP, String str, int i) {
        List list;
        C14360o3.A0B(str, 0);
        if (!(i == 29) || c81543kP == null || (list = c81543kP.A0B) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C81543kP c81543kP, String str, int i) {
        List list;
        C14360o3.A0B(str, 0);
        if (!(i == 29) || c81543kP == null || (list = c81543kP.A0C) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C81543kP c81543kP, String str, int i) {
        List list;
        C14360o3.A0B(str, 0);
        if (!(i == 29) || c81543kP == null || (list = c81543kP.A0D) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(C81543kP c81543kP, String str, int i) {
        List list;
        C14360o3.A0B(str, 0);
        if (!(i == 29) || c81543kP == null || (list = c81543kP.A0E) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(C2EE c2ee, String str) {
        List BKM;
        C14360o3.A0B(str, 0);
        if (c2ee.C7g() != 29 || (BKM = c2ee.BKM()) == null || !BKM.contains(str)) {
            return false;
        }
        return true;
    }

    public final boolean A08(UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 0);
        int i = e70.A09;
        if (i == 29 && !A01(userSession, e70)) {
            String str = userSession.userId;
            C81543kP c81543kP = e70.A0E;
            if (!A05(c81543kP, str, i) && !A03(c81543kP, userSession.userId, i) && !A06(c81543kP, userSession.userId, i) && !A04(c81543kP, userSession.userId, i)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, E70 e70) {
        String str;
        String str2 = userSession.userId;
        int i = e70.A09;
        C81543kP c81543kP = e70.A0E;
        if (c81543kP != null) {
            str = c81543kP.A07;
        } else {
            str = null;
        }
        C14360o3.A0B(str2, 0);
        if (i == 29 && str2.equals(str)) {
            return true;
        }
        return false;
    }
}
