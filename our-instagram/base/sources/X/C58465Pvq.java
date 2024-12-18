package X;

import android.location.LocationManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Pvq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58465Pvq extends AbstractC128665rZ {
    public C58516Pwk A00;
    public String A01;
    public final LocationManager A02;
    public final C103724lq A03;
    public final C58512Pwg A04;
    public final ExecutorService A05;
    public final AtomicBoolean A06;

    @Override // X.AbstractC128665rZ
    public final synchronized void A05() {
        this.A06.set(false);
        LocationManager locationManager = this.A02;
        if (locationManager != null) {
            C0fS.A01(this.A04, locationManager);
        }
        this.A00 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58465Pvq(LocationManager locationManager, C0JM c0jm, C0JO c0jo, C103724lq c103724lq, C100004eN c100004eN, C103744ls c103744ls, C61786Rtg c61786Rtg, C103774lw c103774lw, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C61554Rpa c61554Rpa, C103754lu c103754lu, C3VM c3vm, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        super(c0jm, c0jo, c103724lq, c100004eN, c103744ls, c61786Rtg, c103774lw, lightweightQuickPerformanceLogger, c61554Rpa, c103754lu, c3vm, executorService, scheduledExecutorService);
        AbstractC167017dG.A1R(c0jm, c0jo);
        this.A03 = c103724lq;
        this.A05 = scheduledExecutorService;
        this.A02 = locationManager;
        this.A06 = new AtomicBoolean();
        this.A04 = new C58512Pwg(this);
    }
}
