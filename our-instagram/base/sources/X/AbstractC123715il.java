package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123715il {
    public static final boolean A00(View view, int i, int i2, int i3, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = i2 + viewGroup.getScrollX();
            int scrollY = i3 + viewGroup.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0) {
                    float f = scrollX;
                    if (f >= childAt.getX() && f < childAt.getX() + childAt.getWidth()) {
                        float f2 = scrollY;
                        if (f2 >= childAt.getY() && f2 < childAt.getY() + childAt.getHeight() && A00(childAt, i, scrollX - ((int) childAt.getX()), scrollY - ((int) childAt.getY()), true)) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }
}
