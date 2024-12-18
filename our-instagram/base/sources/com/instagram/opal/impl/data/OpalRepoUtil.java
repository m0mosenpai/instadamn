package com.instagram.opal.impl.data;

import X.AnonymousClass189;
import X.C109974xR;
import X.C14360o3;
import X.C18A;
import X.C74;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class OpalRepoUtil {
    public static final OpalRepoUtil A00 = new Object();

    public final void A03(UserSession userSession, OpalProfileData opalProfileData) {
        C109974xR c109974xR;
        C14360o3.A0B(userSession, 1);
        if (opalProfileData.A01 == C74.A04) {
            boolean z = opalProfileData.A0A;
            c109974xR = new C109974xR(opalProfileData.A00, opalProfileData.A02, "", opalProfileData.A04, opalProfileData.A06, z, false, false);
        } else {
            c109974xR = null;
        }
        String str = opalProfileData.A05;
        C14360o3.A0B(str, 1);
        C18A A002 = AnonymousClass189.A00(userSession);
        User A02 = A002.A02(str);
        if (A02 != null) {
            A02.A03.Ea6(c109974xR);
            A002.A03(A02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r7, com.instagram.common.session.UserSession r8, com.instagram.opal.impl.data.OpalRepoUtil r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r4 = 23
            boolean r0 = X.C57145PWx.A02(r11, r4)
            if (r0 == 0) goto L6d
            r3 = r11
            X.PWx r3 = (X.C57145PWx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A02
            X.1JX r6 = X.C1JX.A02
            int r1 = r3.A00
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L77
            java.lang.Object r5 = r3.A01
            X.AbstractC09560e7.A00(r0)
        L26:
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L2f
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L72
            r5 = 0
        L2f:
            return r5
        L30:
            X.AbstractC09560e7.A00(r0)
            int r0 = r10.length()
            if (r0 != 0) goto L3c
            java.lang.String r5 = ""
            return r5
        L3c:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            android.net.Uri r1 = X.AbstractC167007dF.A0I(r10)
            android.content.Context r0 = X.AbstractC166987dD.A0O(r7)
            r3.A01 = r5
            r3.A00 = r2
            r4 = 72627069(0x454337d, float:2.4944122E-36)
            X.1Jo r3 = X.AbstractC25232BEp.A1H(r3)
            X.5eQ r2 = X.AbstractC34756FSv.A01(r0, r1, r8, r5, r2)
            r1 = 0
            X.NFQ r0 = new X.NFQ
            r0.<init>(r3, r1)
            r2.A00 = r0
            X.C1GJ.A04(r2, r4)
            java.lang.Object r0 = r3.A0E()
            if (r0 != r6) goto L26
            return r6
        L6d:
            X.PWx r3 = X.C57145PWx.A00(r9, r11, r4)
            goto L16
        L72:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L77:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepoUtil.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.opal.impl.data.OpalRepoUtil, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x018e, code lost:
    
        if (r12 != r5) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(android.content.Context r26, com.instagram.common.session.UserSession r27, X.C40701ud r28, com.instagram.opal.impl.data.OpalProfileData r29, X.InterfaceC23621Ds r30) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepoUtil.A01(android.content.Context, com.instagram.common.session.UserSession, X.1ud, com.instagram.opal.impl.data.OpalProfileData, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r28v0, types: [X.1ud] */
    /* JADX WARN: Type inference failed for: r5v13, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r27, X.C40701ud r28, java.lang.String r29, X.InterfaceC23621Ds r30) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepoUtil.A02(com.instagram.common.session.UserSession, X.1ud, java.lang.String, X.1Ds):java.lang.Object");
    }
}
