package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192008ew extends AbstractC192018ex {
    public final C191998ev A02;
    public final C192028ey A03;
    public final String A04;
    public final C0JO A01 = AwakeTimeSinceBootClock.INSTANCE;
    public final AtomicReference A06 = new AtomicReference();
    public final AtomicReference A05 = new AtomicReference();
    public long A00 = -1;

    public C192008ew(C191998ev c191998ev) {
        C192028ey c192028ey;
        this.A02 = c191998ev;
        this.A04 = c191998ev.A06;
        AbstractC12990ll abstractC12990ll = c191998ev.A04;
        if (abstractC12990ll == null) {
            c192028ey = null;
        } else {
            c192028ey = (C192028ey) abstractC12990ll.A01(C192028ey.class, C192038ez.A00);
        }
        this.A03 = c192028ey;
    }
}
