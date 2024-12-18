package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.4yI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110464yI implements InterfaceC75123Zc {
    public float A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public int A04;
    public final ValueAnimator A05;
    public final UserSession A06;
    public final Animator.AnimatorListener A07;
    public final AnimatorSet A08;
    public final ValueAnimator.AnimatorUpdateListener A09;
    public final ValueAnimator.AnimatorUpdateListener A0A;
    public final ValueAnimator A0B;

    public C110464yI(UserSession userSession, long j) {
        C14360o3.A0B(userSession, 2);
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: X.4yJ
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C110464yI.this.A01 = C05F.A0C;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C110464yI.this.A01 = C05F.A01;
            }
        };
        this.A07 = animatorListener;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.4yK
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                C110464yI c110464yI = C110464yI.this;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c110464yI.A00 = ((Number) animatedValue).floatValue();
            }
        };
        this.A09 = animatorUpdateListener;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.4yL
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                C14360o3.A0C(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            }
        };
        this.A0A = animatorUpdateListener2;
        this.A04 = -1;
        this.A01 = C05F.A00;
        this.A06 = userSession;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A05 = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(animatorUpdateListener);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f, 1.0f);
        this.A0B = ofFloat2;
        ofFloat2.addUpdateListener(animatorUpdateListener2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A08 = animatorSet;
        ofFloat.setDuration(j);
        ofFloat2.setDuration(j);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(animatorListener);
    }

    public final void A00() {
        if (this.A01 == C05F.A00) {
            this.A08.start();
            if (C18U.A06(C06090Tz.A05, this.A06, 36310435217342570L)) {
                C2UY.A01.A03();
            }
        }
    }

    public final void A01(int i) {
        C11T.A06("This operation must be run on UI thread.");
        this.A04 = i;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLI() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final /* synthetic */ int BLj() {
        return -1;
    }

    @Override // X.InterfaceC75123Zc
    public final int getPosition() {
        int i = this.A04;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(AbstractC111324zv.A00(1718));
    }
}
