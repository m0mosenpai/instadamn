package X;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.Window;

/* renamed from: X.5se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129175se {
    public static final View A00(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        C14360o3.A07(decorView);
        View findViewById = decorView.findViewById(R.id.content);
        if (findViewById != null && findViewById.getRootView() != null) {
            return findViewById.getRootView();
        }
        return decorView;
    }
}
