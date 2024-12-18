package X;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.0np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14250np {
    public static C14250np A01;
    public final ScheduledThreadPoolExecutor A00 = new ScheduledThreadPoolExecutor(3);

    public static synchronized C14250np A00() {
        C14250np c14250np;
        synchronized (C14250np.class) {
            c14250np = A01;
            if (c14250np == null) {
                c14250np = new C14250np();
                A01 = c14250np;
            }
        }
        return c14250np;
    }
}
