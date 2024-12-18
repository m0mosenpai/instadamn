package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.OOt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54878OOt {
    public static final String A00(String str, List list) {
        C46h c46h;
        C14360o3.A0B(list, 0);
        AbstractC58576Pxu A00 = AbstractC58576Pxu.A00(list);
        C50361MLn c50361MLn = new C50361MLn(str, 24);
        Iterator it = ((Iterable) A00.A00.A05(A00)).iterator();
        it.getClass();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (AbstractC166987dD.A1a(c50361MLn.invoke(next))) {
                    next.getClass();
                    c46h = new C4JL(next);
                    break;
                }
            } else {
                c46h = C4JK.A00;
                break;
            }
        }
        return (String) c46h.A02(new C64285T7u(4, C57635Phl.A00)).A04();
    }

    public static final String A01(String str, List list) {
        C46h c46h;
        AbstractC58576Pxu A00 = AbstractC58576Pxu.A00(list);
        C50361MLn c50361MLn = new C50361MLn(str, 25);
        Iterator it = ((Iterable) A00.A00.A05(A00)).iterator();
        it.getClass();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (AbstractC166987dD.A1a(c50361MLn.invoke(next))) {
                    next.getClass();
                    c46h = new C4JL(next);
                    break;
                }
            } else {
                c46h = C4JK.A00;
                break;
            }
        }
        return (String) c46h.A02(new C64285T7u(4, C57636Phm.A00)).A04();
    }
}
