package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;

/* renamed from: X.2KS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KS extends AbstractC48222Jl {
    public static final android.net.Uri A00;
    public static final android.net.Uri A01;

    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        Bundle call;
        C14360o3.A0B(context, 1);
        String A012 = AbstractC13180m4.A01(context);
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", AbstractC48222Jl.A00(context).getClassName());
        bundle.putInt("badgenumber", i);
        try {
            if (C14360o3.A0K(A012, "com.transsion.XOSLauncher")) {
                call = context.getContentResolver().call(A01, "change_badge", (String) null, bundle);
            } else {
                if (!C14360o3.A0K(A012, "com.transsion.hilauncher")) {
                    return false;
                }
                call = context.getContentResolver().call(A00, "change_badge", (String) null, bundle);
            }
            if (call == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C0w9.A06("TranssionLauncherBadges", "unexpected exception", e);
            return false;
        }
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        PackageManager packageManager;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        if ((str.equals("com.transsion.XOSLauncher") || str.equals("com.transsion.hilauncher")) && (packageManager = context.getPackageManager()) != null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            try {
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                if (resolveActivity != null) {
                    PermissionInfo[] permissionInfoArr = packageManager.getPackageInfo(((PackageItemInfo) resolveActivity.activityInfo).packageName, 4096).permissions;
                    if (permissionInfoArr == null) {
                        permissionInfoArr = new PermissionInfo[0];
                    }
                    for (PermissionInfo permissionInfo : permissionInfoArr) {
                        if ("com.transsion.hilauncher.permission.CHANGE_BADGE".equals(((PackageItemInfo) permissionInfo).name) || "com.transsion.XOSLauncher.permission.CHANGE_BADGE".equals(((PackageItemInfo) permissionInfo).name)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    static {
        android.net.Uri A03 = AbstractC08820cl.A03("content://com.transsion.XOSLauncher.unreadprovider");
        C14360o3.A07(A03);
        A01 = A03;
        android.net.Uri A032 = AbstractC08820cl.A03("content://com.transsion.hilauncher.unreadprovider");
        C14360o3.A07(A032);
        A00 = A032;
    }
}
