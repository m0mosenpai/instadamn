package X;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2Q9, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2Q9 {
    public static final AnonymousClass058 A02(C1YP c1yp, Callable callable, String[] strArr, boolean z) {
        return new AnonymousClass058(new C9DP(c1yp, callable, (InterfaceC23621Ds) null, strArr, z));
    }

    public static final Object A00(CancellationSignal cancellationSignal, C1YP c1yp, Callable callable, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        C12W A00;
        if (c1yp.isOpenInternal() && c1yp.inTransaction()) {
            return callable.call();
        }
        C46r c46r = (C46r) interfaceC23621Ds.getContext().get(C46r.A02);
        if (c46r == null || (A00 = c46r.A01) == null) {
            if (z) {
                A00 = C46t.A01(c1yp);
            } else {
                A00 = C46t.A00(c1yp);
            }
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        c24891Jo.CPA(new C9F3(21, AbstractC23641Du.A03(C05F.A00, A00, new C9D0(c24891Jo, callable, (InterfaceC23621Ds) null, 1), C2SW.A00), cancellationSignal));
        return c24891Jo.A0E();
    }

    public static final Object A01(C1YP c1yp, Callable callable, InterfaceC23621Ds interfaceC23621Ds) {
        C12W A01;
        if (c1yp.isOpenInternal() && c1yp.inTransaction()) {
            return callable.call();
        }
        C46r c46r = (C46r) interfaceC23621Ds.getContext().get(C46r.A02);
        if (c46r == null || (A01 = c46r.A01) == null) {
            A01 = C46t.A01(c1yp);
        }
        return AbstractC23641Du.A00(interfaceC23621Ds, A01, new C206629Ct(callable, null, 3));
    }
}
