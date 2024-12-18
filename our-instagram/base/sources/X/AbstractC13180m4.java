package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.0m4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13180m4 {
    public static String A00;

    public static final String A00(Context context) {
        C14360o3.A0B(context, 0);
        String str = A00;
        if (str == null) {
            str = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        }
        A00 = str;
        return str;
    }

    public static final String A01(Context context) {
        ActivityInfo activityInfo;
        C14360o3.A0B(context, 0);
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
                if (resolveActivity != null) {
                    activityInfo = resolveActivity.activityInfo;
                } else {
                    activityInfo = null;
                }
                if (activityInfo != null) {
                    String str = ((PackageItemInfo) resolveActivity.activityInfo).packageName;
                    C14360o3.A06(str);
                    return str;
                }
                return "";
            }
            throw new IllegalStateException("Required value was null.");
        } catch (RuntimeException unused) {
            return "";
        }
    }

    public static final boolean A02(Context context) {
        C14360o3.A0B(context, 0);
        if (Build.VERSION.SDK_INT >= 35 && context.getApplicationInfo().targetSdkVersion >= 35) {
            return true;
        }
        return false;
    }

    public static final boolean A03(String str) {
        C14360o3.A0B(str, 0);
        return C0JS.A05(AbstractC12290kX.A00.getPackageManager(), str);
    }
}
