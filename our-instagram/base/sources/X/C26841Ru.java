package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.1Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26841Ru {
    public final Context A00;
    public final PackageManager A01;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r2 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SIH A00() {
        /*
            r12 = this;
            r0 = 192(0xc0, float:2.69E-43)
            r6 = 0
            android.content.pm.PackageManager r1 = r12.A01     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r5 = "com.facebook.services"
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            if (r0 != 0) goto L10
            return r6
        L10:
            java.lang.Integer r7 = X.C1SB.A00(r4)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.lang.String r0 = "android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST"
            int r0 = r1.checkPermission(r0, r5)
            if (r0 == 0) goto L26
            X.4gf r0 = X.EnumC101234gf.FACEBOOK_SERVICES_NO_PERMISSION
            r8.add(r0)
        L26:
            r3 = 1
            r2 = 0
            android.content.Context r1 = r12.A00     // Catch: java.lang.Throwable -> L38
            java.lang.Class<android.os.PowerWhitelistManager> r0 = android.os.PowerWhitelistManager.class
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L38
            android.os.PowerWhitelistManager r0 = (android.os.PowerWhitelistManager) r0     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            boolean r2 = r0.isWhitelisted(r5, r3)     // Catch: java.lang.Throwable -> L38
        L38:
            if (r2 != 0) goto L3f
        L3a:
            X.4gf r0 = X.EnumC101234gf.FACEBOOK_SERVICES_NO_DOZE_MODE_WHITELIST
            r8.add(r0)
        L3f:
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            boolean r10 = r0.enabled
            int r9 = r4.versionCode
            boolean r11 = r8.isEmpty()
            X.SIH r6 = new X.SIH
            r6.<init>(r7, r8, r9, r10, r11)
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26841Ru.A00():X.SIH");
    }

    public C26841Ru(Context context, PackageManager packageManager) {
        this.A01 = packageManager;
        this.A00 = context;
    }
}
