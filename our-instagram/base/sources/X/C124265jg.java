package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124265jg implements InterfaceC12870lZ {
    public static C124265jg A0A;
    public long A00;
    public long A01;
    public ScheduledFuture A02;
    public final C0Gd A03;
    public final C0JK A04;
    public final LightweightQuickPerformanceLogger A05;
    public final Runnable A06;
    public final Map A07;
    public final ScheduledExecutorService A08;
    public final AtomicBoolean A09;

    public final synchronized void A00() {
        if (this.A02 == null) {
            this.A02 = this.A08.scheduleAtFixedRate(this.A06, 0L, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, TimeUnit.MILLISECONDS);
        }
    }

    public C124265jg(QuickPerformanceLogger quickPerformanceLogger) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C0JK A01 = C0JK.A01();
        C0w9 c0w9 = C0w9.A01;
        this.A00 = 0L;
        this.A08 = scheduledThreadPoolExecutor;
        this.A04 = A01;
        this.A03 = c0w9;
        this.A05 = quickPerformanceLogger;
        this.A07 = new HashMap();
        this.A06 = new TLA(this);
        this.A09 = new AtomicBoolean(false);
        this.A01 = 0L;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1434328503);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.A02;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A02 = null;
            }
        }
        C0f9.A0A(-1646835154, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1827526975);
        A00();
        C0f9.A0A(-286602931, A03);
    }
}
