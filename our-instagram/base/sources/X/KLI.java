package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KLI extends AbstractRunnableC14200nk {
    @Override // java.lang.Runnable
    public final void run() {
        Iterator A15 = AbstractC166997dE.A15(AbstractC47902LDw.A00);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            EnumC46183KcL enumC46183KcL = (EnumC46183KcL) A1K.getKey();
            C6VI c6vi = (C6VI) A1K.getValue();
            if (c6vi.A02()) {
                Object A00 = c6vi.A00();
                if (A00 != null) {
                    AbstractC47902LDw.A01.put(enumC46183KcL, A00);
                }
            } else {
                c6vi.A00 = new C48126LSb(enumC46183KcL);
                c6vi.A00();
            }
        }
    }

    public KLI() {
        super(2022716810, 3, false, false);
    }
}
