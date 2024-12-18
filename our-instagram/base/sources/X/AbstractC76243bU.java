package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.3bU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76243bU {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        User A2E;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 1);
        if (!C14360o3.A0K(c38321qM.A0C.BJN(), "connected_content_note_following") || (A2E = c38321qM.A2E(userSession)) == null || A2E.B7L() == FollowStatus.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        User A2E;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c75113Zb, 2);
        if (c38321qM.A6H()) {
            return true;
        }
        if (c75113Zb.A2a && (A2E = c38321qM.A2E(userSession)) != null && A2E.B7L() != FollowStatus.A05) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r0 != r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(com.instagram.common.session.UserSession r5, X.C38321qM r6, X.C75113Zb r7) {
        /*
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            X.1rF r0 = r6.A0C
            X.3x9 r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L60
            X.3p3 r0 = r0.BPh()
            if (r0 == 0) goto L60
            com.instagram.api.schemas.ClipsMashupType r0 = r0.BPi()
            r3 = 1
            if (r0 == 0) goto L60
            com.instagram.user.model.User r1 = r6.A2E(r5)
            if (r1 == 0) goto L60
            X.1rF r0 = r6.A0C
            X.3x9 r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L60
            X.3p3 r0 = r0.BPh()
            if (r0 == 0) goto L60
            X.4GI r0 = r0.BZr()
            if (r0 == 0) goto L60
            com.instagram.user.model.User r2 = r0.CDj()
            if (r2 == 0) goto L60
            com.instagram.user.model.FollowStatus r0 = r1.B7L()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r1) goto L4c
            com.instagram.user.model.FollowStatus r0 = r2.B7L()
            r2 = 0
            if (r0 == r1) goto L4d
        L4c:
            r2 = 1
        L4d:
            if (r7 == 0) goto L55
            X.341 r1 = X.AnonymousClass341.A0H
            X.341 r0 = r7.A0o
            if (r1 != r0) goto L5e
        L55:
            if (r2 == 0) goto L5e
            boolean r0 = X.C76263bW.A02(r5, r6)
            if (r0 == 0) goto L5e
            return r3
        L5e:
            r3 = 0
            return r3
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76243bU.A02(com.instagram.common.session.UserSession, X.1qM, X.3Zb):boolean");
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 1);
        if ((c75113Zb == null || AnonymousClass341.A0H == c75113Zb.A0o) && C14360o3.A0K(c38321qM.A0C.BZ2(), true) && c38321qM.A6P() && C18U.A06(C06090Tz.A05, userSession, 36320244913152201L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0 != r1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(com.instagram.common.session.UserSession r6, X.C38321qM r7, X.C75113Zb r8) {
        /*
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            r3 = 1
            X.C14360o3.A0B(r6, r3)
            com.instagram.user.model.User r1 = r7.A2E(r6)
            r4 = 0
            if (r1 == 0) goto L75
            com.instagram.api.schemas.OriginalitySourceMediaInfo r0 = X.C76263bW.A00(r7)
            if (r0 == 0) goto L75
            com.instagram.user.model.User r2 = r0.CDj()
            if (r2 == 0) goto L75
            com.instagram.user.model.FollowStatus r0 = r1.B7L()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r1) goto L2a
            com.instagram.user.model.FollowStatus r0 = r2.B7L()
            r2 = 0
            if (r0 == r1) goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r8 == 0) goto L33
            X.341 r1 = X.AnonymousClass341.A0H
            X.341 r0 = r8.A0o
            if (r1 != r0) goto L68
        L33:
            if (r2 == 0) goto L68
            boolean r0 = r7.A6Y(r6)
            if (r0 == 0) goto L68
            X.1rF r0 = r7.A0C
            X.3x9 r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L69
            com.instagram.api.schemas.OriginalityInfo r0 = r0.Ba3()
            if (r0 == 0) goto L69
            com.instagram.api.schemas.OriginalityFollowButtonInfo r2 = r0.B7H()
            if (r2 == 0) goto L69
            java.lang.Boolean r0 = r2.CZs()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L69
            java.lang.Boolean r0 = r2.BwL()
            boolean r0 = X.C14360o3.A0K(r0, r1)
        L65:
            if (r0 == 0) goto L68
            r4 = 1
        L68:
            return r4
        L69:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325630799394020(0x810df8000a34e4, double:3.0358134168868785E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            goto L65
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76243bU.A04(com.instagram.common.session.UserSession, X.1qM, X.3Zb):boolean");
    }
}
