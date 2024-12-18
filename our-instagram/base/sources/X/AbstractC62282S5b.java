package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.S5b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62282S5b {
    public static final Object A00(C5KS c5ks, InterfaceC23621Ds interfaceC23621Ds) {
        if (c5ks.A0E()) {
            Exception A05 = c5ks.A05();
            if (A05 == null) {
                if (!c5ks.A05) {
                    return c5ks.A06();
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Task ");
                A1C.append(c5ks);
                throw new CancellationException(AbstractC166997dE.A0x(" was cancelled normally.", A1C));
            }
            throw A05;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        c5ks.A09(new C64266T6q(c24891Jo, 5), ExecutorC64802TUq.A00);
        return c24891Jo.A0E();
    }
}
