package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;

/* renamed from: X.73O, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C73O {
    public static final int A00(Activity activity) {
        C14360o3.A0B(activity, 0);
        View findViewById = activity.findViewById(R.id.ls_nav_bar);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return 0;
        }
        return findViewById.getWidth();
    }
}
