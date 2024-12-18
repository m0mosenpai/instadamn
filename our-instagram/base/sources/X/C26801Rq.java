package X;

import android.content.pm.PackageManager;

/* renamed from: X.1Rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26801Rq {
    public final PackageManager A00;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1TO A00() {
        /*
            r12 = this;
            r1 = 4288(0x10c0, float:6.009E-42)
            r5 = 0
            android.content.pm.PackageManager r6 = r12.A00     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8d
            java.lang.String r0 = "com.facebook.system"
            android.content.pm.PackageInfo r2 = r6.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8d
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 != 0) goto L10
            return r5
        L10:
            java.lang.Integer r7 = X.C1SB.A00(r2)
            android.content.pm.Signature[] r1 = r2.signatures
            if (r1 == 0) goto Lc5
            int r0 = r1.length
            r4 = 1
            if (r0 != r4) goto Lc5
            r5 = 0
            r3 = r1[r5]
            android.content.pm.Signature r0 = X.C1SC.A01
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L90
            X.1TK r6 = X.C1TK.FB_INSTALLER_OLD_SIGN
        L29:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            r3 = 1
            if (r0 == 0) goto L8e
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L8e
            java.lang.String r0 = "com.facebook.system.api.level"
            int r10 = r1.getInt(r0, r3)
        L38:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.HashSet r1 = X.C1SB.A01(r2)
            java.lang.String r0 = "android.permission.INSTALL_PACKAGES"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4e
            X.1TL r0 = X.C1TL.INSTALL
            r8.add(r0)
        L4e:
            java.lang.String r0 = "android.permission.DELETE_PACKAGES"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L5b
            X.1TL r0 = X.C1TL.DELETE
            r8.add(r0)
        L5b:
            java.lang.String r0 = "android.permission.CHANGE_COMPONENT_ENABLED_STATE"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L68
            X.1TL r0 = X.C1TL.SET_COMPONENT_STATE
            r8.add(r0)
        L68:
            java.lang.String r0 = "android.permission.REAL_GET_TASKS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L75
            X.1TL r0 = X.C1TL.GET_RUNNING_APPS
            r8.add(r0)
        L75:
            java.lang.String r0 = "android.permission.INSTALL_PACKAGE_UPDATES"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L82
            X.1TL r0 = X.C1TL.INSTALL_PACKAGE_UPDATES
            r8.add(r0)
        L82:
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            boolean r11 = r0.enabled
            int r9 = r2.versionCode
            X.1TO r5 = new X.1TO
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L8d:
            return r5
        L8e:
            r10 = 1
            goto L38
        L90:
            android.content.pm.Signature r0 = X.C1SC.A00
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9b
            X.1TK r6 = X.C1TK.FB_INSTALLER_NEW_SIGN
            goto L29
        L9b:
            android.content.pm.Signature r0 = X.C1SC.A02
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La6
            X.1TK r6 = X.C1TK.FB_INSTALLER_UPDATE_ONLY_SIGN
            goto L29
        La6:
            java.lang.String r1 = "android"
            r0 = 64
            android.content.pm.PackageInfo r0 = r6.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc1
            android.content.pm.Signature[] r1 = r0.signatures
            if (r1 == 0) goto Lc5
            int r0 = r1.length
            if (r0 != r4) goto Lc5
            r0 = r1[r5]
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lc5
            X.1TK r6 = X.C1TK.FB_INSTALLER_OEM_SIGN
            goto L29
        Lc1:
            X.1TK r6 = X.C1TK.FB_INSTALLER_UNKNOWN_SIGN
            goto L29
        Lc5:
            X.1TK r6 = X.C1TK.FB_INSTALLER_UNKNOWN_SIGN
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26801Rq.A00():X.1TO");
    }

    public C26801Rq(PackageManager packageManager) {
        this.A00 = packageManager;
    }
}
