package X;

import android.app.Activity;

/* loaded from: classes5.dex */
public abstract class CCN {
    public static long A00(Activity activity) {
        return activity.isLaunchedFromBubble() ? 1L : 0L;
    }
}
