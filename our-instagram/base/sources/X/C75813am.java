package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75813am {
    public static final void A00(C2W1 c2w1, C75813am c75813am, Exception exc, String str) {
        Iterator it = c2w1.A0u.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2Y5 c2y5 = (C2Y5) it.next();
            C2XE c2xe = c2y5.A04;
            if (C14360o3.A0K(c2xe.A08(), str)) {
                C51372Xk.A01(c2y5.A03, c2xe, exc);
                break;
            }
        }
        int size = c2w1.A0h.size();
        for (int i = 0; i < size; i++) {
            C2W1 c2w12 = (C2W1) c2w1.A0h.get(i);
            if (AbstractC002300n.A0h(str, ((C2Y5) c2w12.A0u.get(r1.size() - 1)).A04.A08(), false)) {
                A00(c2w12, c75813am, exc, str);
            }
        }
    }

    public static final void A01(C2XO c2xo) {
        Map map = c2xo.A08;
        if (!map.isEmpty()) {
            HashSet hashSet = c2xo.A03;
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!hashSet.contains(next)) {
                    map.remove(next);
                }
            }
        }
    }
}
