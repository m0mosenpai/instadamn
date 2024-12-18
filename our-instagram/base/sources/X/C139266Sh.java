package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: X.6Sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139266Sh {
    public final long A00;
    public final View A01;
    public final C139256Sg A02;
    public final AbstractC125325le A03;
    public final C139276Si A04;
    public final Runnable A05;
    public final AlphaAnimation A06;

    public final void A00() {
        View view = this.A01;
        view.clearAnimation();
        view.removeCallbacks(this.A05);
        AbstractC125325le abstractC125325le = this.A03;
        abstractC125325le.A0G();
        abstractC125325le.A0U(0.9f, 1.0f, -1.0f);
        abstractC125325le.A0V(0.9f, 1.0f, -1.0f);
        abstractC125325le.A0E(C55942hf.A03(12.0d, 10.0d));
        view.startAnimation(this.A06);
    }

    public C139266Sh(View view, C139256Sg c139256Sg, C139276Si c139276Si, long j) {
        this.A01 = view;
        this.A00 = j;
        this.A02 = c139256Sg;
        this.A04 = c139276Si;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A06 = alphaAnimation;
        alphaAnimation.setDuration(250L);
        alphaAnimation.setStartOffset(j);
        this.A03 = AbstractC125325le.A01(view, 0);
        this.A05 = new Runnable() { // from class: X.6Sj
            @Override // java.lang.Runnable
            public final void run() {
                C139266Sh.this.A03.A0H();
            }
        };
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.6Sk
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                C139276Si c139276Si2 = C139266Sh.this.A04;
                if (c139276Si2 != null && AbstractC40922IAu.A00(c139276Si2.A01).booleanValue() && c139276Si2.A00 == 0) {
                    C37548Gg4.A07 = true;
                    C41761Iec.A00();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                C139266Sh c139266Sh = C139266Sh.this;
                View view2 = c139266Sh.A01;
                view2.setVisibility(0);
                view2.postDelayed(c139266Sh.A05, c139266Sh.A00);
                C139256Sg c139256Sg2 = c139266Sh.A02;
                if (c139256Sg2 != null) {
                    c139256Sg2.A00.A12 = false;
                }
            }
        });
    }
}
