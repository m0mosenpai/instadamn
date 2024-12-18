package X;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;

/* renamed from: X.1Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC26751Re {
    public static boolean A00(Context context) {
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
        ArrayList arrayList = C1Ri.A00;
        if (installerPackageName != null && "com.android.vending".equals(installerPackageName)) {
            return true;
        }
        return false;
    }
}
