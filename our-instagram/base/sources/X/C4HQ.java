package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4HQ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4HQ {
    public static final Object A00(final C1YP c1yp, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        C12X c12x;
        final C9DH c9dh = new C9DH(c1yp, interfaceC16660sJ, (InterfaceC23621Ds) null, 5);
        C46r c46r = (C46r) interfaceC23621Ds.getContext().get(C46r.A02);
        if (c46r != null && (c12x = c46r.A01) != null) {
            return AbstractC23641Du.A00(interfaceC23621Ds, c12x, c9dh);
        }
        final C12W context = interfaceC23621Ds.getContext();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        final C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        try {
            c1yp.getTransactionExecutor().execute(new Runnable() { // from class: X.4HR
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C2ST.A00(context.minusKey(C12X.A00), new C9DM(c9dh, c1yp, c24891Jo, null, 5));
                    } catch (Throwable th) {
                        c24891Jo.AGJ(th);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            c24891Jo.AGJ(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        return c24891Jo.A0E();
    }
}
