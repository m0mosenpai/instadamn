package X;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: X.50q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1115150q implements Runnable {
    public final Context A00;
    public final InterfaceC1115050o A01;
    public final AbstractC48352Kc A02;
    public final C48412Ki A03;
    public final C49182Nr A04 = new Object();
    public final C2LC A05;

    static {
        C48442Kl.A01("WorkForegroundRunnable");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.2Nr, X.2Nt] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.A03.A0J && Build.VERSION.SDK_INT < 31) {
            final ?? obj = new Object();
            Executor executor = ((C2LB) this.A05).A02;
            executor.execute(new Runnable() { // from class: X.TMi
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC1115150q runnableC1115150q = RunnableC1115150q.this;
                    C49182Nr c49182Nr = obj;
                    if (!runnableC1115150q.A04.isCancelled()) {
                        c49182Nr.A06(runnableC1115150q.A02.getForegroundInfoAsync());
                    } else {
                        c49182Nr.cancel(true);
                    }
                }
            });
            obj.addListener(new TMj(this, obj), executor);
            return;
        }
        this.A04.A07(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2Nr] */
    public RunnableC1115150q(Context context, InterfaceC1115050o workSpec, AbstractC48352Kc worker, C48412Ki foregroundUpdater, C2LC taskExecutor) {
        this.A00 = context;
        this.A03 = foregroundUpdater;
        this.A02 = worker;
        this.A01 = workSpec;
        this.A05 = taskExecutor;
    }
}
