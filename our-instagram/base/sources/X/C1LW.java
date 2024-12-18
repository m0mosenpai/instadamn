package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: X.1LW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1LW extends AbstractC25001Kd {
    public static final AbstractC25341Lo A00;
    public static final C25051Kj A01 = new C25051Kj(C1LW.class);
    public volatile int remaining;
    public volatile java.util.Set seenExceptions;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Lo] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r0;
        Throwable th = null;
        try {
            final AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(C1LW.class, java.util.Set.class, "seenExceptions");
            final AtomicIntegerFieldUpdater newUpdater2 = AtomicIntegerFieldUpdater.newUpdater(C1LW.class, "remaining");
            r0 = new AbstractC25341Lo(newUpdater2, newUpdater) { // from class: X.1Lm
                public final AtomicIntegerFieldUpdater A00;
                public final AtomicReferenceFieldUpdater A01;

                @Override // X.AbstractC25341Lo
                public final void A01(C1LW state, java.util.Set expect, java.util.Set update) {
                    C1E0.A00(state, null, update, this.A01);
                }

                @Override // X.AbstractC25341Lo
                public final int A00(C1LW state) {
                    return this.A00.decrementAndGet(state);
                }

                {
                    this.A01 = newUpdater;
                    this.A00 = newUpdater2;
                }
            };
        } catch (Throwable th2) {
            th = th2;
            r0 = new Object();
        }
        A00 = r0;
        if (th != null) {
            A01.A00().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
