package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: X.4qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106434qx {
    public static final C106434qx A00 = new Object();

    public static final String A00(Context context, String str) {
        ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 128).applicationInfo;
        if (applicationInfo == null) {
            return null;
        }
        Object obj = applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    public final Integer A01(Context context, boolean z, boolean z2) {
        boolean z3;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return C05F.A00;
        }
        EnumC106454qz A002 = AbstractC106444qy.A00(packageManager);
        if (A002 != null && ((A002 == EnumC106454qz.A04 && z) || (A002 == EnumC106454qz.A03 && z2))) {
            try {
                String str = A002.A00;
                C14360o3.A07(str);
                String A003 = A00(context, str);
                String packageName = context.getPackageName();
                C14360o3.A07(packageName);
                z3 = C14360o3.A0K(A003, A00(context, packageName));
            } catch (Exception e) {
                C0K8.A0J("HeliumTrampolineServiceEligibility", "There was an error trying to determine the architecture of a package: ", e);
                z3 = true;
            }
            if (!z3) {
                return C05F.A0C;
            }
            return C05F.A0Y;
        }
        return C05F.A01;
    }
}
