package X;

import java.util.Map;

/* renamed from: X.Sg8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63252Sg8 {
    public static final Map A00 = AbstractC166987dD.A1G();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized AbstractC63252Sg8 A00(String str) {
        AbstractC63252Sg8 abstractC63252Sg8;
        C58824QBh c58824QBh;
        synchronized (AbstractC63252Sg8.class) {
            Map map = A00;
            AbstractC63252Sg8 abstractC63252Sg82 = (AbstractC63252Sg8) map.get(str);
            abstractC63252Sg8 = abstractC63252Sg82;
            if (abstractC63252Sg82 == null) {
                if ("fbsdk_logged_out_id".equals(str)) {
                    c58824QBh = new Object();
                } else {
                    c58824QBh = new C58824QBh(C019707r.A00(C1L4.A00), new C62405SAe(str));
                }
                map.put(str, c58824QBh);
                abstractC63252Sg8 = c58824QBh;
            }
        }
        return abstractC63252Sg8;
    }

    public static synchronized void A01() {
        synchronized (AbstractC63252Sg8.class) {
            A00.clear();
        }
    }
}
