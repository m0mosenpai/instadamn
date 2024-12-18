package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class SYW {
    public static Boolean A02;
    public final Context A00;
    public final Handler A01 = new Handler();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(android.content.Intent r11, final int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SYW.A01(android.content.Intent, int):int");
    }

    public SYW(Context context) {
        this.A00 = context;
    }

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
            java.lang.Boolean r0 = X.SYW.A02
            if (r0 == 0) goto Lc
            boolean r1 = r0.booleanValue()
            return r1
        Lc:
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsService"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r0.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r0 == 0) goto L23
            boolean r0 = r0.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r1 = 1
            if (r0 != 0) goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.SYW.A02 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SYW.A00(android.content.Context):boolean");
    }
}
