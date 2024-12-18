package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.71w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1567371w {
    public static int A00(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    public static ColorStateList A02(Context context, C53122bu c53122bu, int i) {
        int resourceId;
        ColorStateList A02;
        TypedArray typedArray = c53122bu.A02;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (A02 = C02G.A02(context, resourceId)) != null) {
            return A02;
        }
        return c53122bu.A01(i);
    }

    public static ColorStateList A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A02;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (A02 = C02G.A02(context, resourceId)) != null) {
            return A02;
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable A03(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable A05;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (A05 = C52112aB.A02().A05(context, resourceId)) != null) {
            return A05;
        }
        return typedArray.getDrawable(i);
    }

    public static boolean A04(Context context) {
        if (context.getResources().getConfiguration().fontScale < 1.3f) {
            return false;
        }
        return true;
    }
}
