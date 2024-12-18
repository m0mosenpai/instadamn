package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14480oK {
    public static void A00(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        C12260kU.A0E(context, intent);
    }

    public static boolean A01(Context context) {
        return new C23821Ep(context).A00.areNotificationsEnabled();
    }
}
