package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC95374Qx {
    public static final AbstractC95374Qx A00 = new AbstractC95374Qx() { // from class: X.4Qy
    };

    public long A00() {
        if (this instanceof C95364Qw) {
            return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
        }
        return System.nanoTime();
    }
}
