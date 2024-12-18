package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0aF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07410aF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Map A04;

    public C07410aF(C07380aC c07380aC) {
        Map map;
        Integer num;
        ArrayList arrayList = c07380aC.A02;
        if (arrayList != null) {
            int i = 5;
            Iterator it = arrayList.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                AbstractC07400aE abstractC07400aE = (AbstractC07400aE) next;
                abstractC07400aE.A00 = i;
                i += abstractC07400aE.A01;
            }
        }
        this.A01 = c07380aC.A00;
        this.A02 = c07380aC.A01;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC07400aE abstractC07400aE2 = (AbstractC07400aE) it2.next();
                arrayList2.add(new C09530e4(abstractC07400aE2.A03, abstractC07400aE2));
            }
            map = AbstractC06930Yk.A08(arrayList2);
        } else {
            map = null;
        }
        this.A04 = map;
        if (map != null) {
            num = Integer.valueOf(map.size());
        } else {
            num = null;
        }
        if (C14360o3.A0K(num, arrayList != null ? Integer.valueOf(arrayList.size()) : null)) {
            Map map2 = this.A04;
            int i2 = 5;
            if (map2 != null) {
                Iterator it3 = map2.entrySet().iterator();
                while (it3.hasNext()) {
                    i2 += ((AbstractC07400aE) ((Map.Entry) it3.next()).getValue()).A01;
                }
            }
            this.A00 = i2;
            this.A03 = c07380aC.hashCode();
            return;
        }
        throw new IllegalArgumentException("Annotations with the same name are not allowed");
    }
}
