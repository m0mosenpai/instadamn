package X;

import java.util.LinkedHashSet;

/* renamed from: X.0iN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11060iN {
    public static InterfaceC11230ie A00;
    public static final java.util.Set A02 = new LinkedHashSet();
    public static final Object A01 = new Object();

    public static final AbstractC19330xH A00(AbstractC12990ll abstractC12990ll) {
        C11070iO c11070iO;
        C14360o3.A0B(abstractC12990ll, 0);
        InterfaceC11230ie interfaceC11230ie = A00;
        if (interfaceC11230ie == null) {
            synchronized (A01) {
                interfaceC11230ie = A00;
                if (interfaceC11230ie == null) {
                    c11070iO = (C11070iO) abstractC12990ll.A01(C11070iO.class, new C0Q7(abstractC12990ll));
                }
            }
            return c11070iO.A00;
        }
        c11070iO = (C11070iO) abstractC12990ll.A01(C11070iO.class, new C0Q8(interfaceC11230ie, abstractC12990ll));
        return c11070iO.A00;
    }
}
