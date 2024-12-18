package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.17h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC224517h extends AbstractC224617i {
    public static final List A02(InterfaceC224417g interfaceC224417g) {
        C14360o3.A0B(interfaceC224417g, 0);
        Iterator it = interfaceC224417g.iterator();
        if (!it.hasNext()) {
            return C16930sl.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            List singletonList = Collections.singletonList(next);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }

    public static final List A03(InterfaceC224417g interfaceC224417g) {
        C14360o3.A0B(interfaceC224417g, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC224417g.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final C225117n A04(InterfaceC16660sJ interfaceC16660sJ, InterfaceC224417g interfaceC224417g) {
        return new C225117n(interfaceC16660sJ, interfaceC224417g, true);
    }

    public static final C225117n A05(InterfaceC224417g interfaceC224417g) {
        C225217o c225217o = C225217o.A00;
        C14360o3.A0B(c225217o, 1);
        return new C225117n(c225217o, interfaceC224417g, false);
    }

    public static final InterfaceC224417g A06(InterfaceC16660sJ interfaceC16660sJ, InterfaceC224417g interfaceC224417g) {
        C14360o3.A0B(interfaceC224417g, 0);
        return A05(new C225017m(interfaceC16660sJ, interfaceC224417g));
    }

    public static final InterfaceC224417g A07(InterfaceC224417g interfaceC224417g, int i) {
        if (i >= 0) {
            if (i == 0) {
                return D38.A00;
            }
            if (interfaceC224417g instanceof InterfaceC31170DnE) {
                return ((InterfaceC31170DnE) interfaceC224417g).Epr(i);
            }
            return new PV3(interfaceC224417g, i);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Requested element count ", " is less than zero.", i));
    }

    public static final MUL A08(InterfaceC224417g interfaceC224417g) {
        return new MUL(interfaceC224417g);
    }

    public static final C225017m A09(InterfaceC16660sJ interfaceC16660sJ, InterfaceC224417g interfaceC224417g) {
        return new C225017m(interfaceC16660sJ, interfaceC224417g);
    }

    public static final int A00(InterfaceC224417g interfaceC224417g) {
        Iterator it = interfaceC224417g.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC16960so.A1T();
                throw C00O.createAndThrow();
            }
        }
        return i;
    }

    public static final Object A01(InterfaceC224417g interfaceC224417g) {
        Iterator it = interfaceC224417g.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
