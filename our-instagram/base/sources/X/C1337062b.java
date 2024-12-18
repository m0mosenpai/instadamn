package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.62b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1337062b extends C62a {
    public final int A00;
    public final C50526MSf A01;
    public final C37644Ghd A02;
    public final UserSession A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337062b(C50526MSf c50526MSf, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, boolean z) {
        super(c120985dq);
        C14360o3.A0B(c120985dq, 1);
        C14360o3.A0B(c50526MSf, 3);
        C14360o3.A0B(c37644Ghd, 4);
        this.A01 = c50526MSf;
        this.A02 = c37644Ghd;
        this.A03 = userSession;
        this.A04 = z;
        int ordinal = c120985dq.A01.ordinal();
        int i = 0;
        if (ordinal != 0) {
            if (ordinal == 3 || ordinal == 2 || ordinal == 1) {
                i = A00(false);
            }
        } else {
            i = A00(true);
        }
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r1.A28 != true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.A04
            r2 = 1
            if (r0 != 0) goto L25
            X.MSf r0 = r9.A01
            boolean r0 = r0.A01
            if (r10 == 0) goto L1c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.Ghd r0 = r9.A02
            X.Hd6 r0 = r0.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
        L17:
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            goto L17
        L25:
            X.5dq r6 = r9.A00
            X.1qM r1 = r6.A02
            r5 = 0
            if (r1 == 0) goto Lb1
            com.instagram.common.session.UserSession r4 = r9.A03
            X.2kS r0 = X.C57532kS.A00(r4)
            boolean r3 = r0.A0N(r1)
            int r8 = r1.A0w()
            int r7 = r1.A0s()
            if (r10 == 0) goto Lae
            X.1rF r0 = r1.A0C
            com.instagram.user.model.User r1 = r0.CDj()
            if (r1 == 0) goto Lac
            X.2kX r0 = X.C57582kX.A00(r4)
            com.instagram.user.model.FollowStatus r4 = r0.A0N(r1)
        L50:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1, r0, r4}
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L68:
            X.Ghd r3 = r9.A02
            X.3Zb r1 = r3.A0E
            if (r1 == 0) goto Laa
            boolean r0 = r1.A1p
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L74:
            if (r10 != 0) goto L7d
            if (r1 == 0) goto L7d
            boolean r1 = r1.A28
            r0 = 1
            if (r1 == r2) goto L7e
        L7d:
            r0 = 0
        L7e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.Hd6 r1 = r3.A0C
            X.MSf r0 = r9.A01
            boolean r0 = r0.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r2, r1, r0}
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.BMy r1 = X.AbstractC25476BOp.A00
            com.instagram.common.session.UserSession r0 = r9.A03
            boolean r0 = r1.A00(r5, r6, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r2, r0}
            goto L17
        Laa:
            r7 = r5
            goto L74
        Lac:
            r4 = r5
            goto L50
        Lae:
            com.instagram.user.model.FollowStatus r4 = com.instagram.user.model.FollowStatus.A06
            goto L50
        Lb1:
            r4 = r5
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337062b.A00(boolean):int");
    }
}
