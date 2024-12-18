package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3YR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YR implements InterfaceC65952yX {
    public final UserSession A00;
    public final UserSession A01;
    public final String A02;

    public C3YR(UserSession userSession, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = userSession;
        this.A02 = str;
    }

    public static boolean A00(UserSession userSession, C3XG c3xg) {
        C38321qM A02;
        if (c3xg.A06.ordinal() != 1 || ((A02 = C3XH.A02(c3xg.A05)) != null && A02.A00 == 0 && !C3YS.A00(userSession).A05(A02) && A02.A1y() == C3YU.A05)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.A6C() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r1.equals(r0) == false) goto L20;
     */
    @Override // X.InterfaceC65952yX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean EjD(java.lang.Object r8) {
        /*
            r7 = this;
            X.3XG r8 = (X.C3XG) r8
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "feed_contextual_self_profile"
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 == 0) goto L2c
            X.1qS r1 = r8.A05
            X.1qM r0 = X.C3XH.A02(r1)
            if (r0 == 0) goto L2c
            boolean r0 = r0.A5P()
            if (r0 != r3) goto L2c
            X.1qM r0 = X.C3XH.A02(r1)
            if (r0 == 0) goto L2c
            boolean r0 = r0.A6C()
            r6 = 1
            if (r0 == 0) goto L2d
        L2c:
            r6 = 0
        L2d:
            com.instagram.common.session.UserSession r5 = r7.A01
            X.1Ai r4 = X.AbstractC23021Ah.A00(r5)
            X.0ry r2 = r4.A5w
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 390(0x186, float:5.47E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CES(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6b
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            java.lang.String r2 = "injected_post_to_feed_id"
            java.lang.String r1 = ""
            X.0xq r0 = r0.A01
            java.lang.String r1 = r0.getString(r2, r1)
            X.C14360o3.A07(r1)
            X.1qS r0 = r8.A05
            X.1qM r0 = X.C3XH.A02(r0)
            if (r0 == 0) goto Lb4
            java.lang.String r0 = r0.A2u()
        L64:
            boolean r0 = r1.equals(r0)
            r4 = 1
            if (r0 != 0) goto L6c
        L6b:
            r4 = 0
        L6c:
            X.1XV r1 = r8.A06
            X.1XV r0 = X.C1XV.A0j
            if (r1 == r0) goto L86
            X.1XV r0 = X.C1XV.A0E
            if (r1 == r0) goto L86
            X.1XV r0 = X.C1XV.A0F
            if (r1 == r0) goto L86
            X.1XV r0 = X.C1XV.A0D
            if (r1 == r0) goto L86
            X.1qS r0 = r8.A05
            boolean r0 = r0 instanceof X.InterfaceC38371qR
            if (r0 == 0) goto Lb2
            if (r6 != 0) goto Lb2
        L86:
            r2 = 1
        L87:
            int r0 = r1.ordinal()
            if (r0 != r3) goto Lad
            X.1qS r0 = r8.A05
            X.1qM r1 = X.C3XH.A02(r0)
            if (r1 == 0) goto Lb6
            int r0 = r1.A00
            if (r0 != 0) goto Lb6
            com.instagram.common.session.UserSession r0 = r7.A00
            X.3YT r0 = X.C3YS.A00(r0)
            boolean r0 = r0.A05(r1)
            if (r0 != 0) goto Lb6
            X.3YU r1 = r1.A1y()
            X.3YU r0 = X.C3YU.A05
            if (r1 != r0) goto Lb6
        Lad:
            if (r2 == 0) goto Lb6
            if (r4 != 0) goto Lb6
            return r3
        Lb2:
            r2 = 0
            goto L87
        Lb4:
            r0 = 0
            goto L64
        Lb6:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YR.EjD(java.lang.Object):boolean");
    }
}
