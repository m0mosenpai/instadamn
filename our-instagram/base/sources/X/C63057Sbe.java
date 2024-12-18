package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.Sbe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63057Sbe {
    public static final long A00(int i) {
        Calendar calendar = Calendar.getInstance();
        C14360o3.A07(calendar);
        calendar.add(5, 1);
        calendar.set(11, i);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() - System.currentTimeMillis();
    }

    public static final boolean A01(Context context) {
        String str;
        String packageName = context.getPackageName();
        C14360o3.A07(packageName);
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                str = context.getPackageManager().getInstallSourceInfo(packageName).getInstallingPackageName();
            } else {
                str = context.getPackageManager().getInstallerPackageName(packageName);
            }
        } catch (PackageManager.NameNotFoundException e) {
            C0K8.A0G("OxygenScheduledInstallerJobService", AnonymousClass001.A0R("Could not find installer package name for ", packageName), e);
            str = null;
        }
        ArrayList arrayList = C1Ri.A00;
        if (str != null && "com.android.vending".equals(str)) {
            return true;
        }
        return false;
    }
}
