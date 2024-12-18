package X;

import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0aX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07580aX implements C0OO {
    public final C0LW A00;
    public final C0OP A01;
    public final C0Pe A02;
    public final ScheduledExecutorService A03;

    @Override // X.C0OO
    public final int BDP() {
        return 50000000;
    }

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    public final void A00() {
        synchronized (this.A01) {
            C0LW c0lw = this.A00;
            File file = c0lw.A02.A05;
            C02R.A03(file, "Did you call SessionManager.init()?");
            if (!file.exists()) {
                this.A03.shutdown();
            }
            if (C0L6.A07()) {
                C003801d c003801d = this.A02.A03;
                C02R.A03(c003801d, "Did you call SessionManager.init()?");
                c003801d.A07(System.currentTimeMillis());
                C024209q c024209q = new C024209q(null);
                c0lw.A09(c024209q, C0M6.CRITICAL_REPORT, this);
                c0lw.A09(c024209q, C0M6.LARGE_REPORT, this);
            }
        }
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return this.A01;
    }

    @Override // X.C0OO
    public final void start() {
        this.A03.scheduleWithFixedDelay(new Runnable() { // from class: X.0P0
            @Override // java.lang.Runnable
            public final void run() {
                C07580aX.this.A00();
            }
        }, 30L, 30L, TimeUnit.SECONDS);
    }

    public C07580aX(C0LW c0lw, C0OP c0op, C0Pe c0Pe, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = c0op;
        this.A02 = c0Pe;
        this.A00 = c0lw;
        this.A03 = scheduledExecutorService;
    }
}
