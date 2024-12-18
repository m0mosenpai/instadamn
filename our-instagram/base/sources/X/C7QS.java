package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7QS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7QS {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r1 == com.instagram.api.schemas.IGAIAgentVisibilityStatus.A05) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(com.instagram.common.session.UserSession r5, X.C83403nh r6, X.C7P8 r7, java.lang.Integer r8, java.util.List r9, int r10, boolean r11) {
        /*
            r1 = 2
            X.C14360o3.A0B(r7, r1)
            r0 = 6
            X.C14360o3.A0B(r9, r0)
            java.lang.String r0 = r6.A0h()
            if (r0 == 0) goto Lab
            boolean r0 = r7.AG0(r5, r6)
            if (r0 == 0) goto Lab
            if (r11 == 0) goto L22
            r0 = 29
            if (r10 != r0) goto L22
            if (r8 == 0) goto L78
            int r0 = r8.intValue()
            if (r0 != r1) goto L78
        L22:
            java.lang.String r4 = r6.A1u
            X.C14360o3.A07(r4)
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r10 == r0) goto L59
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r10 != r0) goto L7c
            java.util.Iterator r3 = r9.iterator()
        L33:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L7a
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C14360o3.A0K(r0, r4)
            if (r0 == 0) goto L33
        L4b:
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L55
            X.17P r0 = r2.A03
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r1 = r0.Aai()
        L55:
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r0 = com.instagram.api.schemas.IGAIAgentVisibilityStatus.A05
            if (r1 != r0) goto L7c
        L59:
            java.lang.String r1 = r5.userId
            java.lang.String r0 = r6.BtE()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L7c
            boolean r0 = X.AbstractC31268Doq.A08(r5)
            if (r0 == 0) goto L7c
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320047341379541(0x8108e400021fd5, double:3.032282415555741E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L7c
        L78:
            r0 = 1
            return r0
        L7a:
            r2 = r1
            goto L4b
        L7c:
            java.lang.String r1 = X.AbstractC31271Dot.A00(r5)
            java.lang.String r0 = r6.A1u
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lab
            X.7BW r0 = r6.A0Q
            if (r0 == 0) goto Lab
            boolean r0 = X.AbstractC31268Doq.A08(r5)
            if (r0 == 0) goto Lab
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320047341379541(0x8108e400021fd5, double:3.032282415555741E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto Lab
            r0 = 36325540605342879(0x810de3000e349f, double:3.0357563778057546E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto Lab
            goto L78
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7QS.A00(com.instagram.common.session.UserSession, X.3nh, X.7P8, java.lang.Integer, java.util.List, int, boolean):boolean");
    }

    public static final boolean A01(UserSession userSession, C83403nh c83403nh, Integer num, List list, int i, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list, 5);
        C28541Zp A00 = C7P5.A00();
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        return A00(userSession, c83403nh, A00.A01(c2ey), num, list, i, z);
    }
}
