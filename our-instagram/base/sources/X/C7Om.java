package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Om, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Om implements InterfaceC13000lm {
    public final List A00 = new ArrayList();

    public final List A00(String str) {
        Object obj;
        if (str != null) {
            Iterator it = this.A00.iterator();
            loop0: while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (C14360o3.A0K(((C83403nh) ((C09530e4) it2.next()).A00).A0h(), str)) {
                            break loop0;
                        }
                    }
                }
            }
            List list2 = (List) obj;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((C09530e4) it3.next()).A00);
                }
                if (!arrayList.isEmpty()) {
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
                    C14360o3.A0A(copyOf);
                    return copyOf;
                }
            }
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
