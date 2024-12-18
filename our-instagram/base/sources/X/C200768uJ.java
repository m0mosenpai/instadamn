package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8uJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200768uJ {
    public final List A00(java.util.Set set) {
        C14360o3.A0B(set, 0);
        List list = AbstractC200818uO.A03;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (set.contains(((AbstractC200848uR) obj).A04)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
