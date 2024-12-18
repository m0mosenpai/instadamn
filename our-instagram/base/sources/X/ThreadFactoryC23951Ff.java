package X;

import android.os.Process;
import com.facebook.systrace.Systrace;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC23951Ff implements ThreadFactory {
    public final int A00;
    public final AtomicInteger A01 = new AtomicInteger(1);

    public ThreadFactoryC23951Ff(int i) {
        this.A00 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        AbstractC23961Fh abstractC23961Fh = AbstractC23961Fh.$redex_init_class;
        Runnable runnable2 = new Runnable() { // from class: X.1Fi
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC09740es abstractC09740es = AbstractC09740es.$redex_init_class;
                if ((64 & C0ev.A02) != 0) {
                    Systrace.A01(Process.myTid(), "thread_name", Thread.currentThread().getName());
                }
                try {
                    Process.setThreadPriority(ThreadFactoryC23951Ff.this.A00);
                } catch (Throwable unused) {
                }
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        String A0O = AnonymousClass001.A0O("MNSEventLoop", this.A01.getAndIncrement());
        C14360o3.A0B(A0O, 2);
        return new Thread(runnable2, A0O);
    }
}
