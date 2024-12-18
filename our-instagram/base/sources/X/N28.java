package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class N28 extends AbstractC95374Qx {
    @Override // X.AbstractC95374Qx
    public final long A00() {
        return TimeUnit.MILLISECONDS.toNanos(RealtimeSinceBootClock.A00.now());
    }
}
