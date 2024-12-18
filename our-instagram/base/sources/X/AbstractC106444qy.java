package X;

/* renamed from: X.4qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106444qy {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r4.versionCode < 455772526) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r0.getInt("com.facebook.services.helium.trampoline.api.level", r1) >= 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC106454qz A00(android.content.pm.PackageManager r8) {
        /*
            X.4qz r7 = X.EnumC106454qz.A04
            r5 = 0
            java.lang.String r2 = "com.facebook.services"
            java.lang.String r1 = "com.facebook.oxygen.services.helium.trampoline.HeliumSandboxedService"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            r0.<init>(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            android.content.pm.ServiceInfo r0 = r8.getServiceInfo(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            boolean r0 = r0.exported
            if (r0 == 0) goto L43
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L42
            r6 = 2
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r8.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L43
            java.lang.String r3 = "com.facebook.services.helium.trampoline.api.level"
            java.lang.String r0 = r4.packageName
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L33
            int r2 = r4.versionCode
            r0 = 455772526(0x1b2a896e, float:1.4106476E-22)
            r1 = 1
            if (r2 >= r0) goto L34
        L33:
            r1 = 0
        L34:
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            if (r0 == 0) goto L43
            android.os.Bundle r0 = r0.metaData
            if (r0 == 0) goto L43
            int r0 = r0.getInt(r3, r1)
            if (r0 < r6) goto L43
        L42:
            return r7
        L43:
            X.4qz r7 = X.EnumC106454qz.A03
            java.lang.String r2 = "com.facebook.appmanager"
            java.lang.String r1 = "com.facebook.oxygen.appmanager.helium.trampoline.HeliumSandboxedService"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            r0.<init>(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            android.content.pm.ServiceInfo r0 = r8.getServiceInfo(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            boolean r0 = r0.exported
            if (r0 == 0) goto L57
            return r7
        L57:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC106444qy.A00(android.content.pm.PackageManager):X.4qz");
    }
}
