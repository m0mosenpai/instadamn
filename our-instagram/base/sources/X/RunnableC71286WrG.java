package X;

import android.content.Context;
import android.widget.TextView;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.WrG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71286WrG implements Runnable {
    public final /* synthetic */ FBPayAnimationButton A00;

    public RunnableC71286WrG(FBPayAnimationButton fBPayAnimationButton) {
        this.A00 = fBPayAnimationButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = FBPayAnimationButton.A0D;
        FBPayAnimationButton fBPayAnimationButton = this.A00;
        if (z) {
            TextView progressMsgView = fBPayAnimationButton.getProgressMsgView();
            Context context = fBPayAnimationButton.getContext();
            AbstractC166987dD.A1P(context, progressMsgView, 2131961528);
            fBPayAnimationButton.getProgressMsgView().setTextColor(C2FP.A0A().A02(context, 16));
            return;
        }
        AbstractC166987dD.A1P(fBPayAnimationButton.getContext(), fBPayAnimationButton.getProgressMsgView(), 2131961527);
    }
}
