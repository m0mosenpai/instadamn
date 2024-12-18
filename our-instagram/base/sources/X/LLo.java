package X;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import com.instagram.ui.widget.mediabutton.IgMediaButton;

/* loaded from: classes8.dex */
public final class LLo implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LLo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                if (((Fragment) this.A02).getContext() == null) {
                    return;
                }
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                AbstractC166987dD.A1Y(this.A01);
                ValueAnimator valueAnimator = ((FriendMapAnimatedLikeView) this.A02).A01;
                if (valueAnimator == null) {
                    return;
                }
                valueAnimator.start();
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (2 - this.A00 == 0) {
            PropertyValuesHolder[] values = ((ValueAnimator) this.A01).getValues();
            C14360o3.A07(values);
            for (PropertyValuesHolder propertyValuesHolder : values) {
                if (C14360o3.A0K(propertyValuesHolder.getPropertyName(), "rotation")) {
                    Interpolator interpolator = IgMediaButton.A0A;
                    propertyValuesHolder.setFloatValues(((float) (Math.random() * 29.0d)) - 14.0f);
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
