package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.1Z0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z0 {
    public static C1Z0 A01;
    public View A00;

    public final void A00(Context context, Window window, boolean z, boolean z2) {
        View childAt;
        if (window != null && window.getDecorView() != null && context != null && this.A00 == null) {
            View decorView = window.getDecorView();
            C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            boolean A00 = AbstractC72723Nt.A00(context);
            if (z && (childAt = viewGroup.getChildAt(0)) != null) {
                float f = 0.3f;
                if (A00) {
                    f = 0.4f;
                }
                childAt.setAlpha(f);
            }
            window.addFlags(16);
            if (z2) {
                this.A00 = new ImageView(context);
                int i = R.color.grey_10;
                if (A00) {
                    i = R.color.design_dark_default_color_on_background;
                }
                int color = context.getColor(i);
                Interpolator interpolator = U5F.A09;
                U5F u5f = new U5F(context, 2.0f, color, (int) U5C.A00(context, 38.0f));
                View view = this.A00;
                C14360o3.A0C(view, "null cannot be cast to non-null type com.meta.foa.widgets.AnimatableView");
                ((C66238U5i) view).A01(u5f);
                View view2 = this.A00;
                C14360o3.A0C(view2, "null cannot be cast to non-null type com.meta.foa.widgets.AnimatableView");
                ((C66238U5i) view2).A00();
            } else {
                SpinnerImageView spinnerImageView = new SpinnerImageView(context);
                this.A00 = spinnerImageView;
                spinnerImageView.setImageResource(R.drawable.spinner_large);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            viewGroup.addView(this.A00, layoutParams);
        }
    }

    public final void A01(Window window) {
        if (window != null) {
            window.clearFlags(16);
            View decorView = window.getDecorView();
            C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            View view = this.A00;
            if (view != null && viewGroup != null) {
                viewGroup.removeView(view);
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null) {
                    childAt.setAlpha(1.0f);
                }
            }
            this.A00 = null;
        }
    }
}
