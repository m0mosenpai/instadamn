package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LDt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47899LDt {
    public static final Comparator A00;
    public static final Comparator A01;

    public static final List A00(InterfaceC28041Xi interfaceC28041Xi, C189058Yv c189058Yv) {
        C14360o3.A0B(c189058Yv, 0);
        Comparator comparator = A01;
        C14360o3.A0B(comparator, 2);
        ArrayList A04 = c189058Yv.A04();
        ArrayList A05 = c189058Yv.A05();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC28041Xi.apply(next)) {
                A1E.add(next);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = A05.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (interfaceC28041Xi.apply(next2)) {
                A1E2.add(next2);
            }
        }
        return AbstractC001800i.A0g(AbstractC001800i.A0S(A1E2, A1E), comparator);
    }

    static {
        Integer A0o = AbstractC25227BEk.A0o();
        A01 = new M7Y(AbstractC16960so.A1Q(A0o, -2, -3, -10, -4, -6, -7, -8, -5, -9));
        A00 = new M7Y(AbstractC16960so.A1Q(A0o, -2, -3, -4, -9, -10, -5, -6, -7, -8));
    }
}
