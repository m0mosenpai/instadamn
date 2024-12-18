package X;

import android.system.Os;
import android.system.OsConstants;

/* renamed from: X.0C1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0C1 {
    public static final long A00;

    static {
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        A00 = sysconf > 0 ? sysconf : 100L;
    }
}
