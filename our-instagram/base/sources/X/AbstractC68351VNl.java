package X;

import android.app.Activity;

/* renamed from: X.VNl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68351VNl {
    public static final boolean A00(Activity activity) {
        if (activity != null && activity.getWindow() != null && (AbstractC43592JPx.A08(activity).getSystemUiVisibility() & 1536) != 0) {
            return true;
        }
        return false;
    }
}
