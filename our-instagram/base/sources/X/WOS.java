package X;

import android.view.animation.Animation;

/* loaded from: classes11.dex */
public final class WOS implements Animation.AnimationListener {
    public final /* synthetic */ C6TZ A00;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public WOS(C6TZ c6tz) {
        this.A00 = c6tz;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.A01.setVisibility(8);
    }
}
