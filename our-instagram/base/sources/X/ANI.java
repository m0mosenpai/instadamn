package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes4.dex */
public final class ANI implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ IgTextView A00;

    public ANI(IgTextView igTextView) {
        this.A00 = igTextView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (number = (Number) animatedValue) != null) {
            this.A00.setTextColor(number.intValue());
        }
    }
}
