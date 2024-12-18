package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U4N {
    public static final U4N A00 = new Object();

    public static final void A01(InterfaceC72008XEw interfaceC72008XEw, Object obj, String str) {
        C14360o3.A0B(obj, 2);
        if (obj instanceof Number) {
            interfaceC72008XEw.CnS(str, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            interfaceC72008XEw.CnU(str, ((Boolean) obj).booleanValue());
        } else {
            interfaceC72008XEw.CnT(str, obj.toString());
        }
    }

    public static final void A03(Long l, String str, String str2, Map map, int i) {
        C14360o3.A0B(map, 3);
        InterfaceC72008XEw A002 = A00(str, i);
        if (A002 != null) {
            if (l == null) {
                A002.Cna(str2);
            } else {
                A002.Cnb(str2, l.longValue());
            }
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                entry.getKey();
                entry.getValue();
                A02(A002, map);
            }
        }
    }

    public static final InterfaceC72008XEw A00(String str, int i) {
        InterfaceC72008XEw interfaceC72008XEw;
        if (str != null) {
            int parseInt = Integer.parseInt(str);
            C103284l3 A002 = C103284l3.A05.A00();
            long j = (parseInt & 4294967295L) | ((i << 32) & (-4294967296L));
            synchronized (A002) {
                interfaceC72008XEw = (InterfaceC72008XEw) A002.A00.get(j);
            }
            return interfaceC72008XEw;
        }
        return null;
    }

    public static final void A02(InterfaceC72008XEw interfaceC72008XEw, Map map) {
        String obj;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (!(key instanceof Number) || key == null || (obj = key.toString()) == null) {
                    obj = key.toString();
                }
                A01(interfaceC72008XEw, value, obj);
            }
        }
    }
}
