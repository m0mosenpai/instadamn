package X;

import java.util.Timer;

/* renamed from: X.PKj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56839PKj implements Runnable {
    public final /* synthetic */ OML A00;

    public RunnableC56839PKj(OML oml) {
        this.A00 = oml;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OML oml = this.A00;
        Timer timer = oml.A00;
        if (timer != null) {
            timer.cancel();
        }
        oml.A00 = null;
    }
}
