package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HDk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38958HDk extends C124275jh {
    public List A00;

    @Override // X.C124275jh, X.InterfaceC124295jj
    public final List AoP() {
        List list = this.A00;
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(new C120985dq(new C37899Glv(EnumC129395t1.A03, ((C38252Grv) it.next()).A01())));
            }
            return A0q;
        }
        C14360o3.A0F("adPreviewMediaItems");
        throw C00O.createAndThrow();
    }

    public final void A01() {
        super.A00();
        ArrayList A1E = AbstractC166987dD.A1E();
        List list = this.A00;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(new C120985dq(new C37899Glv(EnumC129395t1.A03, ((C38252Grv) it.next()).A01())));
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                C111034zF A00 = AbstractC128065qa.A00(AbstractC37300Gc1.A0A(it2));
                if (A00 != null) {
                    A1E2.add(A00);
                }
            }
            this.A0A = A1E2;
            return;
        }
        C14360o3.A0F("adPreviewMediaItems");
        throw C00O.createAndThrow();
    }
}
