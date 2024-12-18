package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes4.dex */
public final class ANH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;

    public ANH(View view) {
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            this.A00.setTranslationX(number.floatValue());
        }
    }
}
