package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08120bY {
    public static final ProviderInfo A01(Context context, String str, int i) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(i));
        }
        return packageManager.resolveContentProvider(str, i);
    }

    public static final C08110bX A02(Context context, String str, int i) {
        PackageInfo packageInfo;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        PackageManager packageManager = context.getPackageManager();
        if ((i & 64) == 64) {
            i = (i & (-65)) | 134217728;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i));
        } else {
            packageInfo = packageManager.getPackageInfo(str, i);
        }
        if (packageInfo != null) {
            return new C08110bX(packageInfo);
        }
        throw new PackageManager.NameNotFoundException(AnonymousClass001.A0R("PackageManager returned null PackageInfo for ", str));
    }

    public static final List A03(Context context) {
        List<PackageInfo> installedPackages;
        C14360o3.A0B(context, 0);
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            installedPackages = packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(134217728L));
        } else {
            installedPackages = packageManager.getInstalledPackages(134217728);
        }
        C14360o3.A0A(installedPackages);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(installedPackages, 10));
        for (PackageInfo packageInfo : installedPackages) {
            C14360o3.A0A(packageInfo);
            arrayList.add(new C08110bX(packageInfo));
        }
        return arrayList;
    }

    public static final List A04(Context context, Intent intent, int i) {
        List<ResolveInfo> queryIntentActivities;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(i));
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, i);
        }
        C14360o3.A0A(queryIntentActivities);
        return queryIntentActivities;
    }

    public static final List A05(Context context, Intent intent, int i) {
        List<ResolveInfo> queryIntentServices;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentServices = packageManager.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(i));
        } else {
            queryIntentServices = packageManager.queryIntentServices(intent, i);
        }
        C14360o3.A0A(queryIntentServices);
        return queryIntentServices;
    }

    public static final ApplicationInfo A00(Context context, String str) {
        ApplicationInfo applicationInfo;
        C14360o3.A0B(str, 1);
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            applicationInfo = packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(128L));
        } else {
            applicationInfo = packageManager.getApplicationInfo(str, 128);
        }
        C14360o3.A0A(applicationInfo);
        return applicationInfo;
    }
}
