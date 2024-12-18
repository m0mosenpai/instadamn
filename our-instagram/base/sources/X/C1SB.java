package X;

import android.content.pm.PackageInfo;
import java.util.HashSet;

/* renamed from: X.1SB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1SB {
    public static Integer A00(PackageInfo packageInfo) {
        int i = packageInfo.applicationInfo.flags;
        boolean z = false;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        if (!z2 && !z) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static HashSet A01(PackageInfo packageInfo) {
        int[] iArr;
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null && (iArr = packageInfo.requestedPermissionsFlags) != null && strArr.length == iArr.length) {
            HashSet hashSet = new HashSet();
            int i = 0;
            while (true) {
                String[] strArr2 = packageInfo.requestedPermissions;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        hashSet.add(str);
                    }
                    i++;
                } else {
                    return hashSet;
                }
            }
        } else {
            return new HashSet();
        }
    }
}
