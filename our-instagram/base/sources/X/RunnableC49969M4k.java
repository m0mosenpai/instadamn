package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* renamed from: X.M4k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49969M4k implements Runnable {
    public final /* synthetic */ ReelAvatarWithBadgeView A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC49969M4k(ReelAvatarWithBadgeView reelAvatarWithBadgeView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = reelAvatarWithBadgeView;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect badgeDrawableRect;
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A00;
        InterfaceC09390do interfaceC09390do = reelAvatarWithBadgeView.A06;
        if (AbstractC166987dD.A0d(interfaceC09390do).getParent() == null) {
            reelAvatarWithBadgeView.addView(AbstractC166987dD.A0d(interfaceC09390do));
        }
        ViewOnClickListenerC48073LPy.A00(AbstractC166987dD.A0d(interfaceC09390do), 37, this.A01);
        badgeDrawableRect = reelAvatarWithBadgeView.getBadgeDrawableRect();
        if (badgeDrawableRect != null) {
            reelAvatarWithBadgeView.setTouchDelegate(new TouchDelegate(badgeDrawableRect, AbstractC166987dD.A0d(interfaceC09390do)));
        }
    }
}
