package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.0Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04370Ld {
    public static void A00(PackageManager packageManager, C024209q c024209q, Integer num) {
        C10850hu c10850hu;
        C10860hv c10860hv;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.art", AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            if (packageInfo != null) {
                Integer num2 = C05F.A01;
                if (num == num2) {
                    c10850hu = C0LK.A4L;
                } else {
                    c10850hu = C0LK.A4M;
                }
                c024209q.A03(c10850hu, packageInfo.versionName);
                if (num == num2) {
                    c10860hv = C0LK.A1C;
                } else {
                    c10860hv = C0LK.A1D;
                }
                c024209q.A02(c10860hv, Long.valueOf(packageInfo.getLongVersionCode()));
            }
        } catch (PackageManager.NameNotFoundException e) {
            C0PC.A00().DEh("ArtVer", e, null);
        }
    }
}
