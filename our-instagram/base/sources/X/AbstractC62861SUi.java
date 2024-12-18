package X;

/* renamed from: X.SUi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62861SUi {
    public static volatile THe A01 = RLH.A00;
    public static final Object A00 = AbstractC58318PtA.A0b();

    /* JADX WARN: Can't wrap try/catch for region: R(10:20|(7:22|(1:24)|25|(1:27)|29|30|31)|32|33|34|35|(1:37)|29|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if ("com.google.android.gms".equals(((android.content.pm.PackageItemInfo) r0).packageName) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r7 = "com.google.android.gms.phenotype"
            java.lang.String r1 = r9.getAuthority()
            boolean r0 = r7.equals(r1)
            r5 = 0
            if (r0 != 0) goto L19
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            X.AbstractC58321PtD.A1Q(r2, r1, r0)
            return r5
        L19:
            X.THe r0 = X.AbstractC62861SUi.A01
            boolean r0 = r0 instanceof X.RLG
            if (r0 != 0) goto L85
            java.lang.Object r6 = X.AbstractC62861SUi.A00
            monitor-enter(r6)
            X.THe r0 = X.AbstractC62861SUi.A01     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0 instanceof X.RLG     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L3f
            X.THe r1 = X.AbstractC62861SUi.A01     // Catch: java.lang.Throwable -> L82
            boolean r0 = r1 instanceof X.RLG     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L38
            X.RLG r1 = (X.RLG) r1     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r1.A00     // Catch: java.lang.Throwable -> L82
            boolean r0 = X.AbstractC166987dD.A1a(r0)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            return r0
        L38:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L3f:
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r0 = r8.getPackageName()     // Catch: java.lang.Throwable -> L82
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L66
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L82
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L82
            r1 = 29
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r2 >= r1) goto L58
            r0 = 0
        L58:
            android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r7, r0)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L75
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L82
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L75
        L66:
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L82
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75 java.lang.Throwable -> L82
            int r0 = r0.flags     // Catch: java.lang.Throwable -> L82
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L75
            r5 = 1
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L82
            X.RLG r0 = new X.RLG     // Catch: java.lang.Throwable -> L82
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L82
            X.AbstractC62861SUi.A01 = r0     // Catch: java.lang.Throwable -> L82
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            goto L85
        L82:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            throw r0
        L85:
            X.THe r1 = X.AbstractC62861SUi.A01
            boolean r0 = r1 instanceof X.RLG
            if (r0 == 0) goto L94
            X.RLG r1 = (X.RLG) r1
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            return r0
        L94:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62861SUi.A00(android.content.Context, android.net.Uri):boolean");
    }
}
