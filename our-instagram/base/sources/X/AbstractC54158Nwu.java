package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.facebook.R;

/* renamed from: X.Nwu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54158Nwu {
    public static final void A00(Activity activity, Window window) {
        View decorView = window.getDecorView();
        C14360o3.A07(decorView);
        decorView.setSystemUiVisibility(768);
        int A02 = MSX.A02(activity);
        C30D.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        AbstractC56402iY.A02(activity, A02);
        AbstractC56402iY.A06(activity, true);
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
    }
}
