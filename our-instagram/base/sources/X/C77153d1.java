package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77153d1 {
    public static final C77153d1 A00 = new Object();

    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (!c38321qM.A5k()) {
            if (!C2TN.A02(userSession, c38321qM) && C3YZ.A00(userSession).A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36328203484282181L);
        if (!c38321qM.A68()) {
            if (!C2TN.A02(userSession, c38321qM) && A06 && C3YZ.A00(userSession).A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r5.A5Z() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.common.session.UserSession r4, X.C38321qM r5, java.lang.Integer r6) {
        /*
            r1 = 0
            boolean r0 = r5.Cff()
            r3 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            if (r6 == 0) goto L38
            int r0 = r6.intValue()
            if (r0 <= 0) goto L38
            boolean r2 = X.C2TN.A02(r4, r5)
            boolean r0 = r5.A5b()
            if (r0 != 0) goto L22
            boolean r1 = r5.A5Z()
            r0 = 0
            if (r1 == 0) goto L23
        L22:
            r0 = 1
        L23:
            if (r2 == 0) goto L26
            return r0
        L26:
            if (r0 == 0) goto L38
            boolean r0 = r5.A5k()
            if (r0 != 0) goto L38
            X.3Ya r0 = X.C3YZ.A00(r4)
            boolean r0 = r0.A00
            if (r0 != 0) goto L38
            r3 = 1
            return r3
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77153d1.A03(com.instagram.common.session.UserSession, X.1qM, java.lang.Integer):boolean");
    }

    public final boolean A04(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315619230158275L);
        if (!C2TN.A02(userSession, c38321qM)) {
            if (c38321qM.A5k() || (C3YZ.A00(userSession).A00 && A06)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A05(UserSession userSession, C38321qM c38321qM, Integer num, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 3);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315619230158275L);
        if (!z) {
            return false;
        }
        if (!A03(userSession, c38321qM, num) && !c38321qM.A5k()) {
            if (c38321qM.BRp() != EnumC40111tc.A0a || !A06 || C2TN.A02(userSession, c38321qM)) {
                return false;
            }
            if (!c38321qM.A5k() && !C3YZ.A00(userSession).A00) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        if (!C2TN.A02(userSession, c38321qM)) {
            if (c38321qM.Cff() && !c38321qM.A5k() && !C3YZ.A00(userSession).A00) {
                return true;
            }
            return false;
        }
        return true;
    }
}
