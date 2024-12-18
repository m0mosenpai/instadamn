package X;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes11.dex */
public abstract class U5C {
    public static final float A00(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
