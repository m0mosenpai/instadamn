package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class M46 implements Runnable {
    public final /* synthetic */ C48515LdD A00;
    public final /* synthetic */ List A01;

    public M46(C48515LdD c48515LdD, List list) {
        this.A00 = c48515LdD;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48515LdD c48515LdD = this.A00;
        List list = this.A01;
        List list2 = c48515LdD.A02;
        list2.clear();
        list2.addAll(list);
        Iterator it = c48515LdD.A03.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onMagicMediaDraftsUpdated");
        }
        C48515LdD.A00(c48515LdD);
    }
}
