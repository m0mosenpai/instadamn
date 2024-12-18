package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J6W extends HashMap<String, List<String>> {
    public final /* synthetic */ C32J A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public J6W(C32J c32j, List list, List list2) {
        this.A00 = c32j;
        this.A02 = list;
        this.A01 = list2;
        put("seen_ad_ids", list);
        put(AbstractC111324zv.A00(4666), list2);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = c32j.A07.A03().iterator();
        while (it.hasNext()) {
            A1E.add(c32j.A03.BF8(((InterfaceC42381xS) it.next()).BUM()));
        }
        put(AbstractC111324zv.A00(4655), A1E);
    }
}
