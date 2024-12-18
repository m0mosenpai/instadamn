package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142956cv extends AbstractC150996r0 {
    public static final int A02;
    public static final C142986cy A03;
    public static final C142966cw A04;
    public static final ThreadFactoryC142916cr A05;
    public final ThreadFactory A00 = A05;
    public final AtomicReference A01;

    public C142956cv() {
        C142986cy c142986cy = A03;
        this.A01 = new AtomicReference(c142986cy);
        C142986cy c142986cy2 = new C142986cy(A02, this.A00);
        if (!C1EM.A00(c142986cy, c142986cy2, this.A01)) {
            C142966cw[] c142966cwArr = c142986cy2.A02;
            for (C142966cw c142966cw : c142966cwArr) {
                c142966cw.dispose();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6cx, X.6cw] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        A02 = availableProcessors;
        ?? c142976cx = new C142976cx(new ThreadFactoryC142916cr("RxComputationShutdown", 5, false));
        A04 = c142976cx;
        c142976cx.dispose();
        ThreadFactoryC142916cr threadFactoryC142916cr = new ThreadFactoryC142916cr("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        A05 = threadFactoryC142916cr;
        C142986cy c142986cy = new C142986cy(0, threadFactoryC142916cr);
        A03 = c142986cy;
        for (C142966cw c142966cw : c142986cy.A02) {
            c142966cw.dispose();
        }
    }
}
