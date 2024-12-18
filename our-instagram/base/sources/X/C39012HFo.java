package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.HFo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39012HFo extends C1P1 {
    public final /* synthetic */ C1563470e A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public C39012HFo(C1563470e c1563470e, List list, List list2) {
        this.A00 = c1563470e;
        this.A01 = list;
        this.A02 = list2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1986721235);
        C38888HAk c38888HAk = (C38888HAk) obj;
        int A0N = AbstractC167017dG.A0N(c38888HAk, -989444515);
        C1563470e c1563470e = this.A00;
        List list = this.A01;
        List list2 = this.A02;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            String str = (String) obj2;
            List list3 = (List) list2.get(i);
            if (AbstractC166987dD.A1b(list3)) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    ((C41229IMu) it.next()).A00 = EnumC39537Hd9.A02;
                }
                Object obj3 = list3.get(AbstractC25226BEj.A05(list3));
                List A0A = c1563470e.A0A(str);
                int indexOf = A0A.indexOf(obj3);
                if (indexOf != -1) {
                    c1563470e.A0E.put(str, A0A.subList(indexOf + 1, A0A.size()));
                }
            }
            i = i2;
        }
        C1563470e.A03(c1563470e, c38888HAk.A02, c38888HAk.A01);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it2);
            INR A06 = c1563470e.A06(A1B);
            if (A06 != null) {
                c1563470e.A07.D2c(A06, A1B);
            }
        }
        C0f9.A0A(-449338442, A0N);
        C0f9.A0A(-742807515, A03);
    }
}
