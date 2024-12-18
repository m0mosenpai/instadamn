package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class SMK {
    public boolean A00 = false;
    public final Intent A01;
    public final BroadcastReceiver.PendingResult A02;
    public final ScheduledFuture A03;

    public final synchronized void A00() {
        if (!this.A00) {
            this.A02.finish();
            this.A03.cancel(false);
            this.A00 = true;
        }
    }

    public SMK(BroadcastReceiver.PendingResult pendingResult, final Intent intent, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = intent;
        this.A02 = pendingResult;
        this.A03 = scheduledExecutorService.schedule(new Runnable(intent, this) { // from class: X.TOp
            public final Intent A00;
            public final SMK A01;

            {
                this.A01 = this;
                this.A00 = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SMK smk = this.A01;
                String action = this.A00.getAction();
                StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(action) + 61);
                A0q.append("Service took too long to process intent: ");
                A0q.append(action);
                android.util.Log.w("EnhancedIntentService", AbstractC166997dE.A0x(" App may get closed.", A0q));
                smk.A00();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }
}
