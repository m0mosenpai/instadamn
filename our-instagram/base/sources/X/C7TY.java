package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.7TY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TY extends C7TW implements InterfaceC13000lm {
    public final Map A00;
    public final java.util.Set A01;

    public C7TY() {
        super(91);
        this.A00 = new LinkedHashMap();
        this.A01 = new LinkedHashSet();
    }

    private final void A00(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C160787Im c160787Im = (C160787Im) obj;
                if (c160787Im.getType() == super.A00 && c160787Im.A0e.A1U()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String A0h = ((C160787Im) it.next()).A0e.A0h();
                if (A0h != null) {
                    arrayList2.add(A0h);
                }
            }
            this.A01.addAll(arrayList2);
        }
    }

    @Override // X.C7TW
    public final boolean A02(String str) {
        if (!AbstractC001800i.A0u(this.A01, str) && super.A02(str)) {
            return true;
        }
        return false;
    }

    public final boolean A03(String str) {
        Boolean bool;
        long j = 0;
        for (Map.Entry entry : super.A01.entrySet()) {
            if (C14360o3.A0K(entry.getValue(), str)) {
                j = ((Number) entry.getKey()).longValue();
            }
        }
        if (!A02(str)) {
            return false;
        }
        Map map = this.A00;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf) || (bool = (Boolean) map.get(valueOf)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        super.A01.clear();
        this.A00.clear();
        this.A01.clear();
    }

    @Override // X.C7TW
    public final List A01(List list, List list2) {
        A00(list);
        A00(list2);
        return super.A01(list, list2);
    }
}
