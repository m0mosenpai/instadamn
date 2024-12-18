package X;

import android.view.ViewPropertyAnimator;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.WrH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71287WrH implements Runnable {
    public final /* synthetic */ FBPayAnimationButton A00;

    public RunnableC71287WrH(FBPayAnimationButton fBPayAnimationButton) {
        this.A00 = fBPayAnimationButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FBPayAnimationButton fBPayAnimationButton = this.A00;
        if (FBPayAnimationButton.A0D) {
            ViewPropertyAnimator withStartAction = fBPayAnimationButton.getProgressMsgView().animate().setStartDelay(3600L).setDuration(3000L).withStartAction(new RunnableC71285WrF(fBPayAnimationButton));
            fBPayAnimationButton.A02 = withStartAction;
            if (withStartAction != null) {
                withStartAction.start();
            }
        }
    }
}
