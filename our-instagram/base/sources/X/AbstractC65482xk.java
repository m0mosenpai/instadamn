package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.2xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC65482xk {
    public static boolean A00() {
        SharedPreferences sharedPreferences;
        Context context = AbstractC12290kX.A00;
        if (context != null) {
            sharedPreferences = context.getSharedPreferences("BinderGroupDebugUtil_Prefs", 0);
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean("binder_group_name_overlay_enabled", false);
    }

    public static boolean A01() {
        SharedPreferences sharedPreferences;
        Context context = AbstractC12290kX.A00;
        if (context != null) {
            sharedPreferences = context.getSharedPreferences("BinderGroupDebugUtil_Prefs", 0);
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean("recyclerview_bind_debug_enabled", false);
    }
}
