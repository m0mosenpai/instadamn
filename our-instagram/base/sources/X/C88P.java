package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.88P, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C88P {
    public static final int A00(Context context) {
        C14360o3.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.quickCaptureControllerShutterButtonSize, typedValue, true);
        int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        TypedValue typedValue2 = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(R.attr.shutterButtonStyle, typedValue2, false);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedValue2.data, new int[]{R.attr.borderInnerPadding, R.attr.borderStrokeWidth});
        C14360o3.A07(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        return complexToDimensionPixelSize - ((dimensionPixelSize + dimensionPixelSize2) * 2);
    }
}
