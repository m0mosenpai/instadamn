package X;

import android.app.Activity;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: X.4s5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107044s5 {
    public static final void A00(Activity activity) {
        Window window = activity.getWindow();
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.setSystemBarsAppearance(0, 24);
        }
        window.setDecorFitsSystemWindows(true);
    }

    public static final void A01(Window window, boolean z) {
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        int i = 0;
        window.setDecorFitsSystemWindows(false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(false);
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            if (!z) {
                i = 24;
            }
            windowInsetsController.setSystemBarsAppearance(i, 24);
        }
    }
}
