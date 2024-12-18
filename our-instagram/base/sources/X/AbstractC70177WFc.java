package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WFc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70177WFc {
    public static void A00(TypedArray typedArray, View view, int i, int i2) {
        A05(view, typedArray.getResourceId(i, i2), false);
    }

    public static final void A02(View view, int i, int i2, int i3, int i4) {
        C14360o3.A0B(view, 0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        W5t A0A = C2FP.A0A();
        Context A0L = AbstractC166997dE.A0L(view);
        gradientDrawable.setColor(A0A.A02(A0L, i));
        gradientDrawable.setCornerRadii(null);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(C2FP.A0A().A02(A0L, i2));
        gradientDrawable2.setCornerRadii(null);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(C2FP.A0A().A02(A0L, i3));
        gradientDrawable3.setCornerRadii(null);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(C2FP.A0A().A02(A0L, i4));
        gradientDrawable4.setCornerRadii(null);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2}));
        stateListDrawable.addState(new int[]{R.attr.state_focused}, new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable3}));
        stateListDrawable.addState(new int[0], new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable4}));
        view.setBackground(stateListDrawable);
    }

    public static final void A04(View view, int i, boolean z) {
        C14360o3.A0B(view, 0);
        A05(view, C2FP.A0A().A01(i), z);
    }

    public static final void A05(View view, int i, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int dimensionPixelSize;
        C14360o3.A0B(view, 0);
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(i, AbstractC55922hc.A0j);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = obtainStyledAttributes.getLayoutDimension(3, "layout_width");
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = obtainStyledAttributes.getLayoutDimension(4, "layout_height");
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        } else {
            marginLayoutParams = null;
        }
        int i2 = 0;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            marginLayoutParams.leftMargin = obtainStyledAttributes.getDimensionPixelSize(9, 0);
            marginLayoutParams.rightMargin = obtainStyledAttributes.getDimensionPixelSize(10, 0);
            view.setLayoutParams(marginLayoutParams);
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        if (z) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        }
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        if (!z) {
            i2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        view.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, i2);
        obtainStyledAttributes.recycle();
    }

    public static final void A01(View view, int i) {
        view.setBackgroundColor(C2FP.A0A().A02(AbstractC166997dE.A0L(view), i));
    }

    public static final void A03(View view, int i, View view2) {
        C50782Mbq c50782Mbq;
        TouchDelegate touchDelegate = view2.getTouchDelegate();
        if ((touchDelegate instanceof C50782Mbq) && (c50782Mbq = (C50782Mbq) touchDelegate) != null && c50782Mbq.A00.containsKey(Integer.valueOf(view.getId()))) {
            return;
        }
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55499Oks(i, 1, view2, view));
    }
}
