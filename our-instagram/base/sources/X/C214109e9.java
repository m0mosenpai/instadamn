package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214109e9 extends AbstractC192018ex {
    public final C22940A9k A02;
    public final C192028ey A03;
    public final String A04;
    public final C0JO A01 = AwakeTimeSinceBootClock.INSTANCE;
    public final AtomicReference A06 = new AtomicReference();
    public final AtomicReference A05 = new AtomicReference();
    public long A00 = -1;

    public C214109e9(C22940A9k c22940A9k) {
        C192028ey c192028ey;
        this.A02 = c22940A9k;
        String str = c22940A9k.A04;
        this.A04 = str;
        AbstractC12990ll abstractC12990ll = c22940A9k.A02;
        if (abstractC12990ll != null && str != null) {
            c192028ey = (C192028ey) abstractC12990ll.A01(C192028ey.class, C192038ez.A00);
        } else {
            c192028ey = null;
        }
        this.A03 = c192028ey;
    }
}
