package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* renamed from: X.4nY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104684nY {
    public final AnimatorSet A00;
    public final C104674nX A01;
    public final ValueAnimator A02;
    public final ValueAnimator A03;

    public C104684nY(C104674nX c104674nX) {
        this.A01 = c104674nX;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new C104694nZ());
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.4nb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                C104674nX c104674nX2 = C104684nY.this.A01;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c104674nX2.A01.A00(animatedValue);
                c104674nX2.A02.A00(animatedValue);
                c104674nX2.A00.A00(animatedValue);
            }
        });
        this.A02 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(new C104694nZ());
        ofFloat2.setDuration(400L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.4nb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                C104674nX c104674nX2 = C104684nY.this.A01;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c104674nX2.A01.A00(animatedValue);
                c104674nX2.A02.A00(animatedValue);
                c104674nX2.A00.A00(animatedValue);
            }
        });
        this.A03 = ofFloat2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).after(500L);
        animatorSet.play(ofFloat2).after(4900L);
        this.A00 = animatorSet;
    }
}
