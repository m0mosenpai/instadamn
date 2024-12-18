package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.65e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1343565e {
    public static TypedValue A02(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return typedValue;
    }

    public static int A00(Context context, String str, int i) {
        TypedValue A02 = A02(context, i);
        if (A02 != null) {
            return A02.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int A01(View view, int i) {
        return A00(view.getContext(), view.getClass().getCanonicalName(), i);
    }
}
