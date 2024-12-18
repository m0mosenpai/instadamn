package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes11.dex */
public final class W3z {
    public static final W3z A00 = new Object();

    public final void A00(View view, View view2, float f) {
        C14360o3.A0B(view2, 1);
        Rect rect = new Rect();
        view2.getGlobalVisibleRect(rect);
        int width = rect.width();
        if (width == 0) {
            view2.setAlpha(0.0f);
            view2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC70240WNd(view, view2, f));
        } else {
            view2.setAlpha(C17s.A02(1.0f - (((width / view.getWidth()) * 100.0f) / (f * 100.0f)), 0.0f, 1.0f));
        }
    }
}
