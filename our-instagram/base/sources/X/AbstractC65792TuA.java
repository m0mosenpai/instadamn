package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TuA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65792TuA {
    public static final C65740TtF A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C65740TtF) userSession.A01(C65740TtF.class, new X30(userSession, 34));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.AbstractC166997dE.A1Z(r5.A03.CfY(), r6.isVerified()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.user.model.User r5, com.instagram.user.model.User r6) {
        /*
            X.17P r0 = r6.A03
            java.lang.Boolean r0 = r0.CfY()
            r4 = 1
            if (r0 == 0) goto L1a
            X.17P r0 = r5.A03
            java.lang.Boolean r1 = r0.CfY()
            boolean r0 = r6.isVerified()
            boolean r0 = X.AbstractC166997dE.A1Z(r1, r0)
            r3 = 1
            if (r0 == 0) goto L1b
        L1a:
            r3 = 0
        L1b:
            r5.getUsername()
            java.lang.String r2 = "RecentUserSearchCache"
            java.lang.String r0 = r5.getFullName()
            if (r0 != 0) goto L33
            java.lang.String r1 = "Caught user with null full name! User: "
            java.lang.String r0 = r5.getId()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            X.C0w9.A03(r2, r0)
        L33:
            if (r3 != 0) goto L5b
            r5.getUsername()
            java.lang.String r1 = r5.getUsername()
            java.lang.String r0 = r6.getUsername()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5b
            java.lang.String r0 = r5.getFullName()
            if (r0 == 0) goto L5b
            java.lang.String r1 = r5.getFullName()
            java.lang.String r0 = r6.getFullName()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5b
            r4 = 0
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65792TuA.A01(com.instagram.user.model.User, com.instagram.user.model.User):boolean");
    }
}
