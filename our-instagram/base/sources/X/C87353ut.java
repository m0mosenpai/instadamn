package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.3ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87353ut {
    public C3QU A00;
    public WeakReference A01;
    public final C87363uu A02 = new C87363uu();

    public final void A00() {
        C87363uu c87363uu = this.A02;
        ValueAnimator valueAnimator = c87363uu.A01;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
            c87363uu.A03 = C05F.A00;
        }
    }

    public final void A01(long j, long j2) {
        ValueAnimator valueAnimator;
        final C87363uu c87363uu = this.A02;
        Integer num = c87363uu.A03;
        Integer num2 = C05F.A00;
        if (num != num2 && (valueAnimator = c87363uu.A01) != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
            c87363uu.A03 = num2;
        }
        c87363uu.A03 = C05F.A01;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j2);
        c87363uu.A01 = duration;
        duration.setStartDelay(j);
        ValueAnimator valueAnimator2 = c87363uu.A01;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = c87363uu.A00;
        if (animatorUpdateListener == null) {
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.4e9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    C87363uu c87363uu2 = C87363uu.this;
                    for (Reference reference : c87363uu2.A04) {
                        if (c87363uu2.A03 != C05F.A00 && reference != null && reference.get() != null) {
                            ((C3QU) reference.get()).DFe(((Number) valueAnimator3.getAnimatedValue()).floatValue());
                        }
                    }
                }
            };
            c87363uu.A00 = animatorUpdateListener;
        }
        valueAnimator2.addUpdateListener(animatorUpdateListener);
        ValueAnimator valueAnimator3 = c87363uu.A01;
        AbstractC87373uv abstractC87373uv = c87363uu.A02;
        if (abstractC87373uv == null) {
            abstractC87373uv = new AbstractC87373uv() { // from class: X.4eA
                @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C87363uu c87363uu2 = C87363uu.this;
                    for (Reference reference : c87363uu2.A04) {
                        if (c87363uu2.A03 != C05F.A00 && reference != null && reference.get() != null) {
                            ((C3QU) reference.get()).DFc();
                        }
                    }
                    c87363uu2.A03 = C05F.A00;
                }

                @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C87363uu c87363uu2 = C87363uu.this;
                    c87363uu2.A03 = C05F.A0C;
                    for (Reference reference : c87363uu2.A04) {
                        if (c87363uu2.A03 != C05F.A00 && reference != null && reference.get() != null) {
                            ((C3QU) reference.get()).DFd();
                        }
                    }
                }
            };
            c87363uu.A02 = abstractC87373uv;
        }
        valueAnimator3.addListener(abstractC87373uv);
        c87363uu.A01.start();
    }
}
