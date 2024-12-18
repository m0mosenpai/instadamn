package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U6h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66263U6h {
    public static int A00(XAK xak, List list) {
        for (int i = 0; i < list.size(); i++) {
            C102884kP c102884kP = (C102884kP) list.get(i);
            if (c102884kP.A0D() != null && xak.Epy(c102884kP)) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList A02(AnonymousClass630 anonymousClass630, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1338462s c1338462s = (C1338462s) it.next();
            if (!anonymousClass630.A0O) {
                AbstractC79383gk.A02(AbstractC111324zv.A00(1825));
                anonymousClass630.A0H.add(c1338462s);
                AnonymousClass630.A02(anonymousClass630);
            }
            arrayList.add(c1338462s.A02);
        }
        return arrayList;
    }

    public static void A04(AnonymousClass630 anonymousClass630, String str, List list) {
        U5I u5i = new U5I(str);
        Pair pair = new Pair(new C66262U6g(u5i), new C67966V4f(1, list, u5i));
        anonymousClass630.A0G((XAK) pair.first, (AbstractC66258U6c) pair.second);
    }

    public static Pair A01(C102884kP c102884kP, XAK xak) {
        Object obj;
        int i;
        int[] A00 = C1LZ.A00().A03().A00(c102884kP.A05);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                int i3 = A00[i2];
                List A0N = c102884kP.A0N(i3);
                i = A00(xak, A0N);
                if (i >= 0) {
                    obj = new ArrayList(A0N);
                    c102884kP.A0Q(i3, obj);
                    break;
                }
                i2++;
            } else {
                obj = Collections.EMPTY_LIST;
                i = -1;
                break;
            }
        }
        return MSY.A0D(obj, i);
    }

    public static ArrayList A03(C102884kP c102884kP, List list) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        for (int i = 0; i < list.size(); i++) {
            C102884kP c102884kP2 = (C102884kP) list.get(i);
            if (c102884kP2 != null) {
                if (c102884kP2.A05 == 13346) {
                    List A0O = c102884kP2.A0O(32);
                    for (int i2 = 0; i2 < A0O.size(); i2++) {
                        C102884kP c102884kP3 = (C102884kP) A0O.get(i2);
                        A0q.add(C6AU.A00(c102884kP.A01, new C70690WfC(c102884kP.A02, c102884kP3), c102884kP3));
                    }
                } else {
                    A0q.add(C6AU.A00(c102884kP.A01, new C70690WfC(c102884kP.A02, c102884kP2), c102884kP2));
                }
            }
        }
        return A0q;
    }
}
