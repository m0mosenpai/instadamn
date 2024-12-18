package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.facebook.R;

/* renamed from: X.04U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04U {
    public C04T A00;

    public static C04U A00(WindowInsetsAnimation windowInsetsAnimation) {
        C04U c04u = new C04U(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            c04u.A00 = new C17820uK(windowInsetsAnimation);
        }
        return c04u;
    }

    public static void A01(View view, C04N c04n) {
        View.OnApplyWindowInsetsListener c04r;
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            C17820uK.A03(view, c04n);
            return;
        }
        Interpolator interpolator = C17890uS.A00;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (c04n == null) {
            i = R.id.tag_window_insets_animation_callback;
            c04r = null;
        } else {
            c04r = new C04R(view, c04n);
            i = R.id.tag_window_insets_animation_callback;
        }
        view.setTag(i, c04r);
        if (tag != null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(c04r);
    }

    public C04U(int i, Interpolator interpolator, long j) {
        C04T c04t;
        if (Build.VERSION.SDK_INT >= 30) {
            c04t = new C17820uK(i, interpolator, j);
        } else {
            c04t = new C04T(i, interpolator, j);
        }
        this.A00 = c04t;
    }
}
