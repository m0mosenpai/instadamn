package X;

import android.view.View;
import com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView;

/* renamed from: X.9Iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC208099Iq implements Runnable {
    public final /* synthetic */ SquareAvatarWithBadgeView A00;

    public RunnableC208099Iq(SquareAvatarWithBadgeView squareAvatarWithBadgeView) {
        this.A00 = squareAvatarWithBadgeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View badgeClickDelegate;
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A00;
        badgeClickDelegate = squareAvatarWithBadgeView.getBadgeClickDelegate();
        squareAvatarWithBadgeView.removeView(badgeClickDelegate);
        squareAvatarWithBadgeView.setTouchDelegate(null);
    }
}
