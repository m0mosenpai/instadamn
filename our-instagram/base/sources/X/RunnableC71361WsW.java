package X;

import android.view.animation.AnticipateInterpolator;

/* renamed from: X.WsW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71361WsW implements Runnable {
    public final /* synthetic */ C86083sf A00;

    public RunnableC71361WsW(C86083sf c86083sf) {
        this.A00 = c86083sf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC43594JPz.A0G(this.A00.A01()).scaleX(0.8f).scaleY(0.8f).setStartDelay(400L).setDuration(200L).setInterpolator(new AnticipateInterpolator()).start();
    }
}
