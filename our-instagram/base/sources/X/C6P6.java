package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;

/* renamed from: X.6P6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6P6 implements XEX {
    public AnimatorSet A00;
    public C141596ac A01;
    public final View A02;
    public final View A03;
    public final C143746eH A04;

    public C6P6(C143746eH c143746eH) {
        C14360o3.A0B(c143746eH, 1);
        this.A04 = c143746eH;
        View view = c143746eH.A02;
        if (view != null) {
            this.A02 = view;
            View view2 = c143746eH.A03;
            if (view2 != null) {
                this.A03 = view2;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.XEX
    public final AnimatorSet Ac0() {
        return this.A00;
    }

    @Override // X.XEX
    public final C141596ac Blc() {
        return this.A01;
    }

    @Override // X.XEX
    public final void EK3() {
        this.A02.setAlpha(1.0f);
        this.A03.setAlpha(0.0f);
        this.A04.A02();
    }

    @Override // X.XEX
    public final void EPk() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setStartDelay(2000L);
        ofFloat.setDuration(300L).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6P7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C6P6 c6p6 = C6P6.this;
                float f = 1.0f - animatedFraction;
                c6p6.A02.setAlpha(f);
                c6p6.A03.setAlpha(animatedFraction);
                C143746eH c143746eH = c6p6.A04;
                C143746eH.A00(c143746eH, (int) (Color.red(c143746eH.A00) + ((Color.red(c143746eH.A01) - Color.red(c143746eH.A00)) * f)), (int) (Color.green(c143746eH.A00) + ((Color.green(c143746eH.A01) - Color.green(c143746eH.A00)) * f)), (int) (Color.blue(c143746eH.A00) + ((Color.blue(c143746eH.A01) - Color.blue(c143746eH.A00)) * f)), Color.alpha(c143746eH.A00));
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.6P8
            public boolean A00;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.A00 = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A00 = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnonymousClass693 anonymousClass693;
                C143746eH c143746eH = C6P6.this.A04;
                if (!this.A00 && (anonymousClass693 = c143746eH.A09) != null) {
                    anonymousClass693.EH0(2);
                    anonymousClass693.E4S();
                }
            }
        });
        animatorSet.play(ofFloat);
    }

    @Override // X.XEX
    public final void EhB() {
        this.A03.setAlpha(1.0f);
        this.A02.setAlpha(0.0f);
        C143746eH c143746eH = this.A04;
        C143746eH.A00(c143746eH, Color.red(c143746eH.A00), Color.green(c143746eH.A00), Color.blue(c143746eH.A00), Color.alpha(c143746eH.A00));
    }

    @Override // X.XEX
    public final void EkX() {
        if (this.A04.A0A) {
            AbstractC65725Tsz.A01(this);
        }
    }

    @Override // X.XEX
    public final void start() {
        if (this.A04.A0A) {
            AbstractC65725Tsz.A02(this);
        }
    }

    @Override // X.XEX
    public final void EcI(C141596ac c141596ac) {
        this.A01 = c141596ac;
    }
}
