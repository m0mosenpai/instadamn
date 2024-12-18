package X;

import android.view.animation.Animation;
import com.instagram.creation.video.ui.FilmstripScrollView;

/* renamed from: X.Ol4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class AnimationAnimationListenerC55511Ol4 implements Animation.AnimationListener {
    public final /* synthetic */ double A00;
    public final /* synthetic */ NLH A01;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC55511Ol4(NLH nlh, double d) {
        this.A01 = nlh;
        this.A00 = d;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        FilmstripScrollView filmstripScrollView = this.A01.A0F;
        if (filmstripScrollView != null) {
            filmstripScrollView.setScrollX((int) this.A00);
        }
    }
}
