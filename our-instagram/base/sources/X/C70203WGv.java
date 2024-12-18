package X;

import android.animation.Animator;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.instagram.neko.playables.activity.PlayableProgressBar;

/* renamed from: X.WGv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70203WGv implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public C70203WGv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 0:
                ((X9K) ((ViewGroup) this.A01)).getReactScrollViewScrollState().A01 = true;
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                C69338Vlk c69338Vlk = (C69338Vlk) this.A01;
                ViewGroup viewGroup = c69338Vlk.A02;
                viewGroup.removeView(c69338Vlk.A01);
                c69338Vlk.A01 = null;
                viewGroup.postInvalidate();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        long j;
        String str;
        switch (this.A00) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                ((X9K) viewGroup).getReactScrollViewScrollState().A02 = true;
                C70196WGa.A04(viewGroup);
                return;
            case 1:
                C69459Vni c69459Vni = (C69459Vni) this.A01;
                A58 a58 = c69459Vni.A03;
                if (a58 == null) {
                    return;
                }
                VelocityTracker velocityTracker = c69459Vni.A0B;
                velocityTracker.computeCurrentVelocity(1000);
                velocityTracker.getYVelocity();
                C81Y c81y = a58.A00.A01;
                if (c81y == null) {
                    C14360o3.A0F("quickCaptureController");
                    throw C00O.createAndThrow();
                }
                if (c81y.A00.A01 == C22P.A1S) {
                    str = "back";
                } else {
                    str = "button";
                }
                c81y.A05(str, false);
                return;
            case 2:
                FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) this.A01;
                fBPayAnimationButton.getButtonView().setVisibility(4);
                fBPayAnimationButton.getProgressBarView().setVisibility(0);
                fBPayAnimationButton.getProgressMsgView().setVisibility(0);
                ViewPropertyAnimator alpha = fBPayAnimationButton.getProgressMsgView().animate().alpha(1.0f);
                boolean z = FBPayAnimationButton.A0D;
                long j2 = 3000;
                if (z) {
                    j = 3000;
                } else {
                    j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                }
                fBPayAnimationButton.A03 = alpha.setStartDelay(j).setDuration(400L).withStartAction(new RunnableC71286WrG(fBPayAnimationButton)).withEndAction(new RunnableC71287WrH(fBPayAnimationButton));
                fBPayAnimationButton.getProgressBarView().setPivotY(0.0f);
                fBPayAnimationButton.getProgressMsgView().setPivotX(fBPayAnimationButton.getButtonView().getPivotX());
                ViewPropertyAnimator scaleY = fBPayAnimationButton.getProgressBarView().animate().scaleX(0.5f).scaleY(0.5f);
                if (!z) {
                    j2 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                }
                scaleY.setStartDelay(j2).setDuration(400L);
                return;
            case 3:
                C69338Vlk c69338Vlk = (C69338Vlk) this.A01;
                ViewGroup viewGroup2 = c69338Vlk.A02;
                viewGroup2.removeView(c69338Vlk.A01);
                c69338Vlk.A01 = null;
                viewGroup2.postInvalidate();
                return;
            case 4:
                return;
            default:
                PlayableProgressBar playableProgressBar = (PlayableProgressBar) this.A01;
                AbstractC43594JPz.A0G(playableProgressBar).setDuration(playableProgressBar.A02).start();
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (4 - this.A00 == 0) {
            ((AnonymousClass693) this.A01).FEB(0.42307693f, 1.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A00 == 0) {
            C69327VlZ reactScrollViewScrollState = ((X9K) ((ViewGroup) this.A01)).getReactScrollViewScrollState();
            reactScrollViewScrollState.A01 = false;
            reactScrollViewScrollState.A02 = false;
        }
    }
}
