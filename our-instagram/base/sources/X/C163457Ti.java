package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163457Ti implements InterfaceC13000lm {
    public final java.util.Set A01 = new LinkedHashSet();
    public final Map A00 = new HashMap();

    public final List A00(List list) {
        long j;
        C910143t c910143t;
        Long l;
        long j2;
        C910143t c910143t2;
        Long l2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C160787Im c160787Im = (C160787Im) obj;
                if (c160787Im.getType() == 91 && c160787Im.A0e.A1U()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C83403nh c83403nh = ((C160787Im) it.next()).A0e;
                C14360o3.A07(c83403nh);
                ImmutableList A0H = c83403nh.A0H();
                if (A0H != null && (c910143t2 = (C910143t) AbstractC001800i.A0O(A0H, 0)) != null && (l2 = c910143t2.A0o) != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = -1;
                }
                if (c83403nh.A0h() != null && j2 != -1) {
                    this.A01.add(Long.valueOf(j2));
                }
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((C160787Im) obj2).getType() == 91) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C83403nh c83403nh2 = ((C160787Im) it2.next()).A0e;
                C14360o3.A07(c83403nh2);
                String A0h = c83403nh2.A0h();
                ImmutableList A0H2 = c83403nh2.A0H();
                if (A0H2 != null && (c910143t = (C910143t) AbstractC001800i.A0O(A0H2, 0)) != null && (l = c910143t.A0o) != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                if (A0h != null && j != -1) {
                    java.util.Set set = this.A01;
                    Long valueOf = Long.valueOf(j);
                    if (set.contains(valueOf)) {
                        if (c83403nh2.A0N != null) {
                            Map map = this.A00;
                            String str = (String) map.get(valueOf);
                            if (str != null) {
                                if (c83403nh2.A1o(str)) {
                                    map.put(valueOf, A0h);
                                    linkedHashSet.add(str);
                                }
                            } else {
                                map.put(valueOf, A0h);
                            }
                        }
                        linkedHashSet.add(A0h);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (!AbstractC001800i.A0u(linkedHashSet, ((C160787Im) obj3).A0e.A0h())) {
                    arrayList3.add(obj3);
                }
            }
            return arrayList3;
        }
        return null;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
        this.A00.clear();
    }
}
