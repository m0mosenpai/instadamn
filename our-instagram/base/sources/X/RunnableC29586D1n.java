package X;

import android.view.Choreographer;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.D1n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29586D1n implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C147356kL A01;

    public RunnableC29586D1n(C41181vS c41181vS, C147356kL c147356kL) {
        this.A01 = c147356kL;
        this.A00 = c41181vS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C147356kL c147356kL = this.A01;
        c147356kL.A0A.Dbu(this.A00);
        if (c147356kL.A07) {
            IgShowreelNativeProgressView igShowreelNativeProgressView = c147356kL.A05;
            if (igShowreelNativeProgressView != null) {
                igShowreelNativeProgressView.E4S();
            }
            ChoreographerFrameCallbackC147366kM choreographerFrameCallbackC147366kM = c147356kL.A09;
            choreographerFrameCallbackC147366kM.A00.A02 = System.currentTimeMillis();
            Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC147366kM);
        }
    }
}
