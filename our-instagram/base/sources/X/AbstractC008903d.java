package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.R;

/* renamed from: X.03d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC008903d {
    public static void A00(final View view, final C03L c03l) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, c03l);
        }
        if (c03l == null) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        } else {
            onApplyWindowInsetsListener = new View.OnApplyWindowInsetsListener() { // from class: X.03c
                public C011504d A00 = null;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C011504d Cx7;
                    C011504d A01 = C011504d.A01(view2, windowInsets);
                    int i = Build.VERSION.SDK_INT;
                    if (i < 30) {
                        View view3 = view;
                        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = (View.OnApplyWindowInsetsListener) view3.getTag(R.id.tag_window_insets_animation_callback);
                        if (onApplyWindowInsetsListener2 != null) {
                            onApplyWindowInsetsListener2.onApplyWindowInsets(view3, windowInsets);
                        }
                        if (A01.equals(this.A00)) {
                            Cx7 = c03l.Cx7(view2, A01);
                            return Cx7.A04();
                        }
                    }
                    this.A00 = A01;
                    Cx7 = c03l.Cx7(view2, A01);
                    if (i < 30) {
                        view2.requestApplyInsets();
                    }
                    return Cx7.A04();
                }
            };
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
    }
}
