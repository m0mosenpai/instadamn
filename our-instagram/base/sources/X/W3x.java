package X;

import android.content.Context;
import android.os.Build;

/* loaded from: classes11.dex */
public final class W3x {
    public static final W3x A00 = new Object();

    public final boolean A00(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && !AbstractC23451Ch.A07(context, AbstractC111324zv.A00(171)) && !context.getSharedPreferences("BARCELONA_DEVICE_PREFERENCE", 0).getBoolean("has_notification_permission_dialog_shown", false)) {
            return true;
        }
        return false;
    }
}
