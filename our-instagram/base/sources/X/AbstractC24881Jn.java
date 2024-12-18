package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24881Jn {
    public static final C24891Jo A00(InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        if (!(interfaceC23621Ds instanceof C1E3)) {
            i = 1;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1E3.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(interfaceC23621Ds);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(interfaceC23621Ds, C1E6.A00);
                    break;
                }
                if (obj instanceof C24891Jo) {
                    if (C1E0.A00(interfaceC23621Ds, obj, C1E6.A00, atomicReferenceFieldUpdater)) {
                        C24891Jo c24891Jo = (C24891Jo) obj;
                        if (c24891Jo != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C24891Jo.A04;
                            Object obj2 = atomicReferenceFieldUpdater2.get(c24891Jo);
                            if ((obj2 instanceof C53212c3) && ((C53212c3) obj2).A00 != null) {
                                c24891Jo.A0H();
                            } else {
                                C24891Jo.A02.set(c24891Jo, 536870911);
                                atomicReferenceFieldUpdater2.set(c24891Jo, C24931Ju.A00);
                                return c24891Jo;
                            }
                        }
                    }
                } else if (obj != C1E6.A00 && !(obj instanceof Throwable)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            i = 2;
        }
        return new C24891Jo(i, interfaceC23621Ds);
    }
}
