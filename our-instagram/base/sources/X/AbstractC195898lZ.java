package X;

/* renamed from: X.8lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC195898lZ {
    /* JADX WARN: Can't wrap try/catch for region: R(5:26|(1:29)(1:28)|22|24|23) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.content.Context r7, com.instagram.common.session.UserSession r8) {
        /*
            r6 = 0
            X.C14360o3.A0B(r8, r6)
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36316220525383835(0x8105690000109b, double:3.0298623217107055E-306)
            boolean r0 = X.C18U.A06(r5, r8, r0)
            if (r0 == 0) goto L64
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L64
            if (r7 != 0) goto L1e
            android.content.Context r7 = X.AbstractC12290kX.A00
            X.C14360o3.A07(r7)
        L1e:
            r0 = 36330720336233461(0x811299001343f5, double:3.039032060478061E-306)
            boolean r2 = X.C18U.A06(r5, r8, r0)
            X.C14360o3.A0B(r7, r6)
            java.lang.String r1 = "com.facebook.stella_debug"
            java.lang.String r0 = "com.facebook.stella"
            android.content.pm.PackageManager r4 = r7.getPackageManager()
            if (r2 == 0) goto L42
            boolean r0 = X.C0JS.A05(r4, r0)
            if (r0 != 0) goto L40
            boolean r0 = X.C0JS.A05(r4, r1)
            if (r0 == 0) goto L58
        L40:
            r0 = 1
            return r0
        L42:
            if (r4 == 0) goto L58
            r3 = 2
            java.lang.String[] r2 = new java.lang.String[]{r0, r1}
            r1 = 0
        L4a:
            r0 = r2[r1]
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L53
            if (r0 == 0) goto L53
            goto L40
        L53:
            int r1 = r1 + 1
            if (r1 >= r3) goto L58
            goto L4a
        L58:
            r0 = 36316220529316004(0x810569003c10a4, double:3.029862324197425E-306)
            boolean r0 = X.C18U.A06(r5, r8, r0)
            if (r0 == 0) goto L64
            goto L40
        L64:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC195898lZ.A00(android.content.Context, com.instagram.common.session.UserSession):boolean");
    }
}
