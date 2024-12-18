package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3JN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3JN {
    public static final C20730zt A00 = new C20730zt("CLOSED");

    public static final Object A00(InterfaceC16620sF interfaceC16620sF, C13C c13c, long j) {
        while (true) {
            if (c13c.A00 < j || c13c.A03()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C13D.A00;
                Object obj = atomicReferenceFieldUpdater.get(c13c);
                C20730zt c20730zt = A00;
                if (obj == c20730zt) {
                    return c20730zt;
                }
                C13C c13c2 = (C13C) ((C13D) obj);
                if (c13c2 == null) {
                    c13c2 = (C13C) interfaceC16620sF.invoke(Long.valueOf(c13c.A00 + 1), c13c);
                    if (C1E0.A00(c13c, null, c13c2, atomicReferenceFieldUpdater)) {
                        if (c13c.A03()) {
                            c13c.A02();
                        }
                    }
                }
                c13c = c13c2;
            } else {
                return c13c;
            }
        }
    }
}
