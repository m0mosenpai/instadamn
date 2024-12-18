package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3bN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76183bN {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM, String str) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 2);
        if (c38321qM.A5P() && new C57462kL(userSession).A03(c38321qM, str) == EnumC86893u2.A08) {
            return true;
        }
        return false;
    }

    public final boolean A01(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(str, 3);
        if (!A02(userSession, c38321qM, str) && !A00(userSession, c38321qM, str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3 == 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(com.instagram.common.session.UserSession r7, X.C38321qM r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 3
            X.C14360o3.A0B(r9, r0)
            boolean r0 = A00(r7, r8, r9)
            r5 = 1
            if (r0 != 0) goto L2e
            boolean r0 = r8.A5P()
            if (r0 == 0) goto L30
            boolean r0 = r8.A5E()
            if (r0 != 0) goto L30
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36610992720845047(0x821181000018f7, double:3.2162774450727354E-306)
            long r3 = X.C18U.A01(r2, r7, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L30
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L30
        L2e:
            r5 = 0
        L2f:
            return r5
        L30:
            java.lang.String r0 = "feed_ad_preview"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L2e
            boolean r0 = r8.A5R()
            if (r0 != 0) goto L2f
            boolean r0 = r8.A5P()
            if (r0 != 0) goto L2f
            boolean r0 = X.AbstractC41071vF.A0T(r7, r8)
            if (r0 == 0) goto L2e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76183bN.A02(com.instagram.common.session.UserSession, X.1qM, java.lang.String):boolean");
    }
}
