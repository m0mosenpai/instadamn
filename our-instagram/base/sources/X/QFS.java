package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes10.dex */
public final class QFS extends C93R {
    public BroadcastReceiver A00;
    public C108454uW A01;
    public C62675SLn A02;
    public ScheduledFuture A03;
    public boolean A04;
    public final Context A05;
    public final C0JM A06;
    public final C0JO A07;
    public final C108434uU A08;
    public final C108444uV A09;
    public final ScheduledExecutorService A0A;

    public static void A00(QFS qfs) {
        qfs.A04 = false;
        qfs.A02 = null;
        BroadcastReceiver broadcastReceiver = qfs.A00;
        if (broadcastReceiver != null) {
            qfs.A05.unregisterReceiver(broadcastReceiver);
            qfs.A00 = null;
        }
        ScheduledFuture scheduledFuture = qfs.A03;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            qfs.A03 = null;
        }
    }

    public QFS(Context context, C0JM c0jm, C0JO c0jo, C108454uW c108454uW, C108434uU c108434uU, C108444uV c108444uV, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = c108454uW;
        this.A05 = context;
        this.A08 = c108434uU;
        this.A06 = c0jm;
        this.A09 = c108444uV;
        this.A07 = c0jo;
        this.A0A = scheduledExecutorService;
    }
}
