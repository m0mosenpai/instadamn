package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes9.dex */
public abstract class OZD {
    public static final ConcurrentMap A00;

    static {
        C18B c18b = new C18B();
        c18b.A03(8);
        A00 = c18b.A00();
    }

    public static final String A00(String str, String str2, String str3) {
        Object[] objArr;
        String str4;
        if (str2 != null) {
            if (str3 != null) {
                objArr = new Object[]{"0", str, RealtimeSubscription.GRAPHQL_MQTT_VERSION, str2, "2", str3};
                str4 = "{\"%s\":\"%s\", \"%s\":\"%s\", \"%s\":\"%s\"}";
            } else {
                objArr = new Object[]{"0", str, RealtimeSubscription.GRAPHQL_MQTT_VERSION, str2};
                str4 = "{\"%s\":\"%s\", \"%s\":\"%s\"}";
            }
        } else {
            objArr = new Object[]{"0", str};
            str4 = "{\"%s\":\"%s\"}";
        }
        return AbstractC13670mt.A06(str4, objArr);
    }

    public static final void A01(C54689ODp c54689ODp) {
        String str = c54689ODp.A02;
        OVX ovx = OVX.A01;
        OLJ A002 = ovx.A00(str);
        if (!c54689ODp.A05 && A002 != null) {
            Iterator it = c54689ODp.A04.iterator();
            while (it.hasNext()) {
                InterfaceC58051Poc interfaceC58051Poc = (InterfaceC58051Poc) MSZ.A0n(it);
                if (interfaceC58051Poc != null) {
                    interfaceC58051Poc.Dpx(A002, true);
                }
            }
            return;
        }
        ovx.A00.remove(str);
        ConcurrentMap concurrentMap = A00;
        if (concurrentMap.containsKey(str)) {
            C54689ODp c54689ODp2 = (C54689ODp) concurrentMap.get(str);
            if (c54689ODp2 != null) {
                c54689ODp2.A04.addAll(c54689ODp.A04);
                return;
            }
            return;
        }
        concurrentMap.put(str, c54689ODp);
        C1ON A0T = AbstractC50522MSa.A0T(c54689ODp.A00, new C907642p(C41311IQh.class, "LeadGenDeepLinkQuery", A00(str, c54689ODp.A03, c54689ODp.A01), true));
        A0T.A00 = new C52236N9z(str, c54689ODp, 3);
        C1GJ.A06(A0T, 236, 3, true, true);
    }
}
