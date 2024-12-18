package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.3iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80313iL {
    public static final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        if (Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 0.0f) == 0.0f) {
            return true;
        }
        return false;
    }
}
