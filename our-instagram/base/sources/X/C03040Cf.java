package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03040Cf implements C0OO {
    public final C0LW A00;
    public final C0Pe A01;
    public final InterfaceC08830cm A02;

    public static void A00(C0MF c0mf, final C03040Cf c03040Cf) {
        final C024209q c024209q = new C024209q(null);
        c024209q.A01(C0LK.A16, 1);
        c024209q.A02(C0LK.A1X, Long.valueOf(System.currentTimeMillis() / 1000));
        if (C0PD.A03) {
            c024209q.A00(C0LK.A0C, true);
        }
        c024209q.A03(C0LK.A4Q, String.valueOf(c0mf.A01));
        int i = C0M4.A01;
        if (i != 2 && !C0M4.A00()) {
            if (i == 1) {
                C0LW c0lw = c03040Cf.A00;
                C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                c0lw.A0E(c0m6, c03040Cf);
                c0lw.A08(c024209q, c0m6, c03040Cf);
                Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: X.0Oj
                    @Override // java.lang.Runnable
                    public final void run() {
                        C03040Cf c03040Cf2 = C03040Cf.this;
                        if (!C0LW.A0J.contains("JavaAppDeathDetector")) {
                            c03040Cf2.A00.A0D(C0M6.CRITICAL_REPORT, c03040Cf2);
                        }
                    }
                }, 1200L, TimeUnit.MILLISECONDS);
                return;
            }
            return;
        }
        if (C0M4.A03) {
            C04590Mb.A04.execute(new Runnable() { // from class: X.0Oi
                @Override // java.lang.Runnable
                public final void run() {
                    C03040Cf c03040Cf2 = c03040Cf;
                    C024209q c024209q2 = c024209q;
                    C0LW c0lw2 = c03040Cf2.A00;
                    C0M6 c0m62 = C0M6.CRITICAL_REPORT;
                    c0lw2.A0E(c0m62, c03040Cf2);
                    c0lw2.A08(c024209q2, c0m62, c03040Cf2);
                    c0lw2.A0D(c0m62, c03040Cf2);
                }
            });
            return;
        }
        C0LW c0lw2 = c03040Cf.A00;
        C0M6 c0m62 = C0M6.CRITICAL_REPORT;
        c0lw2.A0E(c0m62, c03040Cf);
        c0lw2.A08(c024209q, c0m62, c03040Cf);
        c0lw2.A0D(c0m62, c03040Cf);
    }

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0H;
    }

    @Override // X.C0OO
    public final void start() {
        final C0MF c0mf = (C0MF) this.A02.get();
        if (c0mf.A06) {
            if (C0MG.A02(C05F.A01, c0mf.A01)) {
                C0Pe.A09 = C0OP.A0H;
                C0PA.A00("JavaAppDeathEarlyDetector", Collections.singletonMap("detected", RealtimeSubscription.GRAPHQL_MQTT_VERSION));
                if (C0M4.A01 == 4 && !c0mf.A05) {
                    C0LW.A0G = new Runnable() { // from class: X.0Oh
                        @Override // java.lang.Runnable
                        public final void run() {
                            C03040Cf.A00(c0mf, this);
                        }
                    };
                    return;
                } else {
                    A00(c0mf, this);
                    return;
                }
            }
        }
        C0PA.A00("JavaAppDeathEarlyDetector", Collections.singletonMap("detected", "0"));
    }

    public C03040Cf(C0LW c0lw, C0Pe c0Pe, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = c0Pe;
        this.A00 = c0lw;
        this.A02 = interfaceC08830cm;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
