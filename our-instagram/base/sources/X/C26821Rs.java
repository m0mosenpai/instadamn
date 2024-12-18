package X;

import android.content.pm.PackageManager;

/* renamed from: X.1Rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26821Rs {
    public final PackageManager A00;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1SI A00() {
        /*
            r11 = this;
            r2 = 192(0xc0, float:2.69E-43)
            r4 = 0
            android.content.pm.PackageManager r1 = r11.A00     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            java.lang.String r0 = "com.facebook.appmanager"
            android.content.pm.PackageInfo r2 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo
            if (r3 != 0) goto L10
            return r4
        L10:
            java.lang.Integer r5 = X.C1SB.A00(r2)
            java.lang.String r1 = r3.dataDir
            if (r1 == 0) goto L80
            java.lang.String r0 = "/0/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L73
            java.lang.Integer r6 = X.C05F.A00
        L22:
            android.content.pm.Signature[] r3 = r2.signatures
            if (r3 == 0) goto L70
            int r1 = r3.length
            r0 = 1
            if (r1 != r0) goto L70
            r0 = 0
            r1 = r3[r0]
            android.content.pm.Signature r0 = X.C1SC.A01
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.Integer r7 = X.C05F.A00
        L37:
            int r1 = r2.versionCode
            r0 = 20297189(0x135b5e5, float:3.3374953E-38)
            r9 = -1
            if (r1 < r0) goto L40
            r9 = 1
        L40:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L4e
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L4e
            java.lang.String r0 = "com.facebook.appmanager.api.level"
            int r9 = r1.getInt(r0, r9)
        L4e:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            boolean r10 = r0.enabled
            int r8 = r2.versionCode
            X.1SI r4 = new X.1SI
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L59:
            return r4
        L5a:
            android.content.pm.Signature r0 = X.C1SC.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            java.lang.Integer r7 = X.C05F.A01
            goto L37
        L65:
            android.content.pm.Signature r0 = X.C1SC.A02
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
            java.lang.Integer r7 = X.C05F.A0C
            goto L37
        L70:
            java.lang.Integer r7 = X.C05F.A0N
            goto L37
        L73:
            java.lang.String r1 = r3.dataDir
            java.lang.String r0 = "/10/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L80
            java.lang.Integer r6 = X.C05F.A01
            goto L22
        L80:
            java.lang.Integer r6 = X.C05F.A0C
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26821Rs.A00():X.1SI");
    }

    public C26821Rs(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
