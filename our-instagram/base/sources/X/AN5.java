package X;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes4.dex */
public final class AN5 implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public AN5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (3 - this.A00 == 0) {
            C14360o3.A0B(animator, 0);
            animator.removeAllListeners();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                C9R5 c9r5 = (C9R5) this.A01;
                ((IgImageView) AbstractC166987dD.A17(c9r5.A09)).setVisibility(8);
                View view = c9r5.A05;
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setRotationY(0.0f);
                View view2 = c9r5.A04;
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setRotationY(0.0f);
                return;
            case 1:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 2:
                C9LA c9la = (C9LA) this.A01;
                c9la.A04.pause();
                ImageView imageView = c9la.A01;
                if (imageView == null) {
                    C14360o3.A0F("animationView");
                    throw C00O.createAndThrow();
                }
                imageView.setVisibility(8);
                BC1 bc1 = c9la.A02;
                if (bc1 == null) {
                    return;
                }
                bc1.Cwc();
                return;
            default:
                ((View) this.A01).setVisibility(8);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
