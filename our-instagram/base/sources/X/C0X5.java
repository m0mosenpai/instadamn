package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0X5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0X5 {
    public final AwakeTimeSinceBootClock A00;
    public final ReadWriteLock A01 = new ReentrantReadWriteLock();

    public C0X5(AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        this.A00 = awakeTimeSinceBootClock;
    }
}
