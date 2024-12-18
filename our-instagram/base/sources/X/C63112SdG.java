package X;

/* renamed from: X.SdG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63112SdG {
    public static C63155Se3 A00;
    public static Object A01 = AbstractC58318PtA.A0b();
    public static Boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((android.content.pm.ComponentInfo) r0).enabled == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(android.content.Context r4) {
        /*
            X.C3U5.A02(r4)
            java.lang.Boolean r0 = X.C63112SdG.A02
            if (r0 == 0) goto Lc
            boolean r1 = r0.booleanValue()
            return r1
        Lc:
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r0.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r0 = r1.getReceiverInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r0 == 0) goto L23
            boolean r0 = r0.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r1 = 1
            if (r0 != 0) goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C63112SdG.A02 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63112SdG.A00(android.content.Context):boolean");
    }
}
