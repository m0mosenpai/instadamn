package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes11.dex */
public abstract class WE9 {
    public static final RectF A00 = new RectF();

    public static final void A01(Activity activity, boolean z) {
        C14360o3.A0B(activity, 0);
        int systemUiVisibility = AbstractC43592JPx.A08(activity).getSystemUiVisibility();
        int i = systemUiVisibility & (-3);
        if (!z) {
            i = systemUiVisibility | 256 | 512 | 2;
        }
        AbstractC43592JPx.A08(activity).setSystemUiVisibility(i);
    }

    public static final void A02(Activity activity, boolean z) {
        C14360o3.A0B(activity, 0);
        View A08 = AbstractC43592JPx.A08(activity);
        C14360o3.A07(A08);
        int systemUiVisibility = A08.getSystemUiVisibility();
        if (z) {
            A08.setSystemUiVisibility(systemUiVisibility & (-5));
            activity.getWindow().clearFlags(1024);
        } else {
            A08.setSystemUiVisibility(systemUiVisibility | 260);
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            C14360o3.A07(baseContext);
            return A00(baseContext);
        }
        return null;
    }
}
