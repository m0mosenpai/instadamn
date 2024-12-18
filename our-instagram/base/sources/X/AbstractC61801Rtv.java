package X;

/* renamed from: X.Rtv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61801Rtv {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C62664SLa A00(android.content.Context r7) {
        /*
            android.content.pm.PackageManager r5 = r7.getPackageManager()
            java.lang.String r6 = "com.facebook.appmanager"
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldAcceptTos"
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r6, r0)
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowExplicitTos"
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r6, r0)
            r4 = 0
            int r1 = r5.getComponentEnabledSetting(r3)     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            int r0 = r5.getComponentEnabledSetting(r2)     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r5 = 1
            if (r1 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r1 = X.AbstractC167007dF.A1P(r1, r5)
            if (r0 == r5) goto L29
            r5 = 0
        L29:
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            X.SLa r3 = new X.SLa     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r3.<init>(r0, r1, r5)     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            return r3
        L31:
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r0.getReceiverInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63 java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r0.getReceiverInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63 java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5b java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            int r1 = r0.flags     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r0 = r1 & 1
            if (r0 != 0) goto L53
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L5b
        L53:
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            X.SLa r3 = new X.SLa     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r3.<init>(r0, r5, r5)     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            return r3
        L5b:
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            X.SLa r3 = new X.SLa     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r3.<init>(r0, r5, r4)     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            return r3
        L63:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            java.lang.String r0 = "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowTos"
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r3 = 0
            int r0 = r2.getComponentEnabledSetting(r1)     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            r2 = 1
            if (r0 != 0) goto L85
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            r0.getReceiverInfo(r1, r4)     // Catch: java.lang.IllegalArgumentException -> L90
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            X.SLa r1 = new X.SLa     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            r1.<init>(r0, r5, r5)     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            return r1
        L85:
            if (r0 == r5) goto L88
            r2 = 0
        L88:
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            X.SLa r1 = new X.SLa     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            r1.<init>(r0, r2, r2)     // Catch: java.lang.IllegalArgumentException -> L90 java.lang.Throwable -> L97
            return r1
        L90:
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            X.SLa r3 = new X.SLa     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
            r3.<init>(r0, r4, r4)     // Catch: java.lang.Throwable -> L9a java.lang.IllegalArgumentException -> Ld1
        L97:
            if (r3 == 0) goto L9a
            return r3
        L9a:
            java.lang.String r0 = "phone"
            java.lang.Object r3 = r7.getSystemService(r0)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r1 = r3.getSimState()
            r2 = 1
            r0 = 5
            if (r1 != r0) goto Lc9
            java.lang.String r1 = r3.getSimOperator()
            java.lang.String r0 = "2"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto Lc6
            java.lang.String r0 = "302"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto Lc6
            java.lang.Integer r0 = X.C05F.A15
            X.SLa r3 = new X.SLa
            r3.<init>(r0, r2, r4)
            return r3
        Lc6:
            java.lang.Integer r0 = X.C05F.A0u
            goto Lcb
        Lc9:
            java.lang.Integer r0 = X.C05F.A0j
        Lcb:
            X.SLa r3 = new X.SLa
            r3.<init>(r0, r2, r2)
            return r3
        Ld1:
            java.lang.Integer r0 = X.C05F.A0Y
            X.SLa r3 = new X.SLa
            r3.<init>(r0, r4, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61801Rtv.A00(android.content.Context):X.SLa");
    }
}
