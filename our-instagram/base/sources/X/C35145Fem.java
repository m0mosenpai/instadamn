package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fem, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35145Fem {
    public static final C35145Fem A00 = new Object();

    public static final boolean A00(C38321qM c38321qM) {
        Integer Bdm;
        Integer CFm = c38321qM.A0C.CFm();
        if ((CFm == null || CFm.intValue() <= 0) && ((Bdm = c38321qM.A0C.Bdm()) == null || Bdm.intValue() <= 0)) {
            return false;
        }
        return true;
    }

    public final int A01(UserSession userSession, C38321qM c38321qM, boolean z) {
        if (BO2.A02(userSession, c38321qM) && AbstractC166297by.A01(c38321qM)) {
            if (!z) {
                return 2131971516;
            }
            return 2131971515;
        }
        if (!c38321qM.A5P() && !A00(c38321qM)) {
            return 2131965123;
        }
        return 2131965125;
    }
}
