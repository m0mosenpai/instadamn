package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class OGs {
    public final AtomicReference A00 = new AtomicReference();

    public final Object A00(InterfaceC57899Pm3 interfaceC57899Pm3) {
        AtomicReference atomicReference = this.A00;
        Object obj = atomicReference.get();
        if (obj == null) {
            Object ALN = interfaceC57899Pm3.ALN();
            if (!C1EM.A00(null, ALN, atomicReference)) {
                Object obj2 = atomicReference.get();
                obj2.getClass();
                return obj2;
            }
            return ALN;
        }
        return obj;
    }
}
