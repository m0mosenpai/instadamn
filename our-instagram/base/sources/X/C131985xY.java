package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.5xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131985xY {
    public static String A00 = "Unknown";
    public static volatile boolean A01;

    public static final String A00(Context context) {
        if (!A01) {
            synchronized (C131985xY.class) {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo != null) {
                        String str = packageInfo.versionName;
                        if (str == null) {
                            str = "";
                        }
                        A00 = str;
                        A01 = true;
                    } else {
                        C0K8.A0Q("ApplicationManifestHelper", "Package info for %s is null", context.getPackageName());
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    C0K8.A0L("ApplicationManifestHelper", "Failed to get package info for %s", e, context.getPackageName());
                }
            }
        }
        return A00;
    }
}
