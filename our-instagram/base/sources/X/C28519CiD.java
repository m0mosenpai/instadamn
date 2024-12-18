package X;

import android.animation.ValueAnimator;

/* renamed from: X.CiD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28519CiD implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ C144506fW A01;

    public C28519CiD(ValueAnimator valueAnimator, C144506fW c144506fW) {
        this.A00 = valueAnimator;
        this.A01 = c144506fW;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = this.A00.getAnimatedValue();
        if (animatedValue instanceof Float) {
            this.A01.A01.setAlpha(AbstractC166987dD.A09(animatedValue));
        }
    }
}
