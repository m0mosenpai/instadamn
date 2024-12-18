package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes4.dex */
public final class ANP implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C1567271v A02;

    public ANP(View view, View view2, C1567271v c1567271v) {
        this.A02 = c1567271v;
        this.A00 = view;
        this.A01 = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1567271v.A00(this.A00, this.A01, this.A02, valueAnimator.getAnimatedFraction());
    }
}
