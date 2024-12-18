package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GjQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37751GjQ implements Runnable {
    public final /* synthetic */ C37546Gg2 A00;
    public final /* synthetic */ Integer A01;

    public RunnableC37751GjQ(C37546Gg2 c37546Gg2, Integer num) {
        this.A00 = c37546Gg2;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int A00;
        C37546Gg2 c37546Gg2 = this.A00;
        if (C18U.A06(C06090Tz.A05, c37546Gg2.A09, 36323358761102524L)) {
            AbstractC37552Gg8 abstractC37552Gg8 = c37546Gg2.A0A;
            List A0J = abstractC37552Gg8.A0J();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A0J) {
                if (((C120985dq) obj).A01 == EnumC129395t1.A08) {
                    A1E.add(obj);
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                abstractC37552Gg8.A0U((C120985dq) it.next(), true);
            }
            return;
        }
        Integer num = this.A01;
        if (num != null) {
            A00 = num.intValue();
        } else if (c37546Gg2.A05.A1Y) {
            A00 = 0;
        } else {
            A00 = C37546Gg2.A00(c37546Gg2) - 1;
        }
        AbstractC37552Gg8 abstractC37552Gg82 = c37546Gg2.A0A;
        C120985dq A0F = abstractC37552Gg82.A0F(A00);
        if (A0F.A01 == EnumC129395t1.A08) {
            abstractC37552Gg82.A0U(A0F, true);
        }
    }
}
