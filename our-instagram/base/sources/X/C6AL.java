package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6AL, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6AL {
    public static C102884kP A00(C102884kP c102884kP, C102884kP c102884kP2, Object obj, int i) {
        C102884kP c102884kP3 = c102884kP;
        if (c102884kP != c102884kP2 || !C6AO.A00(C102884kP.A00(c102884kP2, i), obj)) {
            if (c102884kP == c102884kP2) {
                int i2 = c102884kP2.A04;
                c102884kP3 = new C102884kP(c102884kP2.A01, c102884kP2.A02, c102884kP2, c102884kP2, c102884kP2.A0A, i2);
            }
            c102884kP3.A0Q(i, obj);
        }
        return c102884kP3;
    }

    public static C102884kP A01(C102884kP c102884kP, List list, int i) {
        if (list != null) {
            if (i < list.size()) {
                C102884kP c102884kP2 = (C102884kP) list.get(i);
                if (c102884kP2.A04 == c102884kP.A04) {
                    return c102884kP2;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C102884kP c102884kP3 = (C102884kP) it.next();
                if (c102884kP3.A04 == c102884kP.A04) {
                    return c102884kP3;
                }
            }
        }
        return null;
    }

    public static String A02(C102884kP c102884kP) {
        StringBuilder sb = new StringBuilder();
        String A0D = c102884kP.A0D();
        if (A0D != null) {
            sb.append(" id: ");
            sb.append(A0D);
        }
        List list = c102884kP.A0A;
        if (list != null && !list.isEmpty()) {
            sb.append(" keyPath: ");
            sb.append(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                sb.append("/");
                sb.append(list.get(i));
            }
        }
        sb.append(" styleId: ");
        sb.append(c102884kP.A05);
        return sb.toString();
    }
}
