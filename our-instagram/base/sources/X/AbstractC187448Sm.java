package X;

import android.app.Activity;
import com.facebook.R;

/* renamed from: X.8Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC187448Sm {
    public static final float A00(Activity activity, float f) {
        if (f == 1.0f) {
            return 0.0f;
        }
        int A01 = AbstractC56402iY.A01(activity);
        return (((A01 + r3) * (1.0f - f)) + activity.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height)) / activity.getResources().getDisplayMetrics().heightPixels;
    }

    public static final float A01(Activity activity, float f) {
        float f2 = EnumC187428Sk.A0B.A00;
        float f3 = EnumC187428Sk.A09.A00;
        float dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
        if (f >= f2 && f < f3) {
            return ((f3 - f) / (f3 - f2)) * dimensionPixelSize;
        }
        if (f < f2) {
            return (float) AbstractC70163Da.A04(f, 0.0d, f2, 0.0d, dimensionPixelSize);
        }
        return activity.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
    }
}
