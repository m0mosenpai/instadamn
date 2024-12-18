package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.0M1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M1 {
    public static long A00 = 1;

    public static synchronized long A01() {
        long j;
        synchronized (C0M1.class) {
            j = A00;
            if (j == 1) {
                j = new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
                A00 = j;
            }
        }
        return j;
    }

    public static long A00() {
        return Math.max(0L, new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes());
    }
}
