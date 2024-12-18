package com.google.android.material.appbar;

import X.C011304b;
import X.C011504d;
import X.C56292iI;
import X.C72E;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ViewOffsetBehavior extends CoordinatorLayout.Behavior {
    public int A00 = 0;
    public C72E A01;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        int i2;
        if (this instanceof HeaderScrollingViewBehavior) {
            HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) this;
            List A0B = coordinatorLayout.A0B(view);
            int size = A0B.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                View view2 = (View) A0B.get(i3);
                if (view2 instanceof AppBarLayout) {
                    if (view2 != null) {
                        C56292iI c56292iI = (C56292iI) view.getLayoutParams();
                        Rect rect = headerScrollingViewBehavior.A02;
                        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c56292iI).leftMargin, view2.getBottom() + ((ViewGroup.MarginLayoutParams) c56292iI).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c56292iI).rightMargin, ((coordinatorLayout.getHeight() + view2.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c56292iI).bottomMargin);
                        C011504d c011504d = coordinatorLayout.A02;
                        if (c011504d != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                            int i4 = rect.left;
                            C011304b c011304b = c011504d.A00;
                            rect.left = i4 + c011304b.A03().A01;
                            rect.right -= c011304b.A03().A02;
                        }
                        Rect rect2 = headerScrollingViewBehavior.A03;
                        int i5 = c56292iI.A02;
                        if (i5 == 0) {
                            i5 = 8388659;
                        }
                        Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
                        int A0S = headerScrollingViewBehavior.A0S(view2);
                        view.layout(rect2.left, rect2.top - A0S, rect2.right, rect2.bottom - A0S);
                        i2 = rect2.top - view2.getBottom();
                    }
                } else {
                    i3++;
                }
            }
            coordinatorLayout.A0E(view, i);
            i2 = 0;
            headerScrollingViewBehavior.A01 = i2;
        } else {
            coordinatorLayout.A0E(view, i);
        }
        C72E c72e = this.A01;
        if (c72e == null) {
            c72e = new C72E(view);
            this.A01 = c72e;
        }
        View view3 = c72e.A03;
        c72e.A01 = view3.getTop();
        c72e.A00 = view3.getLeft();
        this.A01.A00();
        int i6 = this.A00;
        if (i6 != 0) {
            C72E c72e2 = this.A01;
            if (c72e2.A02 != i6) {
                c72e2.A02 = i6;
                c72e2.A00();
            }
            this.A00 = 0;
            return true;
        }
        return true;
    }

    public boolean A0R(int i) {
        C72E c72e = this.A01;
        if (c72e != null) {
            if (c72e.A02 != i) {
                c72e.A02 = i;
                c72e.A00();
                return true;
            }
            return false;
        }
        this.A00 = i;
        return false;
    }
}
