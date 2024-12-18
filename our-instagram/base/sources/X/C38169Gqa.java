package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Gqa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38169Gqa implements InterfaceC13000lm {
    public final Map A00;
    public final ConcurrentMap A01;
    public final ConcurrentMap A02;

    public final void A00() {
        this.A02.clear();
        this.A01.clear();
        Map map = this.A00;
        synchronized (map) {
            map.clear();
        }
    }

    public final void A01(String str, String str2, String str3, List list) {
        if (str2 != null) {
            this.A02.put(str, str2);
        }
        if (str3 != null) {
            this.A01.put(str, str3);
        }
        if (!list.isEmpty()) {
            Map map = this.A00;
            synchronized (map) {
                if (map.containsKey(str)) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Collection collection = (List) map.get(str);
                    if (collection == null) {
                        collection = C16930sl.A00;
                    }
                    A1E.addAll(collection);
                    A1E.addAll(list);
                    map.put(str, A1E);
                } else {
                    map.put(str, list);
                }
            }
        }
    }

    public C38169Gqa() {
        C18B c18b = new C18B();
        c18b.A03(64);
        this.A02 = c18b.A00();
        C18B c18b2 = new C18B();
        c18b2.A03(64);
        this.A01 = c18b2.A00();
        C18B c18b3 = new C18B();
        c18b3.A03(64);
        this.A00 = c18b3.A00();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A00();
    }
}
