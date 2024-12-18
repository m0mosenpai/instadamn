package X;

import android.content.Context;

/* renamed from: X.3eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78243eq {
    public final int A00(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return 1;
        }
        return 0;
    }
}
