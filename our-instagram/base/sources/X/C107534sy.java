package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107534sy {
    public C107554t0 A00;
    public final C107484st A03;
    public final C107544sz A04 = new C107544sz();
    public final ArrayList A05 = new ArrayList();
    public boolean A02 = false;
    public boolean A01 = false;

    public final void A00() {
        Object obj;
        if (this.A02) {
            this.A02 = false;
            this.A03.A01(this);
            C107544sz c107544sz = this.A04;
            int i = 0;
            while (true) {
                ArrayList arrayList = c107544sz.A00;
                if (i < arrayList.size()) {
                    AbstractC107574t2 abstractC107574t2 = (AbstractC107574t2) arrayList.get(i);
                    AbstractC107574t2 abstractC107574t22 = (AbstractC107574t2) c107544sz.A02.get(i);
                    String str = (String) c107544sz.A01.get(i);
                    Map map = abstractC107574t22.A03;
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get(str);
                    }
                    if (obj == abstractC107574t2) {
                        C107544sz.A00(abstractC107574t2, abstractC107574t22, str);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A01(AbstractC107574t2 abstractC107574t2, AbstractC107574t2 abstractC107574t22, String str) {
        if (!this.A01) {
            C107544sz c107544sz = this.A04;
            c107544sz.A00.add(abstractC107574t2);
            c107544sz.A02.add(abstractC107574t22);
            c107544sz.A01.add(str);
            ArrayList arrayList = this.A05;
            arrayList.add(abstractC107574t2);
            arrayList.add(abstractC107574t22);
            return;
        }
        throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
    }

    public C107534sy(C107484st c107484st) {
        this.A03 = c107484st;
    }
}
