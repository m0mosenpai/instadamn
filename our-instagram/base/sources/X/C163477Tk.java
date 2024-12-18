package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.7Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163477Tk implements InterfaceC13000lm {
    public final HashMap A00 = new HashMap();
    public final java.util.Set A01 = new LinkedHashSet();

    public final List A00(List list) {
        long j;
        C910143t c910143t;
        Long l;
        C910143t c910143t2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C160787Im c160787Im = (C160787Im) obj;
                if (c160787Im.getType() == 91) {
                    C83403nh c83403nh = c160787Im.A0e;
                    C14360o3.A07(c83403nh);
                    ImmutableList A0H = c83403nh.A0H();
                    if (A0H != null && (c910143t2 = (C910143t) AbstractC001800i.A0O(A0H, 0)) != null && c910143t2.A0p != null && !c83403nh.A1U()) {
                        arrayList.add(obj);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C83403nh c83403nh2 = ((C160787Im) it.next()).A0e;
                C14360o3.A07(c83403nh2);
                ImmutableList A0H2 = c83403nh2.A0H();
                if (A0H2 != null && (c910143t = (C910143t) AbstractC001800i.A0O(A0H2, 0)) != null && (l = c910143t.A0o) != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                String A0h = c83403nh2.A0h();
                if (j != -1 && A0h != null) {
                    HashMap hashMap = this.A00;
                    Long valueOf = Long.valueOf(j);
                    String str = (String) hashMap.get(valueOf);
                    if (str != null) {
                        if (c83403nh2.A1o(str)) {
                            hashMap.put(valueOf, A0h);
                            java.util.Set set = this.A01;
                            set.add(str);
                            set.remove(A0h);
                        } else if (!C14360o3.A0K(hashMap.get(valueOf), A0h)) {
                            this.A01.add(A0h);
                        }
                    } else {
                        hashMap.put(valueOf, A0h);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!AbstractC001800i.A0u(this.A01, ((C160787Im) obj2).A0e.A0h())) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        return null;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }
}
