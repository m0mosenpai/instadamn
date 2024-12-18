package X;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class SWY {
    public static C64927Ta2 A03;
    public static ThreadPoolExecutor A04;
    public static final BlockingQueue A05;
    public Handler A00;
    public final java.util.Set A02 = AbstractC166987dD.A1H();
    public final java.util.Set A01 = AbstractC166987dD.A1H();

    static {
        C64926Ta1 c64926Ta1 = new C64926Ta1();
        A05 = c64926Ta1;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        QG1 qg1 = new QG1(c64926Ta1, new TVD(10, "WhatsApp Worker"), timeUnit);
        A03 = qg1;
        qg1.setRejectedExecutionHandler(new TUz());
        A04 = new C64927Ta2(1, Integer.MAX_VALUE, 120L, timeUnit, new SynchronousQueue(), new TVD(0, "High Pri Worker"));
    }
}
