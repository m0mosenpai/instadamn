package X;

import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: X.VzQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70006VzQ {
    public static WeakReference A00 = new WeakReference(null);

    public static void A00(C66351UBk c66351UBk, float f) {
        ViewGroup.LayoutParams layoutParams = c66351UBk.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.verticalMargin = f;
            ViewManager viewManager = (ViewManager) c66351UBk.getContext().getSystemService("window");
            if (viewManager != null) {
                viewManager.updateViewLayout(c66351UBk, layoutParams2);
                return;
            }
            throw new IllegalStateException("Window manager required but not found.");
        }
    }
}
