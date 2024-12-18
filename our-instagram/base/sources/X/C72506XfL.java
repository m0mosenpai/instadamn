package X;

import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XfL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72506XfL {
    public C73253Xyr A00;
    public java.util.Set A01;
    public ScheduledExecutorService A02;
    public InterfaceC08830cm A03;
    public InterfaceC08830cm A04;
    public InterfaceC08830cm A05;

    public final void A00(int i, Object obj) {
        if (this.A00 == null) {
            this.A00 = (C73253Xyr) this.A04.get();
        }
        if (DebugHeadConfigurations.isMemoryMetricsDebuggingEnabled || C1AD.A06(C06090Tz.A05, 18296341637824763L)) {
            ScheduledExecutorService scheduledExecutorService = this.A02;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = (ScheduledExecutorService) this.A05.get();
                this.A02 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(new YI5(this, obj, i), 0L, TimeUnit.SECONDS);
        }
    }
}
