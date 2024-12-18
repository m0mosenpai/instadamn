package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.facebook.smartcapture.ui.view.FaceCaptureProgressView;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* loaded from: classes8.dex */
public final class JX2 extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public JX2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new JX2(obj, i));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
            case 8:
                ((View) this.A01).setVisibility(8);
                return;
            case 1:
                C47597L0h c47597L0h = (C47597L0h) this.A01;
                if (c47597L0h.A00) {
                    return;
                }
                c47597L0h.A02.post(new RunnableC49824LzV(c47597L0h));
                return;
            case 2:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                FaceCaptureProgressView faceCaptureProgressView = (FaceCaptureProgressView) this.A01;
                Property property = FaceCaptureProgressView.A0K;
                faceCaptureProgressView.A01 = null;
                return;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                viewGroup.removeAllViews();
                ViewParent parent = viewGroup.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return;
                }
                ((ViewGroup) parent).removeView(viewGroup);
                return;
            case 5:
                TransitionCarouselImageView transitionCarouselImageView = (TransitionCarouselImageView) this.A01;
                transitionCarouselImageView.A01 = transitionCarouselImageView.A02;
                transitionCarouselImageView.A0I.set(transitionCarouselImageView.A0J);
                if (transitionCarouselImageView.A0K) {
                    ValueAnimator valueAnimator = transitionCarouselImageView.A0F;
                    ValueAnimator valueAnimator2 = transitionCarouselImageView.A0H;
                    valueAnimator.setCurrentFraction(valueAnimator2.getAnimatedFraction());
                    valueAnimator2.cancel();
                    valueAnimator.start();
                }
                if (transitionCarouselImageView.A01 != null) {
                    transitionCarouselImageView.invalidate();
                }
                List list = transitionCarouselImageView.A03;
                if (list == null || list.size() <= 1) {
                    return;
                }
                transitionCarouselImageView.A00 = (transitionCarouselImageView.A00 + 1) % list.size();
                TransitionCarouselImageView.A01(transitionCarouselImageView);
                return;
            case 6:
                ((C47928LEx) this.A01).A00 = true;
                return;
            case 7:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 9:
                View view = (View) this.A01;
                view.clearAnimation();
                AbstractC43593JPy.A0E(view.animate().setDuration(200L).translationY(0.0f), 1.0f).setInterpolator(new AccelerateInterpolator()).setListener(null).start();
                return;
            case 10:
                ((C44343Jii) this.A01).A05.start();
                return;
            case 11:
                C44436Jks c44436Jks = (C44436Jks) this.A01;
                c44436Jks.A01 = c44436Jks.A02;
                c44436Jks.A01();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((Runnable) this.A01).run();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 2:
                ArrowHintView arrowHintView = (ArrowHintView) this.A01;
                arrowHintView.A00 = arrowHintView.A05;
                ImageView imageView = arrowHintView.A02;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ImageView imageView2 = arrowHintView.A02;
                    if (imageView2 != null) {
                        imageView2.setAlpha(0.0f);
                        return;
                    }
                }
                C14360o3.A0F("checkView");
                throw C00O.createAndThrow();
            case 10:
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
