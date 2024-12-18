package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.32t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C675432t {
    public C1M1 A00;
    public final InterfaceC11360iu A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;

    public C675432t(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(userSession, 2);
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A00 = c1m1;
        this.A01 = AbstractC11060iN.A00(userSession);
        this.A02 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }

    public static final C19280xC A00(C675432t c675432t, C84923qg c84923qg, InterfaceC38371qR interfaceC38371qR, String str) {
        String str2;
        UserSession userSession = c675432t.A03;
        InterfaceC60442pS interfaceC60442pS = c675432t.A04;
        C19280xC A00 = AbstractC82703mY.A03(userSession, interfaceC38371qR, interfaceC60442pS, str).A00();
        C38321qM BQN = interfaceC38371qR.BQN();
        A00.A0C("c_pk", c84923qg.A0G);
        User user = c84923qg.A08;
        String str3 = null;
        if (user != null) {
            str2 = user.getId();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            A00.A0C("ca_pk", str2);
        }
        String str4 = c84923qg.A0F;
        String A002 = AbstractC111324zv.A00(1162);
        if (str4 != null) {
            A00.A0C(A002, str4);
        }
        String str5 = c84923qg.A0d;
        String A003 = AbstractC111324zv.A00(5214);
        if (str5 != null) {
            A00.A0C(A003, str5);
        }
        int ordinal = BQN.BRp().ordinal();
        int i = 2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i = -1;
            }
        } else {
            i = 1;
        }
        A00.A08(Integer.valueOf(i), "m_t");
        A00.A0C("inventory_source", BQN.A0C.BJN());
        C1M1 c1m1 = c675432t.A00;
        if (c1m1 != null) {
            str3 = c1m1.getSessionId();
        }
        String A004 = AbstractC63083Sc6.A00();
        if (str3 != null) {
            A00.A0C(A004, str3);
        }
        A00.A09("is_media_organic", Boolean.valueOf(interfaceC60442pS.isOrganicEligible()));
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (com.instagram.api.schemas.CommentRestrictStatus.A05 == r7.A0U) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C82713mZ A01(X.C84923qg r7, java.lang.Boolean r8) {
        /*
            r6 = this;
            X.1qM r4 = r7.A07
            if (r4 == 0) goto L9d
            X.2pS r5 = r6.A04
            java.lang.String r0 = "comment_impression"
            X.3mZ r1 = new X.3mZ
            r1.<init>(r5, r0)
            java.lang.String r0 = r7.A0G
            r1.A4u = r0
            java.lang.String r0 = r4.getId()
            r1.A61 = r0
            int r0 = r7.A02
            long r2 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A3i = r0
            boolean r0 = r5.isOrganicEligible()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1f = r0
            boolean r0 = r7.A0o
            if (r0 == 0) goto L39
            boolean r0 = r7.A0m
            if (r0 != 0) goto L39
            com.instagram.api.schemas.CommentRestrictStatus r3 = com.instagram.api.schemas.CommentRestrictStatus.A05
            com.instagram.api.schemas.CommentRestrictStatus r2 = r7.A0U
            r0 = 1
            if (r3 != r2) goto L3a
        L39:
            r0 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1H = r0
            X.1rF r0 = r4.A0C
            java.lang.String r0 = r0.getMezqlToken()
            r1.A67 = r0
            com.instagram.user.model.User r0 = r7.A08
            r3 = 0
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.getId()
        L51:
            r1.A4w = r0
            com.instagram.common.session.UserSession r2 = r6.A03
            com.instagram.user.model.User r0 = r4.A2E(r2)
            if (r0 == 0) goto L5f
            java.lang.String r3 = r0.getId()
        L5f:
            r1.A4c = r3
            java.lang.String r0 = r7.A0F
            r1.A6Q = r0
            java.lang.String r0 = r7.A0B
            r1.A4v = r0
            r1.A6R = r0
            java.lang.String r0 = r7.A0A
            r1.A4n = r0
            boolean r0 = r7.A0n
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1s = r0
            r1.A0G(r2, r4)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C14360o3.A0K(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1n = r0
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1u = r0
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L9a
            r1.A6C = r0
        L9a:
            return r1
        L9b:
            r0 = r3
            goto L51
        L9d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675432t.A01(X.3qg, java.lang.Boolean):X.3mZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (com.instagram.api.schemas.CommentRestrictStatus.A05 == r7.A0U) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C84923qg r7, X.C38321qM r8) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675432t.A02(X.3qg, X.1qM):void");
    }
}
