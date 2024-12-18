package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;

/* renamed from: X.2bS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52862bS {
    public static final Rect A00(Context context) {
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        C14360o3.A07(bounds);
        return bounds;
    }

    public static final Rect A01(Context context) {
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
        C14360o3.A07(bounds);
        return bounds;
    }

    public static final C011504d A02(Context context) {
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        C14360o3.A07(windowInsets);
        return new C011504d(windowInsets);
    }

    public static final C52882bU A03(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        WindowInsets windowInsets = windowManager.getCurrentWindowMetrics().getWindowInsets();
        C011504d c011504d = C011504d.A01;
        windowInsets.getClass();
        C011504d c011504d2 = new C011504d(windowInsets);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        C14360o3.A07(bounds);
        return new C52882bU(c011504d2, new C52872bT(bounds));
    }
}
