package X;

import android.os.Process;
import java.util.List;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6TM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TM implements C6TN {
    public final C6TK A00;

    public static C6AY A00(C136336Fm c136336Fm, C6AZ c6az, C6TK c6tk, List list) {
        RunnableFuture runnableFuture;
        C6AV c6av;
        C6AY c6ay;
        synchronized (c6tk) {
            runnableFuture = c6tk.A01;
            c6av = c6tk.A00;
        }
        if (c6av == null) {
            if (runnableFuture != null) {
                AtomicInteger atomicInteger = c6tk.A02;
                if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                    runnableFuture.run();
                }
                c6av = (C6AV) AbstractC79383gk.A00(runnableFuture, atomicInteger.get());
                synchronized (c6tk) {
                    c6tk.A00 = c6av;
                    c6tk.A01 = null;
                }
            } else {
                throw new IllegalStateException("The future task is null but there is no computed result");
            }
        }
        if (c6az != null) {
            c6ay = c6az.A00;
        } else {
            c6ay = null;
        }
        C6AY A00 = C6AW.A00(c136336Fm, c6ay, c6av, C1339162z.A00, list);
        C6AZ c6az2 = new C6AZ(A00, c6av);
        return new C6AY(c6az2.A00.A00, c6az2, A00.A02);
    }

    @Override // X.C6TN
    public final /* bridge */ /* synthetic */ C6AY EKC(C2W2 c2w2, C136336Fm c136336Fm, Object obj, List list) {
        return A00(c136336Fm, (C6AZ) obj, this.A00, list);
    }

    public C6TM(C6TK c6tk) {
        this.A00 = c6tk;
    }
}
