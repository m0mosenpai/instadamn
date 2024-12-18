package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.HashSet;

/* renamed from: X.0gA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09980gA {
    public static HashSet A00(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo != null && packageInfo.splitNames != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.splitNames;
                    if (i >= strArr.length) {
                        break;
                    }
                    hashSet.add(strArr[i]);
                    if (!AbstractC10000gD.A01(context, packageInfo.splitNames[i])) {
                        C0K8.A0Q("InstalledSplitUtil", "Module %s is marked as installed through package manager but the split file does not exist at the expected location", packageInfo.splitNames[i]);
                    } else {
                        File A00 = AbstractC10000gD.A00(context, packageInfo.splitNames[i]);
                        if (A00 != null) {
                            A00.toString();
                        }
                    }
                    i++;
                }
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException e) {
            C0K8.A0J("InstalledSplitUtil", "our package is not found in the package manager!", e);
            return new HashSet();
        }
    }
}
