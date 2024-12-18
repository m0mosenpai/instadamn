package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0X4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0X4 {
    public final AwakeTimeSinceBootClock A00;
    public final ReentrantLock A01 = new ReentrantLock();

    public final void A00(C0X2 c0x2) {
        long nowNanos;
        if (c0x2 == null) {
            nowNanos = 0;
        } else {
            nowNanos = this.A00.nowNanos();
        }
        this.A01.lock();
        if (c0x2 != null) {
            c0x2.A0K.addAndGet(this.A00.nowNanos() - nowNanos);
        }
    }

    public final void A01(C0X2 c0x2) {
        long nowNanos;
        if (c0x2 == null) {
            nowNanos = 0;
        } else {
            nowNanos = this.A00.nowNanos();
        }
        this.A01.unlock();
        if (c0x2 != null) {
            c0x2.A0K.addAndGet(this.A00.nowNanos() - nowNanos);
        }
    }

    public C0X4(AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        this.A00 = awakeTimeSinceBootClock;
    }
}
