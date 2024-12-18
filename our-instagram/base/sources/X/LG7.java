package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes8.dex */
public final class LG7 {
    public List A00;
    public Map A01;
    public final int A02;
    public final EnumC222729sD A03;
    public final InterfaceC16620sF A04;
    public final int A05;

    public LG7(EnumC222729sD enumC222729sD, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        AbstractC167007dF.A1F(enumC222729sD, 1, interfaceC16620sF);
        this.A03 = enumC222729sD;
        this.A05 = i;
        this.A02 = i2;
        this.A04 = interfaceC16620sF;
        this.A00 = C16930sl.A00;
        this.A01 = AbstractC06930Yk.A0E();
    }

    public final List A01() {
        ArrayList A0S = AbstractC001800i.A0S(this.A01.values(), this.A00);
        ArrayList<C47635L1u> A1E = AbstractC166987dD.A1E();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            PriorityQueue priorityQueue = ((C47635L1u) next).A00;
            if (!(priorityQueue instanceof Collection) || !priorityQueue.isEmpty()) {
                Iterator it2 = priorityQueue.iterator();
                while (it2.hasNext()) {
                    if (AbstractC166987dD.A0l(it2).Cff()) {
                        break;
                    }
                }
            }
            if (priorityQueue.size() >= this.A05) {
                A1E.add(next);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        for (C47635L1u c47635L1u : A1E) {
            List A0a = AbstractC001800i.A0a(c47635L1u.A00);
            C09530e4 A00 = AbstractC47039Kqw.A00(A0a);
            String str = c47635L1u.A01;
            String A01 = LL5.A01(A00);
            C16930sl c16930sl = C16930sl.A00;
            A0q.add(new C45089JxJ(this.A03, EnumC46181KcJ.A04, null, null, str, A01, null, A0a, c16930sl, A00));
        }
        return A0q;
    }

    public static final C47635L1u A00(LG7 lg7) {
        Calendar A00 = AbstractC195628l3.A00();
        A00.setTime(AbstractC195798lM.A01(AbstractC195628l3.A00(), new Date()));
        while (A00.get(7) != 7) {
            A00.add(5, -1);
        }
        long timeInMillis = A00.getTimeInMillis();
        A00.add(5, -5);
        return new C47635L1u((String) lg7.A04.invoke(2131974934, null), AbstractC167007dF.A0p(Long.valueOf(A00.getTimeInMillis()), timeInMillis), lg7.A02);
    }
}
