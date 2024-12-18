package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sbk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63063Sbk {
    public static void A02(SBo sBo, SMG smg, Iterator it, Map map, Map map2) {
        if (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            Object obj = map.get(A1B);
            obj.getClass();
            C62693SMh c62693SMh = new C62693SMh(sBo, smg, A1B, it, map2, map);
            T3Z t3z = sBo.A00;
            InterfaceC65391TjO interfaceC65391TjO = t3z.A00;
            Object obj2 = t3z.A01.get(A1B);
            obj2.getClass();
            interfaceC65391TjO.Elx((C63152Se0) obj2, c62693SMh, (byte[]) obj);
            return;
        }
        smg.A00(null, map2);
    }

    public static T3Z A00(InterfaceC65391TjO interfaceC65391TjO, java.util.Set set) {
        String A0R;
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C63152Se0 c63152Se0 = (C63152Se0) it.next();
            if (c63152Se0.A00 == C05F.A00) {
                A0R = c63152Se0.A05;
            } else {
                A0R = AnonymousClass001.A0R("RSA::", c63152Se0.A05);
            }
            A1G.put(A0R, c63152Se0);
        }
        return new T3Z(interfaceC65391TjO, A1G);
    }

    public static HashSet A01(java.util.Set set) {
        String A0R;
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C63152Se0 c63152Se0 = (C63152Se0) it.next();
            if (c63152Se0.A00 == C05F.A00) {
                A0R = c63152Se0.A05;
            } else {
                A0R = AnonymousClass001.A0R("RSA::", c63152Se0.A05);
            }
            A1H.add(A0R);
        }
        return A1H;
    }
}
