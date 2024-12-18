package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;

/* renamed from: X.7Sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC163257Sk {
    public static final void A00(View view, int i) {
        C14360o3.A0B(view, 1);
        if (view instanceof Space) {
            if (view.getLayoutParams().height > i) {
                AbstractC13880nE.A0W(view, i);
            }
        } else {
            if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            if (i2 >= 0 || Math.abs(i2) <= i) {
                return;
            }
            AbstractC13880nE.A0f(view, -i);
        }
    }
}
