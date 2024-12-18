package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.Of9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55237Of9 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C55237Of9(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        float f;
        Number number2;
        if (this.A00 != 0) {
            C14360o3.A0B(valueAnimator, 0);
            GradientDrawable gradientDrawable = (GradientDrawable) this.A03;
            int i = this.A02;
            int i2 = this.A01;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number2 = (Number) animatedValue) != null) {
                f = number2.floatValue();
            } else {
                f = 0.0f;
            }
            gradientDrawable.setColor(AbstractC13950nL.A02(f, i, i2));
            return;
        }
        Object A0s = AbstractC43593JPy.A0s(valueAnimator);
        if (!(A0s instanceof Float) || (number = (Number) A0s) == null) {
            return;
        }
        AbstractC13880nE.A0f(((NI5) this.A03).A0A, (int) (this.A02 + ((this.A01 - r4) * number.floatValue())));
    }
}
