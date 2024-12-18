package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public final class ANL implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ List A00;

    public ANL(List list) {
        this.A00 = list;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        for (View view : this.A00) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setScaleX(AbstractC166987dD.A09(animatedValue));
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view.setScaleY(AbstractC166987dD.A09(animatedValue2));
        }
    }
}
