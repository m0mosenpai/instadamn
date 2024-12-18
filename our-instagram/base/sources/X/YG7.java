package X;

import java.util.Queue;

/* loaded from: classes12.dex */
public final class YG7 implements Runnable {
    public final /* synthetic */ C72838XoX A00;

    public YG7(C72838XoX c72838XoX) {
        this.A00 = c72838XoX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Queue queue;
        C72838XoX c72838XoX = this.A00;
        C129235sl c129235sl = c72838XoX.A00;
        if (c129235sl != null) {
            if (c129235sl.A01()) {
                for (C129165sd c129165sd : c72838XoX.A08) {
                    C172117lg c172117lg = c72838XoX.A05;
                    C14360o3.A0A(c129165sd);
                    c172117lg.A01(c129165sd, c129235sl, c72838XoX.A07, (c72838XoX.A06.now() - c129165sd.A05) / 1000.0d, c72838XoX.A04.A04);
                }
                c72838XoX.A00();
                return;
            }
            long now = c72838XoX.A06.now();
            Y0D y0d = c72838XoX.A04;
            long j = now - y0d.A02;
            while (true) {
                queue = c72838XoX.A08;
                if (queue.isEmpty() || ((C129165sd) queue.element()).A05 >= j) {
                    break;
                } else {
                    queue.remove();
                }
            }
            if (!queue.isEmpty()) {
                c72838XoX.A02.postDelayed(new YG7(c72838XoX), y0d.A00);
            }
        }
    }
}
