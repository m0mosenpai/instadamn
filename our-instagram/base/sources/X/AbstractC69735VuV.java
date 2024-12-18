package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VuV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69735VuV {
    public final Map A00 = new LinkedHashMap();

    public AbstractC69385VmV A00() {
        if (this instanceof V7X) {
            return new AbstractC69385VmV();
        }
        return new AbstractC69385VmV();
    }

    public final AbstractC69385VmV A01(String str) {
        Map map = this.A00;
        Object obj = map.get(str);
        if (obj == null) {
            obj = A00();
            map.put(str, obj);
        }
        return (AbstractC69385VmV) obj;
    }

    public final void A02(Object obj, String str, String str2, String str3, List list, boolean z) {
        AbstractC69385VmV A01 = A01(str);
        A01.A04 = true;
        A01.A00 = str2;
        A01.A01 = str3;
        A01.A03 = list;
        if (z) {
            A01.A06.clear();
            A01.A05.clear();
        }
        List list2 = A01.A06;
        list2.add(obj);
        List list3 = A01.A05;
        list3.add(Boolean.valueOf(z));
        if (list2.size() == list3.size()) {
        } else {
            throw AbstractC31172DnG.A0u();
        }
    }
}
