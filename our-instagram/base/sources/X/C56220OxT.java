package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.OxT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56220OxT implements InterfaceC57931Pmb {
    public final /* synthetic */ C8NF A00;
    public final /* synthetic */ List A01;

    public C56220OxT(C8NF c8nf, List list) {
        this.A01 = list;
        this.A00 = c8nf;
    }

    @Override // X.InterfaceC57931Pmb
    public final void EGi(C54598O9z c54598O9z) {
        List list = this.A01;
        C8NF c8nf = this.A00;
        synchronized (list) {
            MSX.A0u(c54598O9z.A00, list);
            if (list.containsAll(c8nf.A04)) {
                List list2 = c8nf.A06;
                synchronized (list2) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        C09530e4 A17 = AbstractC43592JPx.A17(it);
                        C8NF.A00(c8nf, (InterfaceC16620sF) A17.A01, AbstractC25230BEn.A0F(A17));
                    }
                    list2.clear();
                    c8nf.A01 = true;
                }
            }
        }
    }
}
