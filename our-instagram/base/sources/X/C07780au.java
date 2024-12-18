package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import java.util.List;

/* renamed from: X.0au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07780au extends C0OK {
    @Override // X.C0OK
    public final boolean A0G() {
        return false;
    }

    @Override // X.C0OK
    public final Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0OK
    public final Intent A0D(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0OK
    public final Integer A0E() {
        return C05F.A1I;
    }

    @Override // X.C0OK
    public final List A0F(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0OK
    public final boolean A0H(Context context, C08110bX c08110bX) {
        ApplicationInfo applicationInfo = c08110bX.A00;
        if (applicationInfo == null) {
            return false;
        }
        return AbstractC08590cN.A00().A02(context, applicationInfo.uid);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:1: B:36:0x0082->B:48:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Comparator] */
    @Override // X.C0OK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent A0C(android.content.Context r9, android.content.Intent r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 65600(0x10040, float:9.1925E-41)
            java.util.List r3 = X.C0OK.A03(r9, r10, r0)
            java.util.Iterator r6 = r3.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r5 = r6.next()
            android.content.pm.ActivityInfo r5 = (android.content.pm.ActivityInfo) r5
            java.lang.String r2 = r5.permission
            boolean r0 = r5.exported
            r1 = 0
            if (r0 == 0) goto L3b
            if (r2 == 0) goto L3f
            X.C14360o3.A0B(r9, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.content.pm.PackageManager r0 = r9.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.content.pm.PermissionInfo r0 = r0.getPermissionInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            X.C14360o3.A07(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r4 = r0.protectionLevel     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r2 = 2
            r1 = 16
            r0 = r4 & 2
            if (r0 == r2) goto L3b
            r0 = r4 & 16
            if (r0 != r1) goto L3f
        L3b:
            r6.remove()
            goto Lb
        L3f:
            android.content.pm.ApplicationInfo r0 = r5.applicationInfo
            X.0Dc r1 = X.AbstractC08590cN.A00()
            if (r0 == 0) goto L3b
            int r0 = r0.uid
            boolean r0 = r1.A02(r9, r0)
            if (r0 != 0) goto Lb
            goto L3b
        L50:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L61
            X.0bW r2 = r8.A01
            java.lang.String r1 = "FamilyAccessibleByAnyAppIntentScope"
            java.lang.String r0 = "No matching family, public components."
            r10 = 0
            r2.EHA(r1, r0, r10)
            return r10
        L61:
            java.lang.String r0 = "CI_SKIP_CALLER_FROM_ACTIVITY"
            r1 = 1
            r10.putExtra(r0, r1)
            java.lang.Integer r6 = r8.A02
            X.0bD r0 = new X.0bD
            r0.<init>()
            java.util.Collections.sort(r3, r0)
            r0 = 0
            java.lang.Object r5 = r3.get(r0)
            android.content.pm.PackageItemInfo r5 = (android.content.pm.PackageItemInfo) r5
            int r0 = r3.size()
            if (r0 <= r1) goto Lb1
            java.util.Iterator r7 = r3.iterator()
        L82:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r4 = r7.next()
            android.content.pm.PackageItemInfo r4 = (android.content.pm.PackageItemInfo) r4
            java.lang.String r0 = r4.packageName     // Catch: java.lang.SecurityException -> L99
            boolean r0 = X.AbstractC08450c9.A04(r9, r0)     // Catch: java.lang.SecurityException -> L99
            r0 = r0 ^ 1
            if (r0 == 0) goto La9
            goto Lac
        L99:
            r3 = move-exception
            X.0bW r2 = r8.A01
            java.lang.String r1 = "Error verifying the signature for "
            java.lang.String r0 = r4.packageName
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "FamilyAccessibleByAnyAppIntentScope"
            r2.EHA(r0, r1, r3)
        La9:
            java.lang.Integer r0 = X.C05F.A00
            goto Lae
        Lac:
            java.lang.Integer r0 = X.C05F.A01
        Lae:
            if (r6 != r0) goto L82
            r5 = r4
        Lb1:
            java.lang.String r2 = r5.packageName
            java.lang.String r1 = r5.name
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            r10.setComponent(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07780au.A0C(android.content.Context, android.content.Intent, java.lang.String):android.content.Intent");
    }
}
