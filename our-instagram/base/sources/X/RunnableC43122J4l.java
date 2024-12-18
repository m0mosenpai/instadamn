package X;

import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;

/* renamed from: X.J4l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43122J4l implements Runnable {
    public final /* synthetic */ FadeInFollowButton A00;
    public final /* synthetic */ Boolean A01;

    public RunnableC43122J4l(FadeInFollowButton fadeInFollowButton, Boolean bool) {
        this.A00 = fadeInFollowButton;
        this.A01 = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FadeInFollowButton fadeInFollowButton = this.A00;
        fadeInFollowButton.A0B = false;
        fadeInFollowButton.setDisplayedChild(0);
        fadeInFollowButton.postDelayed(new RunnableC151166rJ(fadeInFollowButton), 200L);
        if (!this.A01.booleanValue()) {
            fadeInFollowButton.postDelayed(new J6S(fadeInFollowButton), 200L);
        }
    }
}
