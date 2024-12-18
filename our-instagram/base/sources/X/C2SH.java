package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.2SH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2SH {
    public MemoryTimeline A00;
    public boolean A01;
    public final C2SJ A02;
    public final C2SI A03;
    public final InterfaceC19630xq A04;
    public final C49912Rb A05;
    public final ScheduledExecutorService A06;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2SI] */
    public C2SH(C49912Rb c49912Rb, ScheduledExecutorService scheduledExecutorService) {
        C14360o3.A0B(scheduledExecutorService, 1);
        C14360o3.A0B(c49912Rb, 2);
        this.A01 = false;
        this.A06 = scheduledExecutorService;
        this.A03 = new Runnable() { // from class: X.2SI
            @Override // java.lang.Runnable
            public final void run() {
                C2S1.A00().A02().A09("Daily", null, 0);
                C2SJ c2sj = C2SH.this.A02;
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = c2sj.A00.A04.ARD();
                ARD.E7G("last_dump_time", currentTimeMillis);
                ARD.E7G("next_dump_time", currentTimeMillis + 86400000);
                ARD.apply();
            }
        };
        this.A02 = new C2SJ(this);
        this.A05 = c49912Rb;
        this.A04 = AbstractC19750y3.A01("ig_memory_daily_hprof_dump_prefs");
    }

    public static void A00(C2SH c2sh) {
        if (c2sh.A00 != null) {
            long A01 = (int) C20150ym.A01(AbstractC20070ye.A00(18577816616042864L));
            long A012 = (int) C20150ym.A01(AbstractC20070ye.A00(18577816616173938L));
            if (A01 > 0 || A012 > 0) {
                c2sh.A00.AAR(new C64079Syv(c2sh.A02, c2sh.A06, (int) C20150ym.A01(AbstractC20070ye.A00(18577816616108401L)), A01, (int) C20150ym.A01(AbstractC20070ye.A00(18577816616239475L)), A012));
            }
        }
    }
}
