package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2SU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2SU {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final AnonymousClass130 A00() {
        ThreadLocal threadLocal = A00;
        AnonymousClass130 anonymousClass130 = (AnonymousClass130) threadLocal.get();
        if (anonymousClass130 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC214612y.A01;
            final Thread currentThread = Thread.currentThread();
            AbstractC214612y abstractC214612y = new AbstractC214612y(currentThread) { // from class: X.2SV
                public final Thread A00;

                @Override // X.AbstractC214712z
                public final Thread A0B() {
                    return this.A00;
                }

                {
                    this.A00 = currentThread;
                }
            };
            threadLocal.set(abstractC214612y);
            return abstractC214612y;
        }
        return anonymousClass130;
    }
}
