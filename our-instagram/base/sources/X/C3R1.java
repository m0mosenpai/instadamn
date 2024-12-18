package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.3R1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R1 implements Runnable {
    public C3R0 A00;

    @Override // java.lang.Runnable
    public final void run() {
        C3R0 c3r0 = this.A00;
        if (c3r0 != null) {
            boolean z = AbstractC25011Ke.A02;
            ListenableFuture listenableFuture = c3r0.A00;
            if (listenableFuture != null) {
                this.A00 = null;
                if (listenableFuture.isDone()) {
                    c3r0.A0A(listenableFuture);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = c3r0.A01;
                    c3r0.A01 = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str = AnonymousClass001.A0s("Timed out", " (timeout delayed by ", " ms after scheduled time)", abs);
                            }
                        } catch (Throwable th) {
                            c3r0.setException(new TimeoutException(str));
                            throw th;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(": ");
                    sb.append(listenableFuture);
                    c3r0.setException(new TimeoutException(sb.toString()));
                } finally {
                    listenableFuture.cancel(true);
                }
            }
        }
    }
}
