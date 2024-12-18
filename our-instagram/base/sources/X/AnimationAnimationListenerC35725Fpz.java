package X;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* renamed from: X.Fpz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC35725Fpz implements Animation.AnimationListener {
    public final /* synthetic */ C6U5 A00;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC35725Fpz(C6U5 c6u5) {
        this.A00 = c6u5;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        String str;
        C6U5 c6u5 = this.A00;
        ConstraintLayout constraintLayout = c6u5.A07;
        if (constraintLayout != null) {
            AbstractC31173DnH.A0z(c6u5.A00().getContext(), constraintLayout, R.drawable.reel_lead_gen_card_rounded_top_corner_background);
            ConstraintLayout constraintLayout2 = c6u5.A08;
            if (constraintLayout2 != null) {
                constraintLayout2.startAnimation(AnimationUtils.loadAnimation(c6u5.A00().getContext(), R.anim.button_slide_down_20_to_0));
                return;
            }
            str = "ctaButtonLayout";
        } else {
            str = "cardViewWithoutCta";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C6U5 c6u5 = this.A00;
        c6u5.A01().setAlpha(0.0f);
        c6u5.A01().animate().alpha(1.0f).setDuration(400L).setInterpolator(new DecelerateInterpolator()).start();
    }
}
