package com.facebook.react.modules.i18nmanager;

import X.C14360o3;
import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class I18nUtil {
    public static final I18nUtil A00 = new Object();

    public final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final boolean A01(Context context) {
        C14360o3.A0B(context, 0);
        if ((context.getApplicationInfo().flags & 4194304) != 0) {
            if (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false)) {
                String property = System.getProperty("FORCE_RTL_FOR_TESTING", "false");
                if (property != null && property.equalsIgnoreCase("true")) {
                    return true;
                }
                if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
