package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.0ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14160ng extends FutureTask {
    public final AbstractRunnableC14200nk A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14160ng(Runnable runnable, Object obj) {
        super(runnable, obj);
        final int i = 88550195;
        final int i2 = 3;
        final boolean z = false;
        this.A00 = new AbstractRunnableC14200nk(i, i2, z, z) { // from class: X.0vN
            @Override // java.lang.Runnable
            public final void run() {
                C14160ng.this.run();
            }
        };
    }

    public C14160ng(Callable callable, final int i, final int i2, final boolean z, final boolean z2) {
        super(callable);
        this.A00 = new AbstractRunnableC14200nk(i, i2, z, z2) { // from class: X.0vN
            @Override // java.lang.Runnable
            public final void run() {
                C14160ng.this.run();
            }
        };
    }
}
