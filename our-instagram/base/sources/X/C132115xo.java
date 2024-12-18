package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.5xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132115xo {
    public final InterfaceC132105xl A00;
    public final C4dV A01;
    public final Integer A02;
    public final String A03;
    public final Map A04 = new LinkedHashMap();
    public final java.util.Set A05 = new LinkedHashSet();

    public final void A00(String str, List list, boolean z) {
        String str2;
        C14360o3.A0B(list, 0);
        Map map = this.A04;
        long longValue = ((Number) map.getOrDefault(str, 0L)).longValue();
        if (z) {
            if (longValue == 0) {
                map.put(str, Long.valueOf(System.currentTimeMillis()));
                return;
            }
            return;
        }
        if (longValue <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - longValue;
        int i = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((C9C6) it.next()).A03, str)) {
                if (i == -1) {
                    return;
                }
                if (currentTimeMillis > 250) {
                    InterfaceC132105xl interfaceC132105xl = this.A00;
                    C4dV c4dV = this.A01;
                    String str3 = null;
                    if (c4dV != null) {
                        str2 = c4dV.A06;
                        str3 = c4dV.A07;
                    } else {
                        str2 = null;
                    }
                    int size = list.size();
                    java.util.Set set = this.A05;
                    interfaceC132105xl.CmL(str, str2, str3, AbstractC123875j1.A00(this.A02), this.A03, currentTimeMillis, i, size, set.contains(str));
                    set.add(str);
                }
                map.remove(str);
                return;
            }
            i++;
        }
    }

    public final void A01(C5Hc c5Hc) {
        String str;
        C14360o3.A0B(c5Hc, 0);
        Map map = this.A04;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            if (System.currentTimeMillis() - longValue > 250) {
                int i = 0;
                Iterator it = c5Hc.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C14360o3.A0K(((C9C6) it.next()).A03, str2)) {
                        if (i != -1) {
                            InterfaceC132105xl interfaceC132105xl = this.A00;
                            C4dV c4dV = this.A01;
                            String str3 = null;
                            if (c4dV != null) {
                                str = c4dV.A06;
                                str3 = c4dV.A07;
                            } else {
                                str = null;
                            }
                            int size = c5Hc.size();
                            java.util.Set set = this.A05;
                            interfaceC132105xl.CmL(str2, str, str3, AbstractC123875j1.A00(this.A02), this.A03, longValue, i, size, set.contains(str2));
                            set.add(str2);
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        map.clear();
    }

    public C132115xo(InterfaceC132105xl interfaceC132105xl, C4dV c4dV, Integer num, String str) {
        this.A00 = interfaceC132105xl;
        this.A01 = c4dV;
        this.A02 = num;
        this.A03 = str;
    }
}
