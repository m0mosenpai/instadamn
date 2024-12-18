package X;

/* renamed from: X.Ezb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33996Ezb {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2.resolveActivityInfo(r7, 0) == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FQ r10) {
        /*
            r9 = 1
            androidx.fragment.app.Fragment r0 = X.C6BQ.A01(r10)
            android.content.Context r3 = r0.requireContext()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 18301031741918444(0x4104b100000cec, double:1.893351593288388E-307)
            boolean r0 = X.C1AD.A06(r2, r0)
            r4 = 0
            if (r0 == 0) goto L91
            android.content.Context r8 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L8b
            android.content.pm.PackageManager r7 = r3.getPackageManager()     // Catch: java.lang.Exception -> L8b
            if (r7 == 0) goto L91
            X.1Ro r1 = new X.1Ro     // Catch: java.lang.Exception -> L8b
            r1.<init>(r8, r7)     // Catch: java.lang.Exception -> L8b
            r0 = 18
            boolean r0 = r1.A01(r0)     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L91
            java.lang.String r6 = "com.facebook.appmanager"
            java.lang.String r5 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Exception -> L3e java.lang.Exception -> L8b
            r0.<init>(r6, r5)     // Catch: java.lang.Exception -> L3e java.lang.Exception -> L8b
            int r0 = r7.getComponentEnabledSetting(r0)     // Catch: java.lang.Exception -> L3e java.lang.Exception -> L8b
            if (r0 != r9) goto L91
            goto L60
        L3e:
            java.lang.String r0 = X.AbstractC34370FDm.A00     // Catch: java.lang.Exception -> L8b
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L8b
            r2.<init>(r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r6 = "com.facebook.appmanager"
            java.lang.String r5 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Exception -> L8b
            r0.<init>(r6, r5)     // Catch: java.lang.Exception -> L8b
            r2.setComponent(r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = r8.getPackageName()     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "package_name"
            r2.putExtra(r0, r1)     // Catch: java.lang.Exception -> L8b
            android.content.pm.ActivityInfo r0 = r2.resolveActivityInfo(r7, r4)     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L91
        L60:
            java.lang.String r0 = X.AbstractC34370FDm.A00     // Catch: android.content.ActivityNotFoundException -> L87
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L87
            r2.<init>(r0)     // Catch: android.content.ActivityNotFoundException -> L87
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.ActivityNotFoundException -> L87
            r0.<init>(r6, r5)     // Catch: android.content.ActivityNotFoundException -> L87
            r2.setComponent(r0)     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.ActivityNotFoundException -> L87
            java.lang.String r0 = "package_name"
            r2.putExtra(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L87
            X.0b3 r1 = X.C0b3.A00()     // Catch: android.content.ActivityNotFoundException -> L87
            X.0Dc r0 = X.AbstractC34371FDn.A00     // Catch: android.content.ActivityNotFoundException -> L87
            X.0bI r0 = r1.A0B(r0)     // Catch: android.content.ActivityNotFoundException -> L87
            r0.A0G(r3, r2)     // Catch: android.content.ActivityNotFoundException -> L87
            r4 = 1
            goto L91
        L87:
            r1 = move-exception
            java.lang.String r0 = "Failed to launch App-Update-Settings activity within AppManage"
            goto L8e
        L8b:
            r1 = move-exception
            java.lang.String r0 = "isAppUpdateSettingsSupported query failed"
        L8e:
            X.C0w9.A07(r0, r1)
        L91:
            r3 = 0
            if (r4 != 0) goto La4
            X.0ll r2 = X.C6BQ.A0B(r10)
            X.ElD r1 = new X.ElD
            r1.<init>()
            androidx.fragment.app.FragmentActivity r0 = X.C6BQ.A04(r10)
            X.AbstractC31177DnL.A0w(r3, r1, r0, r2)
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC33996Ezb.A00(X.6FQ):java.lang.Object");
    }
}
