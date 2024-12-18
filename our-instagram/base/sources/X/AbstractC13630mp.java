package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.0mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13630mp {
    public static final Drawable A00(Context context, int i) {
        C14360o3.A0B(context, 0);
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
