package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.WvC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71507WvC implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ V82 A01;

    public RunnableC71507WvC(View view, V82 v82) {
        this.A01 = v82;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect = new Rect();
        FollowButton followButton = this.A01.A0A;
        followButton.getHitRect(rect);
        rect.top -= 15;
        rect.left -= 15;
        rect.bottom += 15;
        rect.right += 15;
        this.A00.setTouchDelegate(new TouchDelegate(rect, followButton));
    }
}
