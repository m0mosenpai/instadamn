package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71633Jm {
    public final C71653Jo A00;

    public final synchronized void A01() {
        synchronized (C2S1.A00()) {
        }
        C71653Jo c71653Jo = this.A00;
        synchronized (c71653Jo) {
            C0K8.A0A(C71653Jo.class, "onUserLeftApp mSweepFuture=%s", c71653Jo.A03);
            if (c71653Jo.A03 == null) {
                C0K8.A0A(C71653Jo.class, "Scheduling memory leak check in %d ms ", Long.valueOf(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT));
                c71653Jo.A03 = c71653Jo.A05.schedule(c71653Jo.A04, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void A02(Object obj, String str, Map map) {
        C71653Jo.A00(this.A00, obj, str, map);
    }

    public final void A03(Object obj, String str, Map map) {
        C71653Jo.A00(this.A00, obj, str, map);
    }

    public final void A04(Object obj, String str, Map map) {
        C71653Jo.A00(this.A00, obj, str, map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Jn] */
    public C71633Jm(ScheduledExecutorService scheduledExecutorService) {
        this.A00 = new C71653Jo(new Object() { // from class: X.3Jn
        }, scheduledExecutorService);
        synchronized (C2S1.A00()) {
        }
    }

    public final void A00() {
        synchronized (C2S1.A00()) {
        }
        C71653Jo c71653Jo = this.A00;
        synchronized (c71653Jo) {
            ScheduledFuture scheduledFuture = c71653Jo.A03;
            if (scheduledFuture != null && !scheduledFuture.isCancelled() && !c71653Jo.A03.isDone()) {
                c71653Jo.A03.cancel(false);
                c71653Jo.A03 = null;
            }
        }
    }
}
