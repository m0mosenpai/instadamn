package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes8.dex */
public final class LM5 implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Object A04;

    public LM5(Object obj, float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A04 = obj;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float A00;
        Number number;
        if (this.A03 != 0) {
            Object A0s = AbstractC43593JPy.A0s(valueAnimator);
            if ((A0s instanceof Float) && (number = (Number) A0s) != null) {
                float floatValue = number.floatValue();
                view = (View) this.A04;
                view.setTranslationX(this.A01 - (this.A02 * floatValue));
                view.setTranslationY(((floatValue * floatValue) - floatValue) * 1600.0f);
                view.setRotation(this.A00 + (360.0f * floatValue));
                A00 = 1.0f;
                if (floatValue >= 0.9f) {
                    A00 = (1.0f - floatValue) * 10.0f;
                }
            } else {
                return;
            }
        } else {
            float A09 = AbstractC166987dD.A09(valueAnimator.getAnimatedValue());
            view = (View) this.A04;
            A00 = WGK.A00(this.A02, this.A01, 0.0f, this.A00, A09);
        }
        view.setAlpha(A00);
    }
}
