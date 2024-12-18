package X;

import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* loaded from: classes8.dex */
public final class JR9 implements Runnable {
    public final /* synthetic */ ReelAvatarWithBadgeView A00;

    public JR9(ReelAvatarWithBadgeView reelAvatarWithBadgeView) {
        this.A00 = reelAvatarWithBadgeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A00;
        reelAvatarWithBadgeView.removeView(AbstractC166987dD.A0d(reelAvatarWithBadgeView.A06));
        reelAvatarWithBadgeView.setTouchDelegate(null);
    }
}
