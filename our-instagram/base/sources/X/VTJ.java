package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes11.dex */
public abstract class VTJ {
    public static boolean A00(View view, double d) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        long height = view.getHeight() * view.getWidth();
        return height > 0 && ((double) (r1.height() * r1.width())) >= d * ((double) height);
    }
}
