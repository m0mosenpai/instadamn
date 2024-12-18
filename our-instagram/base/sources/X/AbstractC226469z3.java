package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.9z3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226469z3 {
    public static void A00(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, ViewGroup viewGroup, C55U c55u) {
        View findViewById;
        View findViewById2;
        if ((c55u instanceof C128535rM) && (findViewById = viewGroup.findViewById(R.id.feed_gallery_fragment_holder)) != null && findViewById.getVisibility() == 0 && (findViewById2 = viewGroup.findViewById(R.id.container_touch_event_forwarding_view)) != null) {
            findViewById2.setBackground(gradientDrawable);
            return;
        }
        View findViewById3 = viewGroup.findViewById(R.id.focus_view);
        if (findViewById3 == null) {
            return;
        }
        findViewById3.setBackground(gradientDrawable2);
    }
}
