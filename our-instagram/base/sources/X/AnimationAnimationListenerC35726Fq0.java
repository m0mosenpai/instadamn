package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* renamed from: X.Fq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC35726Fq0 implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;

    public AnimationAnimationListenerC35726Fq0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view;
        String str;
        switch (this.A00) {
            case 0:
            case 1:
            case 6:
                view = (View) this.A01;
                break;
            case 2:
                view = ((C35045FcI) this.A01).A02();
                break;
            case 3:
            case 4:
            case 7:
            default:
                return;
            case 5:
                C6U5 c6u5 = (C6U5) this.A01;
                c6u5.A01().setVisibility(4);
                ConstraintLayout constraintLayout = c6u5.A08;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(4);
                    ConstraintLayout constraintLayout2 = c6u5.A07;
                    if (constraintLayout2 != null) {
                        AbstractC31173DnH.A0z(c6u5.A00().getContext(), constraintLayout2, R.drawable.reel_ctwa_story_messaging_card_rounded_corner_background);
                        return;
                    }
                    str = "cardViewWithoutCta";
                } else {
                    str = "ctaButtonLayout";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                AbstractC55163OdR.A03((View) this.A01, C36719GGo.A00);
                return;
        }
        view.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.A00) {
            case 3:
            case 4:
                ((View) this.A01).setVisibility(0);
                return;
            case 5:
                ((C6U5) this.A01).A01().animate().alpha(0.0f).setDuration(400L).setInterpolator(new DecelerateInterpolator()).start();
                return;
            case 6:
            default:
                return;
            case 7:
                View view = (View) this.A01;
                if (view == null) {
                    return;
                }
                view.setTranslationZ(1.0f);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
