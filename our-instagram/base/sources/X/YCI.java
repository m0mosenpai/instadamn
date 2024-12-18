package X;

import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class YCI implements YQG {
    public int A00;
    public int A01;
    public C72691XlK A02;
    public final AtomicLong A03 = new AtomicLong(-1);
    public volatile Handler A04;
    public volatile Surface A05;
    public volatile boolean A06;

    public final void A00() {
        if (this.A06) {
            return;
        }
        this.A06 = true;
        Handler handler = this.A04;
        if (handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (handler.postAtFrontOfQueue(new YGP(countDownLatch))) {
                try {
                    countDownLatch.await(2L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public YCI(Surface surface, int i, int i2) {
        this.A05 = surface;
        this.A01 = i;
        this.A00 = i2;
    }
}
