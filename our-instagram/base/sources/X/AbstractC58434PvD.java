package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.PvD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58434PvD {
    public static Object A00(C5KS c5ks) {
        C3U5.A05("Must not be called on the main application thread");
        C3U5.A00();
        C3U5.A03(c5ks, "Task must not be null");
        if (!c5ks.A0E()) {
            C58440PvJ c58440PvJ = new C58440PvJ(null);
            Executor executor = AbstractC58437PvG.A01;
            c5ks.A04(c58440PvJ, executor);
            c5ks.A0B(c58440PvJ, executor);
            c5ks.A08(c58440PvJ, executor);
            c58440PvJ.A00.await();
        }
        if (c5ks.A0F()) {
            return c5ks.A06();
        }
        if (c5ks.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c5ks.A05());
    }

    public static Object A01(C5KS c5ks, TimeUnit timeUnit, long j) {
        C3U5.A05("Must not be called on the main application thread");
        C3U5.A00();
        C3U5.A03(c5ks, "Task must not be null");
        if (!c5ks.A0E()) {
            C58440PvJ c58440PvJ = new C58440PvJ(null);
            Executor executor = AbstractC58437PvG.A01;
            c5ks.A04(c58440PvJ, executor);
            c5ks.A0B(c58440PvJ, executor);
            c5ks.A08(c58440PvJ, executor);
            if (!c58440PvJ.A00.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (c5ks.A0F()) {
            return c5ks.A06();
        }
        if (c5ks.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c5ks.A05());
    }
}
