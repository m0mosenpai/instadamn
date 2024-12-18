package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* renamed from: X.Q0b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58688Q0b implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Q0Z A01;
    public final /* synthetic */ C1114950n A02;
    public final /* synthetic */ C49182Nr A03;
    public final /* synthetic */ UUID A04;

    public RunnableC58688Q0b(final Context this$0, final Q0Z val$future, final C1114950n val$id, final C49182Nr val$foregroundInfo, final UUID val$context) {
        this.A02 = val$id;
        this.A03 = val$foregroundInfo;
        this.A04 = val$context;
        this.A01 = val$future;
        this.A00 = this$0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C49182Nr c49182Nr = this.A03;
            if (!c49182Nr.isCancelled()) {
                String obj = this.A04.toString();
                C1114950n c1114950n = this.A02;
                C48412Ki CHq = c1114950n.A01.CHq(obj);
                if (CHq != null && !CHq.A0E.A00()) {
                    C2MZ c2mz = c1114950n.A00;
                    Q0Z q0z = this.A01;
                    C2MX c2mx = (C2MX) c2mz;
                    synchronized (c2mx.A09) {
                        try {
                            C48442Kl.A00();
                            RunnableC52072a7 runnableC52072a7 = (RunnableC52072a7) c2mx.A04.remove(obj);
                            if (runnableC52072a7 != null) {
                                if (c2mx.A01 == null) {
                                    PowerManager.WakeLock A00 = ST7.A00(c2mx.A00, "ProcessorForegroundLck");
                                    c2mx.A01 = A00;
                                    AbstractC09820fg.A00(A00);
                                }
                                c2mx.A05.put(obj, runnableC52072a7);
                                Context context = c2mx.A00;
                                C2WP A002 = C2WN.A00(runnableC52072a7.A08);
                                Intent A08 = MSW.A08(context, SystemForegroundService.class);
                                A08.setAction("ACTION_START_FOREGROUND");
                                A08.putExtra("KEY_WORKSPEC_ID", A002.A01);
                                A08.putExtra("KEY_GENERATION", A002.A00);
                                A08.putExtra("KEY_NOTIFICATION_ID", q0z.A01);
                                A08.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q0z.A00);
                                A08.putExtra("KEY_NOTIFICATION", q0z.A02);
                                context.startForegroundService(A08);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Context context2 = this.A00;
                    C2WP A003 = C2WN.A00(CHq);
                    Intent A082 = MSW.A08(context2, SystemForegroundService.class);
                    A082.setAction("ACTION_NOTIFY");
                    A082.putExtra("KEY_NOTIFICATION_ID", q0z.A01);
                    A082.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q0z.A00);
                    A082.putExtra("KEY_NOTIFICATION", q0z.A02);
                    A082.putExtra("KEY_WORKSPEC_ID", A003.A01);
                    A082.putExtra("KEY_GENERATION", A003.A00);
                    context2.startService(A082);
                } else {
                    throw AbstractC166987dD.A14("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            c49182Nr.A07(null);
        } catch (Throwable th2) {
            this.A03.A08(th2);
        }
    }
}
