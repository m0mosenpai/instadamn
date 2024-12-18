package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: X.02G, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C02G {
    public static int A00(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (!new C23821Ep(context).A00.areNotificationsEnabled()) {
                    return -1;
                }
                return 0;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context A01(Context context) {
        C53082bp A00 = AbstractC195338kZ.A00(context);
        if (Build.VERSION.SDK_INT <= 32) {
            LocaleList localeList = ((C53092bq) A00.A00).A00;
            if (!localeList.isEmpty()) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.setLocales(localeList);
                return context.createConfigurationContext(configuration);
            }
            return context;
        }
        return context;
    }

    public static ColorStateList A02(Context context, int i) {
        return C3WY.A01(context.getTheme(), context.getResources(), i);
    }
}
