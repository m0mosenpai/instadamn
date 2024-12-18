package X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SMp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62701SMp {
    public final Context A05;
    public final RealtimeSinceBootClock A06;
    public volatile String A07;
    public final AtomicLong A04 = new AtomicLong();
    public final AtomicLong A03 = new AtomicLong();
    public final AtomicLong A00 = new AtomicLong();
    public final AtomicLong A01 = new AtomicLong();
    public final AtomicLong A02 = new AtomicLong();

    public final SHV A00(boolean z) {
        String str = this.A07;
        long j = this.A03.get() - this.A04.get();
        AtomicLong atomicLong = this.A01;
        long j2 = atomicLong.get();
        AtomicLong atomicLong2 = this.A00;
        SHV shv = new SHV(str, j, j2 - atomicLong2.get(), atomicLong.get() - this.A02.get());
        if (z) {
            atomicLong2.set(0L);
            atomicLong.set(0L);
        }
        return shv;
    }

    public C62701SMp(Context context, RealtimeSinceBootClock realtimeSinceBootClock) {
        this.A05 = context;
        this.A06 = realtimeSinceBootClock;
    }
}
