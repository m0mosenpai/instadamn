package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class WH7 implements ValueAnimator.AnimatorUpdateListener {
    public WeakReference A00;
    public boolean A01;
    public final Animator.AnimatorListener A02;
    public final ValueAnimator A03;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        UJQ ujq;
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        WeakReference weakReference = this.A00;
        if (weakReference != null && (ujq = (UJQ) weakReference.get()) != null) {
            ImageView imageView = ujq.A02;
            imageView.setTranslationX(AbstractC31177DnL.A0G(imageView).rightMargin * A00);
            imageView.setAlpha(A00);
        }
    }

    public WH7() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setStartDelay(500L);
        ofFloat.addUpdateListener(this);
        U5Q u5q = new U5Q(this, 19);
        this.A02 = u5q;
        ofFloat.addListener(u5q);
        this.A03 = ofFloat;
    }
}
