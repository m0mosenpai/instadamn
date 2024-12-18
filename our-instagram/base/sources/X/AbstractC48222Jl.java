package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.2Jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48222Jl {
    public abstract boolean A01(Context context, int i);

    public abstract boolean A02(Context context, String str);

    public static final ComponentName A00(Context context) {
        String str;
        ComponentName component;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null || (str = component.getClassName()) == null || str.length() == 0) {
            str = "";
        }
        return new ComponentName(context, str);
    }
}
