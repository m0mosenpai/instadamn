package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LEZ {
    public final long A00;
    public final CountDownLatch A01;
    public final TimeUnit A02;
    public final boolean A03;

    public LEZ(long j, TimeUnit timeUnit) {
        this.A01 = new CountDownLatch(1);
        this.A03 = true;
        this.A00 = j;
        this.A02 = timeUnit;
    }

    public LEZ() {
        this.A01 = new CountDownLatch(1);
        this.A03 = false;
        this.A00 = -1L;
        this.A02 = null;
    }
}
