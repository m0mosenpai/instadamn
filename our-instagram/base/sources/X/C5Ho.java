package X;

import java.util.Iterator;

/* renamed from: X.5Ho, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Ho {
    public static void A00(InterfaceC62242sP interfaceC62242sP, Object obj, java.util.Set set) {
        Integer num;
        if (interfaceC62242sP.CdX(obj)) {
            num = C05F.A0C;
        } else if (!interfaceC62242sP.CZK(obj)) {
            return;
        } else {
            num = C05F.A0N;
        }
        A01(num, set);
    }

    public static void A01(Integer num, java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC673031v) it.next()).DM9(num);
        }
    }
}
