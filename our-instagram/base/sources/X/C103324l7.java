package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.4l7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103324l7 implements InterfaceC103334l8 {
    public static final C103324l7 A00 = new Object();

    @Override // X.InterfaceC103334l8
    public final long now() {
        return AwakeTimeSinceBootClock.INSTANCE.now();
    }
}
