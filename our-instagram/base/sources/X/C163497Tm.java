package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163497Tm implements InterfaceC13050lr {
    public final Map A00 = new HashMap();
    public final java.util.Set A01 = new LinkedHashSet();

    public final List A00(List list) {
        long j;
        Collection collection;
        C910143t c910143t;
        Long l;
        long j2;
        C910143t c910143t2;
        Long l2;
        C910143t c910143t3;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C160787Im c160787Im = (C160787Im) obj;
                if (c160787Im.getType() == 91 || c160787Im.getType() == 105) {
                    C83403nh c83403nh = c160787Im.A0e;
                    C14360o3.A07(c83403nh);
                    ImmutableList A0H = c83403nh.A0H();
                    if (A0H != null && (c910143t3 = (C910143t) AbstractC001800i.A0O(A0H, 0)) != null && c910143t3.A02 == 10) {
                        arrayList.add(obj);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C83403nh c83403nh2 = ((C160787Im) it.next()).A0e;
                C14360o3.A07(c83403nh2);
                ImmutableList A0H2 = c83403nh2.A0H();
                if (A0H2 != null && (c910143t2 = (C910143t) AbstractC001800i.A0J(A0H2)) != null && (l2 = c910143t2.A0o) != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = -1;
                }
                String A0h = c83403nh2.A0h();
                if (A0h != null && j2 != -1) {
                    Long valueOf = Long.valueOf(j2);
                    Map map = this.A00;
                    if (map.containsKey(valueOf)) {
                        java.util.Set set = (java.util.Set) map.get(valueOf);
                        if (set != null) {
                            set.add(A0h);
                        }
                    } else {
                        map.put(valueOf, AbstractC16830sb.A06(A0h));
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                C160787Im c160787Im2 = (C160787Im) obj2;
                if (c160787Im2.getType() == 91 && c160787Im2.A0e.A1U()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C83403nh c83403nh3 = ((C160787Im) it2.next()).A0e;
                C14360o3.A07(c83403nh3);
                ImmutableList A0H3 = c83403nh3.A0H();
                if (A0H3 != null && (c910143t = (C910143t) AbstractC001800i.A0J(A0H3)) != null && (l = c910143t.A0o) != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                if (c83403nh3.A0h() != null && j != -1 && (collection = (Collection) this.A00.get(Long.valueOf(j))) != null) {
                    this.A01.addAll(collection);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (!AbstractC001800i.A0u(this.A01, ((C160787Im) obj3).A0e.A0h())) {
                    arrayList3.add(obj3);
                }
            }
            return arrayList3;
        }
        return null;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00.clear();
        this.A01.clear();
    }
}
