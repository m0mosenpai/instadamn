package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class JX5 {
    public final C13920nI A00;
    public final Map A01 = AbstractC166987dD.A1G();

    public final Object A00(String str, Object obj) {
        L4H l4h;
        Map map = this.A01;
        synchronized (map) {
            l4h = (L4H) map.get(str);
        }
        if (l4h != null) {
            return l4h.A03;
        }
        return obj;
    }

    public final void A01(String str, String str2, boolean z) {
        Map map = this.A01;
        synchronized (map) {
            L4H l4h = (L4H) map.get(str);
            if (l4h != null && l4h.A04.equals(str2)) {
                if (z) {
                    if (!l4h.A01) {
                        l4h.A01 = true;
                        l4h.A00 = System.currentTimeMillis();
                    }
                } else {
                    map.remove(str);
                }
            }
        }
    }

    public JX5(C13920nI c13920nI) {
        this.A00 = c13920nI;
    }
}
