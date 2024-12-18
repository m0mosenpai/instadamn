package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2FA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FA {
    public static final C2FA A04 = new C2FA();
    public final AtomicLong A03 = new AtomicLong(-1);
    public final AtomicLong A02 = new AtomicLong(-1);
    public final C0JO A01 = AwakeTimeSinceBootClock.INSTANCE;
    public String A00 = null;

    public static long A00(C2FA c2fa, long j) {
        long j2 = c2fa.A03.get();
        long j3 = c2fa.A02.get();
        if (j2 > 0) {
            long j4 = j - j2;
            if (j4 >= 0 && j4 <= 2000) {
                return j2;
            }
        }
        if (j3 > 0) {
            long j5 = j - j3;
            if (j5 >= 0 && j5 <= 2000) {
                return j3;
            }
            return -1L;
        }
        return -1L;
    }
}
