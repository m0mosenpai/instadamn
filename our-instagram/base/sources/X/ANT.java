package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes4.dex */
public final class ANT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;

    public ANT(View view, float f, float f2, int i, int i2) {
        this.A04 = view;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f;
        this.A00 = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (number = (Number) animatedValue) != null) {
            View view = this.A04;
            int i = this.A03;
            int i2 = this.A02;
            float f = this.A01;
            float f2 = this.A00;
            int intValue = number.intValue();
            view.getBackground().mutate().setTint(intValue);
            view.setTranslationX(AbstractC13600mm.A02(intValue, i, i2, f, f2));
        }
    }
}
