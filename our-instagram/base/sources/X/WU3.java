package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* loaded from: classes11.dex */
public final class WU3 implements InterfaceC103334l8 {
    @Override // X.InterfaceC103334l8
    public final long now() {
        return AwakeTimeSinceBootClock.INSTANCE.now();
    }
}
