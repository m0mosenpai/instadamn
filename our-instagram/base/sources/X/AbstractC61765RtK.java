package X;

/* renamed from: X.RtK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61765RtK {
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[Catch: SecurityException -> 0x0042, TryCatch #0 {SecurityException -> 0x0042, blocks: (B:4:0x0004, B:15:0x000b, B:6:0x001d, B:7:0x0024, B:9:0x0036, B:12:0x003e, B:17:0x0018), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[Catch: SecurityException -> 0x0042, TryCatch #0 {SecurityException -> 0x0042, blocks: (B:4:0x0004, B:15:0x000b, B:6:0x001d, B:7:0x0024, B:9:0x0036, B:12:0x003e, B:17:0x0018), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r4, java.lang.String r5) {
        /*
            if (r4 == 0) goto L52
            if (r5 == 0) goto L52
            android.content.pm.PackageManager r3 = r4.getPackageManager()     // Catch: java.lang.SecurityException -> L42
            r2 = 0
            if (r3 == 0) goto L1d
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16 java.lang.SecurityException -> L42
            java.lang.String r1 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16 java.lang.SecurityException -> L42
            r0 = 0
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16 java.lang.SecurityException -> L42
        L16:
            if (r2 == 0) goto L1d
            java.lang.CharSequence r0 = r3.getApplicationLabel(r2)     // Catch: java.lang.SecurityException -> L42
            goto L24
        L1d:
            r0 = 17039375(0x104000f, float:2.4244613E-38)
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.SecurityException -> L42
        L24:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.SecurityException -> L42
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r0, r5)     // Catch: java.lang.SecurityException -> L42
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch: java.lang.SecurityException -> L42
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch: java.lang.SecurityException -> L42
            if (r0 != 0) goto L3e
            java.lang.String r1 = "ClipboardUtil"
            java.lang.String r0 = "Failed to get clipboard service"
            X.C0K8.A0C(r1, r0)     // Catch: java.lang.SecurityException -> L42
            return
        L3e:
            r0.setPrimaryClip(r1)     // Catch: java.lang.SecurityException -> L42
            return
        L42:
            r2 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 != r0) goto L51
            java.lang.String r1 = "ClipboardUtil"
            java.lang.String r0 = "Failed to copy to clipboard"
            X.C0K8.A0F(r1, r0, r2)
            return
        L51:
            throw r2
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61765RtK.A00(android.content.Context, java.lang.String):void");
    }
}
