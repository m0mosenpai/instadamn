package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.4eD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99914eD {
    public static final void A01(Window window, boolean z) {
        int systemUiVisibility;
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        C14360o3.A07(decorView);
        decorView.setSystemUiVisibility(1792 | decorView.getSystemUiVisibility());
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        View decorView2 = window.getDecorView();
        if (z) {
            C14360o3.A07(decorView2);
            systemUiVisibility = (-8209) & decorView2.getSystemUiVisibility();
        } else {
            C14360o3.A07(decorView2);
            systemUiVisibility = 8208 | decorView2.getSystemUiVisibility();
        }
        decorView2.setSystemUiVisibility(systemUiVisibility);
    }

    public static final void A00(Activity activity, View view, boolean z) {
        int systemUiVisibility;
        view.setSystemUiVisibility(1792 | view.getSystemUiVisibility());
        if (z) {
            systemUiVisibility = (-8209) & view.getSystemUiVisibility();
        } else {
            systemUiVisibility = 8208 | view.getSystemUiVisibility();
        }
        view.setSystemUiVisibility(systemUiVisibility);
        activity.getWindowManager().addView(view, new WindowManager.LayoutParams(-1, -1, 1, -2147417832, -2));
    }
}
