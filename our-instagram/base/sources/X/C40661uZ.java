package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40661uZ {
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public static final long A00 = TimeUnit.DAYS.toMillis(1);
    public static final long A01 = TimeUnit.HOURS.toMillis(1);

    public static synchronized long A00() {
        long currentTimeMillis;
        synchronized (C40661uZ.class) {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis;
    }
}
