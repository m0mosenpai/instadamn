package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Y9h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73351Y9h implements YOl {
    public YNa A00;
    public C73358Y9o A01;
    public ScheduledFuture A02;

    @Override // X.YOl
    public final synchronized void DSb(Object obj, ScheduledExecutorService scheduledExecutorService, int i) {
        if (i == 7) {
            this.A02 = scheduledExecutorService.scheduleAtFixedRate(new YGG(this), 5L, 2L, TimeUnit.SECONDS);
        }
    }

    @Override // X.YOl
    public final boolean EjB(int i, Object obj) {
        return i == 7;
    }
}
