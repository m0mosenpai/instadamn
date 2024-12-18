package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.04L, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C04L {
    public static void A00(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C04K.A00(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = systemUiVisibility | 1792;
        if (z) {
            i = systemUiVisibility & (-1793);
        }
        decorView.setSystemUiVisibility(i);
    }
}
