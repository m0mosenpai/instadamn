package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView;

/* renamed from: X.AwR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24686AwR implements Runnable {
    public final /* synthetic */ SquareAvatarWithBadgeView A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC24686AwR(SquareAvatarWithBadgeView squareAvatarWithBadgeView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = squareAvatarWithBadgeView;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View badgeClickDelegate;
        View badgeClickDelegate2;
        Rect badgeDrawableRect;
        View badgeClickDelegate3;
        View badgeClickDelegate4;
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A00;
        badgeClickDelegate = squareAvatarWithBadgeView.getBadgeClickDelegate();
        if (badgeClickDelegate.getParent() == null) {
            badgeClickDelegate4 = squareAvatarWithBadgeView.getBadgeClickDelegate();
            squareAvatarWithBadgeView.addView(badgeClickDelegate4);
        }
        badgeClickDelegate2 = squareAvatarWithBadgeView.getBadgeClickDelegate();
        C0fQ.A00(new ViewOnClickListenerC42032Ik1(this.A01, 12), badgeClickDelegate2);
        badgeDrawableRect = squareAvatarWithBadgeView.getBadgeDrawableRect();
        if (badgeDrawableRect != null) {
            badgeClickDelegate3 = squareAvatarWithBadgeView.getBadgeClickDelegate();
            squareAvatarWithBadgeView.setTouchDelegate(new TouchDelegate(badgeDrawableRect, badgeClickDelegate3));
        }
    }
}
