package X;

/* renamed from: X.Id1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41672Id1 {
    public static final C41672Id1 A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if ((java.lang.Integer.parseInt(r1) - java.lang.Integer.parseInt(r2)) >= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        return new X.C38673GzE(X.VHi.OEM_FALLBACK_UNSUPPORTED_OEM_STORE_VERSION, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C38673GzE A00(android.content.pm.PackageManager r5, java.lang.String r6, java.lang.String r7) {
        /*
            if (r5 == 0) goto L51
            r0 = 0
            android.content.pm.PackageInfo r0 = r5.getPackageInfo(r6, r0)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            java.lang.String r1 = r0.versionName     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r1 != 0) goto Ld
            java.lang.String r1 = ""
        Ld:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r0 != 0) goto L51
            boolean r0 = r7.isEmpty()     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r0 != 0) goto L51
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r1.split(r0)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            java.lang.String[] r5 = r7.split(r0)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            int r1 = r6.length     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            int r0 = r5.length     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            int r4 = java.lang.Math.min(r1, r0)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            r3 = 0
        L2a:
            if (r3 >= r4) goto L51
            r1 = r6[r3]     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            r2 = r5[r3]     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            boolean r0 = r1.equals(r2)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            if (r0 != 0) goto L40
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            int r1 = r1 - r0
            goto L43
        L40:
            int r3 = r3 + 1
            goto L2a
        L43:
            if (r1 >= 0) goto L51
            X.VHi r1 = X.VHi.OEM_FALLBACK_UNSUPPORTED_OEM_STORE_VERSION     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            r0 = 1
            X.GzE r2 = new X.GzE     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            r2.<init>(r1, r0)     // Catch: java.lang.NumberFormatException -> L4e android.content.pm.PackageManager.NameNotFoundException -> L54
            return r2
        L4e:
            X.VHi r1 = X.VHi.OEM_FALLBACK_UNSUPPORTED_OEM_STORE_VERSION
            goto L56
        L51:
            r1 = 0
            r0 = 0
            goto L57
        L54:
            X.VHi r1 = X.VHi.OEM_FALLBACK_OEM_STORE_NOT_FOUND
        L56:
            r0 = 1
        L57:
            X.GzE r2 = new X.GzE
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41672Id1.A00(android.content.pm.PackageManager, java.lang.String, java.lang.String):X.GzE");
    }
}
