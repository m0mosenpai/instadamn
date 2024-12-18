package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.06v, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C06v {
    public Object A02(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract Object A03(Object obj);

    public abstract Object A04(Object obj);

    public abstract Object A05(Object obj, Object obj2, Object obj3);

    public abstract Object A06(Object obj, Object obj2, Object obj3);

    public abstract void A07(Rect rect, Object obj);

    public abstract void A08(View view, Object obj);

    public abstract void A09(View view, Object obj);

    public abstract void A0A(View view, Object obj, ArrayList arrayList);

    public abstract void A0B(View view, Object obj, ArrayList arrayList);

    public abstract void A0C(ViewGroup viewGroup, Object obj);

    public abstract void A0D(C62731SNv c62731SNv, Fragment fragment, Object obj, Runnable runnable);

    public void A0F(Object obj) {
    }

    public void A0G(Object obj, float f) {
    }

    public abstract void A0H(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3);

    public abstract void A0I(Object obj, ArrayList arrayList);

    public abstract void A0J(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public void A0K(Runnable runnable, Object obj) {
    }

    public abstract boolean A0L();

    public abstract boolean A0M(Object obj);

    public abstract boolean A0N(Object obj);

    public static final void A00(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r2[0], r2[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static void A01(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) != childAt) {
                                i4++;
                            }
                        } else if (childAt.getTransitionName() != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public void A0E(C62731SNv c62731SNv, Fragment fragment, Object obj, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }
}
