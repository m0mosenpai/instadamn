package X;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.SSd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62809SSd {
    public static final void A00(View view, CTu cTu) {
        if (Build.VERSION.SDK_INT >= 30 && A01(view)) {
            AbstractC008903d.A00(view, new LRT(1, view, cTu));
        }
    }

    public static final boolean A01(View view) {
        Insets insets;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            insets = rootWindowInsets.getInsets(WindowInsets.Type.systemGestures());
        } else {
            insets = null;
        }
        if (insets == null) {
            return false;
        }
        int i = insets.left;
        int i2 = insets.right;
        if (i <= 0 && i2 <= 0) {
            return false;
        }
        return true;
    }
}
