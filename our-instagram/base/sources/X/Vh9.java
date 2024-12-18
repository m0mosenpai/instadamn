package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes11.dex */
public final class Vh9 {
    public final SIE A00;
    public final Map A01;
    public final ScheduledExecutorService A02;

    public /* synthetic */ Vh9(SIE sie) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.A00 = sie;
        this.A02 = scheduledThreadPoolExecutor;
        this.A01 = new ConcurrentHashMap();
    }
}
