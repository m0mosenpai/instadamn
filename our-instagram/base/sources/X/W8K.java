package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes11.dex */
public final class W8K {
    public static final Rect A00 = new Rect();

    public static void A00(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof XD4) {
                XD4 xd4 = (XD4) parent;
                if (xd4.getRemoveClippedSubviews()) {
                    Rect rect2 = A00;
                    xd4.AoA(rect2);
                    if (rect2.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                        rect2.offset(-view.getLeft(), -view.getTop());
                        rect2.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                        rect2.offset(view.getScrollX(), view.getScrollY());
                        rect.set(rect2);
                        return;
                    }
                }
            }
            view.getDrawingRect(rect);
            return;
        }
        rect.setEmpty();
    }
}
