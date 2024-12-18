package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.0mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13320mI {
    public static final Object A00(Context context, Class cls) {
        Context baseContext;
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return cls.cast(context);
    }

    public static final Object A01(Context context, Class cls) {
        Object A00 = A00(context, cls);
        if (A00 != null) {
            return A00;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
