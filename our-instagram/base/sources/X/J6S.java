package X;

import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;

/* loaded from: classes7.dex */
public final class J6S extends Thread {
    public final /* synthetic */ FadeInFollowButton A00;

    public J6S(FadeInFollowButton fadeInFollowButton) {
        this.A00 = fadeInFollowButton;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        FadeInFollowButton.A02(this.A00);
    }
}
