package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;

/* loaded from: classes11.dex */
public abstract class U6Y {
    public static final int[][] A00 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A04;
        int defaultColor;
        int colorForState;
        int i = -7829368;
        if (num != null) {
            A04 = num.intValue();
        } else {
            A04 = AbstractC65702TsY.A04(context.getTheme(), com.facebook.R.attr.colorControlActivated, -7829368);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{com.facebook.R.attr.colorSwitchThumbNormal});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (num2 != null) {
            defaultColor = num2.intValue();
        } else if (colorStateList == null) {
            defaultColor = -7829368;
        } else {
            defaultColor = colorStateList.getDefaultColor();
        }
        if (num3 != null) {
            colorForState = num3.intValue();
        } else if (colorStateList == null) {
            colorForState = -7829368;
        } else {
            colorForState = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        if (num4 != null) {
            i = num4.intValue();
        } else if (colorStateList != null) {
            i = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        return new ColorStateList(A00, new int[]{A04, defaultColor, colorForState, i});
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A04;
        int A042;
        int A06;
        int A062;
        if (num != null) {
            A04 = num.intValue();
        } else {
            A04 = AbstractC65702TsY.A04(context.getTheme(), R.attr.colorControlActivated, -7829368);
        }
        if (num2 != null) {
            A042 = num2.intValue();
        } else {
            A042 = AbstractC65702TsY.A04(context.getTheme(), R.attr.colorForeground, -7829368);
        }
        if (num3 != null) {
            A06 = num3.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorControlActivated});
            A06 = AbstractC56842jH.A06(obtainStyledAttributes.getColor(0, -7829368), Math.round(Color.alpha(A04) * 0.25f));
            obtainStyledAttributes.recycle();
        }
        if (num4 != null) {
            A062 = num4.intValue();
        } else {
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorForeground});
            A062 = AbstractC56842jH.A06(obtainStyledAttributes2.getColor(0, -7829368), Math.round(Color.alpha(A042) * 0.25f));
            obtainStyledAttributes2.recycle();
        }
        return new ColorStateList(A00, new int[]{A04, A042, A06, A062});
    }
}
