package X;

import android.app.Activity;

/* renamed from: X.48y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC917648y {
    public static void A00(Activity activity, int i) {
        if (activity != null) {
            try {
                activity.setRequestedOrientation(i);
            } catch (IllegalStateException e) {
                if ("Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    C0K8.A0N("FixedOrientationCompat", "%s hit fixed orientation exception", e, AbstractC03870Jc.A00(activity.getClass()));
                    return;
                }
                throw e;
            }
        }
    }
}
