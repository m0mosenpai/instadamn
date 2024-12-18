package X;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.TNx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64641TNx implements Runnable {
    public SP7 A00;
    public final /* synthetic */ C62952SYu A01;

    public RunnableC64641TNx(SP7 sp7, C62952SYu c62952SYu) {
        this.A01 = c62952SYu;
        this.A00 = sp7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62952SYu c62952SYu = this.A01;
        Executor executor = C62952SYu.A04;
        C62606SIm c62606SIm = c62952SYu.A02;
        SP7 sp7 = this.A00;
        if (c62606SIm.A00 == Integer.MAX_VALUE) {
            C0K8.A0D("CounterSession", "Reached max counterEvents probably due to upload failure, clearing old events");
            c62606SIm.A04.clear();
            c62606SIm.A00 = 0;
        }
        String A11 = AnonymousClass001.A11("fbns_counters", "_", sp7.A00(), "_", sp7.A02);
        Map map = c62606SIm.A04;
        if (map.containsKey(A11)) {
            C61566Rpo c61566Rpo = ((SP7) map.get(A11)).A00;
            C61566Rpo c61566Rpo2 = sp7.A00;
            c61566Rpo.A00 += c61566Rpo2.A00;
            c61566Rpo.A02 += c61566Rpo2.A02;
            c61566Rpo.A01 = Math.max(c61566Rpo.A01, c61566Rpo2.A01);
        } else {
            map.put(A11, sp7);
        }
        int i = c62606SIm.A00 + 1;
        c62606SIm.A00 = i;
        if (i >= 50) {
            C62952SYu.A04.execute(new RunnableC64579TKq(c62952SYu));
            return;
        }
        AtomicBoolean atomicBoolean = c62952SYu.A03;
        if (!atomicBoolean.compareAndSet(false, true) || c62952SYu.A00.sendEmptyMessageDelayed(1, 300000L)) {
            return;
        }
        atomicBoolean.set(false);
    }
}
