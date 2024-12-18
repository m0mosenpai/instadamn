package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;

/* renamed from: X.WtM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71398WtM implements Runnable {
    public final /* synthetic */ Ut9 A00;
    public final /* synthetic */ WXb A01;

    public RunnableC71398WtM(Ut9 ut9, WXb wXb) {
        this.A01 = wXb;
        this.A00 = ut9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WXb wXb = this.A01;
        FrameLayout.LayoutParams layoutParams = WXb.A0c;
        OverScroller overScroller = wXb.A0W;
        overScroller.computeScrollOffset();
        wXb.A04 = overScroller.getCurrX();
        wXb.A05 = overScroller.getCurrY();
        float currX = overScroller.getCurrX();
        float currY = overScroller.getCurrY();
        View A00 = WXb.A00(wXb);
        A00.setTranslationX(currX);
        A00.setTranslationY(currY);
        if (!overScroller.isFinished()) {
            this.A00.postOnAnimation(this);
        } else {
            WXb.A02(wXb);
        }
    }
}
