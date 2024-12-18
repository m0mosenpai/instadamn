package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.3WR, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3WR {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final int[] A02 = {-16842910};
    public static final int[] A04 = {R.attr.state_focused};
    public static final int[] A05 = {R.attr.state_pressed};
    public static final int[] A01 = {R.attr.state_checked};
    public static final int[] A03 = new int[0];
    public static final int[] A06 = new int[1];

    public static int A01(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A02(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        C53122bu c53122bu = new C53122bu(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return c53122bu.A01(0);
        } finally {
            c53122bu.A02.recycle();
        }
    }

    public static void A03(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC53402cO.A09);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                android.util.Log.e("ThemeUtils", sb.toString());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int A00(Context context, int i) {
        ColorStateList A022 = A02(context, i);
        if (A022 != null && A022.isStateful()) {
            return A022.getColorForState(A02, A022.getDefaultColor());
        }
        ThreadLocal threadLocal = A00;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC56842jH.A06(A01(context, i), Math.round(Color.alpha(r1) * f));
    }
}
