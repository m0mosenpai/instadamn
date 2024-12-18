package X;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC04580Ma implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lacrima_");
        sb.append(this.A01);
        sb.append("_");
        sb.append(this.A02.getAndIncrement());
        C04670Mj c04670Mj = C0L6.A04;
        if (c04670Mj != null) {
            sb.append(":");
            String str = c04670Mj.A04;
            if (str == null) {
                str = "unknown";
            }
            sb.append(str);
        }
        final String obj = sb.toString();
        return new Thread(obj) { // from class: X.0MZ
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    Process.setThreadPriority(ThreadFactoryC04580Ma.this.A00);
                } catch (Throwable th) {
                    C0PC.A00().DEh("ExecutorSetPriority", th, null);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
    }

    public ThreadFactoryC04580Ma(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
