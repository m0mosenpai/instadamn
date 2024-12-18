package X;

import android.content.Context;
import android.content.res.TypedArray;
import com.facebook.R;

/* renamed from: X.UEs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66384UEs extends C0SG {
    public static final Object A01 = "CONFIRM_BUTTON_TAG";
    public static final Object A00 = "CANCEL_BUTTON_TAG";
    public static final Object A02 = "TOGGLE_BUTTON_TAG";

    public static boolean A01(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1343565e.A00(context, UEx.class.getCanonicalName(), R.attr.materialCalendarStyle), new int[]{android.R.attr.windowFullscreen});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
