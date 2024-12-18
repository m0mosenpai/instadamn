package X;

import android.animation.ValueAnimator;

/* loaded from: classes4.dex */
public final class ANQ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C81373k7 A02;

    public ANQ(C81373k7 c81373k7, int i, int i2) {
        this.A02 = c81373k7;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        C81373k7 c81373k7 = this.A02;
        float f = 1.0f - A00;
        c81373k7.A01.setAlpha(f);
        c81373k7.A06.setAlpha(f);
        c81373k7.A02.setAlpha(A00);
        c81373k7.A07.setAlpha(0.7f * A00);
        AbstractC13880nE.A0W(c81373k7.A0J, this.A00 + ((int) (A00 * (this.A01 - r1))));
    }
}
