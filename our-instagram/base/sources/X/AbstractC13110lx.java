package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: X.0lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13110lx {
    public static final Activity A00(Activity activity) {
        C14360o3.A0B(activity, 0);
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        return activity;
    }

    public static final void A01(Activity activity, Configuration configuration) {
        C14360o3.A0B(configuration, 1);
        Resources resources = activity.getResources();
        Configuration configuration2 = resources.getConfiguration();
        int i = configuration2.orientation;
        int i2 = configuration.orientation;
        if (i != i2) {
            configuration2.orientation = i2;
            activity.createConfigurationContext(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            int max = Math.max(i3, i4);
            int min = Math.min(i3, i4);
            int i5 = configuration.orientation;
            if (i5 != 1) {
                if (i5 == 2) {
                    displayMetrics.widthPixels = max;
                    displayMetrics.heightPixels = min;
                    return;
                }
                return;
            }
            displayMetrics.widthPixels = min;
            displayMetrics.heightPixels = max;
        }
    }
}
