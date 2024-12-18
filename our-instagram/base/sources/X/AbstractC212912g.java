package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.12g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC212912g {
    public static C213212j A00;
    public static final int A01;
    public static final int A02;
    public static final long A03;
    public static final long A04;
    public static final String A05;
    public static final C12k A06;
    public static final C12k A07;

    static {
        String str = "DefaultDispatcher";
        try {
            String property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
            if (property != null) {
                str = property;
            }
        } catch (SecurityException unused) {
        }
        A05 = str;
        A04 = AbstractC213012h.A00(100000L, "kotlinx.coroutines.scheduler.resolution.ns", Long.MAX_VALUE);
        int i = AbstractC213112i.A00;
        if (i < 2) {
            i = 2;
        }
        A01 = (int) AbstractC213012h.A00(i, "kotlinx.coroutines.scheduler.core.pool.size", 2147483647L);
        A02 = (int) AbstractC213012h.A00(2097150L, "kotlinx.coroutines.scheduler.max.pool.size", 2097150L);
        A03 = TimeUnit.SECONDS.toNanos(AbstractC213012h.A00(60L, "kotlinx.coroutines.scheduler.keep.alive.sec", Long.MAX_VALUE));
        A00 = C213212j.A00;
        A07 = new C12k(0);
        A06 = new C12k(1);
    }
}
