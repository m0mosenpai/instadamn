package X;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes11.dex */
public abstract class W6b {
    public static final float A00(Context context, int i) {
        C14360o3.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.getDimension(AbstractC167007dF.A0K(context));
    }

    public static final int A01(Context context, int i) {
        C14360o3.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final int A02(Context context, int i) {
        C14360o3.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }
}
