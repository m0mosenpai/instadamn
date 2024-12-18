package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.2bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53152bx {
    public static Intent A00(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null) {
            try {
                String A02 = A02(activity.getComponentName(), activity);
                parentActivityIntent = null;
                if (A02 != null) {
                    ComponentName componentName = new ComponentName(activity, A02);
                    try {
                        if (A02(componentName, activity) == null) {
                            return Intent.makeMainActivity(componentName);
                        }
                        return new Intent().setComponent(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        android.util.Log.e("NavUtils", AnonymousClass001.A0g("getParentActivityIntent: bad parentActivityName '", A02, "' in manifest"));
                        return null;
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return parentActivityIntent;
    }

    public static Intent A01(ComponentName componentName, Context context) {
        String A02 = A02(componentName, context);
        if (A02 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A02);
        if (A02(componentName2, context) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String A02(ComponentName componentName, Context context) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = 787072;
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str == null) {
            Bundle bundle = ((PackageItemInfo) activityInfo).metaData;
            if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (string.charAt(0) == '.') {
                return AnonymousClass001.A0R(context.getPackageName(), string);
            }
            return string;
        }
        return str;
    }
}
