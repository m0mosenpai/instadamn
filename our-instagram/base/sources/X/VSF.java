package X;

import android.content.Context;

/* loaded from: classes11.dex */
public abstract class VSF {
    public static final boolean A00(Context context) {
        if ((context.getApplicationContext().getApplicationInfo().flags & 4194304) != 0 && AbstractC58319PtB.A08(context).getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
