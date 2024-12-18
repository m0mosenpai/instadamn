package X;

import java.util.Queue;

/* loaded from: classes12.dex */
public final class YH4 implements Runnable {
    public final /* synthetic */ C72838XoX A00;
    public final /* synthetic */ C129165sd A01;

    public YH4(C72838XoX c72838XoX, C129165sd c129165sd) {
        this.A00 = c72838XoX;
        this.A01 = c129165sd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72838XoX c72838XoX = this.A00;
        Queue queue = c72838XoX.A08;
        boolean isEmpty = queue.isEmpty();
        C129165sd c129165sd = this.A01;
        queue.add(c129165sd);
        c72838XoX.A01 = c129165sd;
        if (isEmpty) {
            c72838XoX.A07.clear();
            C129235sl c129235sl = new C129235sl(c72838XoX.A03);
            c129235sl.A01();
            c72838XoX.A00 = c129235sl;
            c72838XoX.A02.postDelayed(new YG7(c72838XoX), c72838XoX.A04.A00);
        }
    }
}
