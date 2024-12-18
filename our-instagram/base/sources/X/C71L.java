package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.facebook.R;

/* renamed from: X.71L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C71L extends AbstractC60592pi {
    public ValueAnimator.AnimatorUpdateListener A00;
    public ValueAnimator A01;
    public View A02;
    public Integer A03 = C05F.A01;
    public boolean A04;
    public final int A05;
    public final int A06;

    public final void A00() {
        View view = this.A02;
        if (view != null) {
            view.setTranslationY(this.A05);
        }
        View view2 = this.A02;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public final void A01(int i) {
        View view = this.A02;
        if (view != null && !this.A04) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i + dimensionPixelSize;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void A04(View view) {
        this.A02 = view;
        if (this.A04) {
            A00();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.A05, 0);
        this.A01 = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(this.A06);
        }
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new C50615MWc(view, this));
        }
        ValueAnimator valueAnimator2 = this.A01;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new MWb(view, this));
        }
        ValueAnimator valueAnimator3 = this.A01;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator(new OvershootInterpolator());
        }
    }

    public final boolean A05() {
        View view = this.A02;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public C71L(int i, int i2) {
        this.A05 = i;
        this.A06 = i2;
    }

    public final void A02(View view) {
        A04(view);
        A00();
        View view2 = this.A02;
        if (view2 != null) {
            view2.postDelayed(new RunnableC50616MWd(this), 250L);
        }
    }

    public final void A03(View view) {
        A04(view);
        View view2 = this.A02;
        if (view2 != null) {
            view2.postDelayed(new RunnableC56900PMt(this), 100L);
        }
    }
}
