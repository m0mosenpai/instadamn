package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes11.dex */
public final class WH9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ View A06;
    public final /* synthetic */ View A07;

    public WH9(View view, View view2, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = view;
        this.A02 = i;
        this.A04 = i2;
        this.A07 = view2;
        this.A05 = i3;
        this.A01 = f;
        this.A03 = i4;
        this.A00 = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int bottom = (this.A06.getBottom() - this.A02) + this.A04;
        View view = this.A07;
        view.setTop(this.A05 + bottom + ((int) (valueAnimator.getAnimatedFraction() * this.A01)));
        view.setBottom(this.A03 + bottom + ((int) (valueAnimator.getAnimatedFraction() * this.A00)));
    }
}
