package X;

import com.facebookpay.widget.button.FBPayButton;

/* renamed from: X.WuE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71452WuE implements Runnable {
    public final /* synthetic */ WOB A00;
    public final /* synthetic */ C67726Uws A01;

    public RunnableC71452WuE(WOB wob, C67726Uws c67726Uws) {
        this.A01 = c67726Uws;
        this.A00 = wob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C67726Uws c67726Uws = this.A01;
        FBPayButton fBPayButton = c67726Uws.A0Q;
        if (fBPayButton != null) {
            if (fBPayButton.getViewTreeObserver().isAlive()) {
                FBPayButton fBPayButton2 = c67726Uws.A0Q;
                if (fBPayButton2 != null) {
                    fBPayButton2.getViewTreeObserver().removeOnDrawListener(this.A00);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("continueButton");
        throw C00O.createAndThrow();
    }
}
