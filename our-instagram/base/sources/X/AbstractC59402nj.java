package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.2nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59402nj {
    public static final AbstractC59442nn A00(Resources resources, Drawable drawable, Integer num, int i) {
        if (drawable != null) {
            return A01(drawable);
        }
        if (i != 0) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C3QN(typedValue.data);
            }
            return A01(resources.getDrawable(i));
        }
        if (num != null) {
            return new C3QN(num.intValue());
        }
        return null;
    }

    public static final AbstractC59442nn A01(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof ColorDrawable) {
            return new C3QN(((ColorDrawable) drawable).getColor());
        }
        return new C59432nm(drawable);
    }
}
