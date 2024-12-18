package X;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes11.dex */
public final class X27 extends TimerTask {
    public final /* synthetic */ UM2 A00;

    public X27(UM2 um2) {
        this.A00 = um2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        UM2 um2 = this.A00;
        Timer timer = um2.A0E;
        timer.cancel();
        timer.purge();
        if (um2.A08) {
            if (um2.A07 || (um2.A05 && !um2.A0F)) {
                AbstractC167007dF.A0J().post(new RunnableC71238WqT(um2));
            }
            um2.A04 = true;
        }
    }
}
