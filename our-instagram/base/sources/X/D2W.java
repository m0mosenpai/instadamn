package X;

import android.util.LruCache;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class D2W implements Runnable {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ CUI A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public D2W(C120985dq c120985dq, C75113Zb c75113Zb, CUI cui, boolean z, boolean z2) {
        this.A01 = c75113Zb;
        this.A04 = z;
        this.A02 = cui;
        this.A00 = c120985dq;
        this.A03 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC19610xo ARD;
        C75113Zb c75113Zb = this.A01;
        if (!c75113Zb.A2h && !c75113Zb.A1o && c75113Zb.A0n == null) {
            c75113Zb.A0f(true);
            c75113Zb.A1K = "delay_swipe_left_nudge_or_nux";
            if (this.A04) {
                CUI cui = this.A02;
                C120985dq c120985dq = this.A00;
                LruCache lruCache = cui.A01;
                if (lruCache.get(AbstractC25226BEj.A1E(c120985dq)) == null) {
                    lruCache.put(AbstractC25226BEj.A1E(c120985dq), AbstractC25226BEj.A1E(c120985dq));
                    InterfaceC19630xq interfaceC19630xq = cui.A02;
                    AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "KEY_NUX_SHOWN_COUNT", 0);
                    return;
                }
                return;
            }
            if (!this.A03) {
                return;
            }
            CTq cTq = this.A02.A03;
            synchronized (cTq) {
                long millis = TimeUnit.MINUTES.toMillis(C18U.A01(C06090Tz.A06, cTq.A00, 36598992585756018L));
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19630xq interfaceC19630xq2 = cTq.A01;
                if ((!interfaceC19630xq2.contains("KEY_FIRST_NUDGE_TIMESTAMP_MS") || currentTimeMillis - interfaceC19630xq2.getLong("KEY_FIRST_NUDGE_TIMESTAMP_MS", currentTimeMillis) <= millis) && interfaceC19630xq2.getInt("KEY_NUDGE_SHOWN_COUNT", 0) != 0) {
                    ARD = interfaceC19630xq2.ARD();
                    ARD.E7D("KEY_NUDGE_SHOWN_COUNT", interfaceC19630xq2.getInt("KEY_NUDGE_SHOWN_COUNT", 0) + 1);
                } else {
                    ARD = interfaceC19630xq2.ARD();
                    ARD.EEj("KEY_FIRST_NUDGE_TIMESTAMP_MS");
                    ARD.EEj("KEY_NUDGE_SHOWN_COUNT");
                    ARD.E7G("KEY_FIRST_NUDGE_TIMESTAMP_MS", currentTimeMillis);
                    ARD.E7D("KEY_NUDGE_SHOWN_COUNT", 1);
                }
                ARD.apply();
            }
            return;
        }
        c75113Zb.A2K = true;
    }
}
