package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.facebook.R;
import java.util.List;

/* renamed from: X.0uS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17890uS extends C04T {
    public static final Interpolator A02 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator A01 = new C153316v0();
    public static final Interpolator A00 = new DecelerateInterpolator();

    public static C04N A00(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof C04R) {
            return ((C04R) tag).A01;
        }
        return null;
    }

    public static void A01(View view, WindowInsets windowInsets, C04U c04u, boolean z) {
        C04N A002 = A00(view);
        if (A002 != null) {
            A002.A00 = windowInsets;
            if (!z) {
                A002.A03(c04u);
                z = false;
                if (A002.A01 == 0) {
                    z = true;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A01(viewGroup.getChildAt(i), windowInsets, c04u, z);
            }
        }
    }

    public static void A02(View view, C04M c04m, C04U c04u) {
        C04N A002 = A00(view);
        if (A002 != null) {
            A002.A01(c04m, c04u);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            A02(viewGroup.getChildAt(i), c04m, c04u);
        }
    }

    public static void A03(View view, C04U c04u) {
        C04N A002 = A00(view);
        if (A002 != null) {
            A002.A04(c04u);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            A03(viewGroup.getChildAt(i), c04u);
        }
    }

    public static void A04(View view, C011504d c011504d, List list) {
        C04N A002 = A00(view);
        if (A002 != null) {
            c011504d = A002.A02(c011504d, list);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            A04(viewGroup.getChildAt(i), c011504d, list);
        }
    }
}
