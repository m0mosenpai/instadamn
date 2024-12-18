package X;

import android.content.Context;

/* renamed from: X.6Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC135466Av {
    public static final boolean A00(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
