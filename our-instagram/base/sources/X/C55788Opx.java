package X;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Opx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55788Opx implements InterfaceC65376Tj9 {
    public final /* synthetic */ C48972Mq A00;
    public final /* synthetic */ java.util.Set A01;
    public final /* synthetic */ CountDownLatch A02;

    public C55788Opx(C48972Mq c48972Mq, java.util.Set set, CountDownLatch countDownLatch) {
        this.A00 = c48972Mq;
        this.A01 = set;
        this.A02 = countDownLatch;
    }

    @Override // X.InterfaceC65376Tj9
    public final void D6g(C58428Pv7 c58428Pv7) {
        if (!c58428Pv7.A07() || c58428Pv7.A04() == null || !((C124725kd) c58428Pv7.A04()).A03) {
            this.A00.A00 = true;
        }
        java.util.Set set = this.A01;
        set.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
        CountDownLatch countDownLatch = this.A02;
        countDownLatch.countDown();
        if (countDownLatch.getCount() == 0) {
            C48972Mq c48972Mq = this.A00;
            if (!c48972Mq.A00) {
                C48972Mq.A00(c48972Mq);
            }
        }
    }
}
