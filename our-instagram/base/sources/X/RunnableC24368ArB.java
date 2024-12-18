package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.ArB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24368ArB implements Runnable {
    public final /* synthetic */ C8JN A00;

    public RunnableC24368ArB(C8JN c8jn) {
        this.A00 = c8jn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8JN c8jn = this.A00;
        C8HI c8hi = c8jn.A09;
        c8hi.A0Q();
        C208509Kk c208509Kk = C208509Kk.A00;
        if (!c8hi.A0Y()) {
            C8GH A00 = c8hi.A0z.A00();
            C1811881u A09 = A00.A03.A09(c208509Kk);
            LinkedHashSet A002 = A09.A00();
            List list = (List) AbstractC190348bs.A00.get(c208509Kk);
            if (list == null) {
                list = C16930sl.A00;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A002.remove(it.next());
            }
            java.util.Set set = A09.A01;
            set.clear();
            set.addAll(A002);
            C8GJ c8gj = A00.A00;
            if (c8gj != null) {
                Pair pair = new Pair(c208509Kk, A09);
                C8GR c8gr = (C8GR) c8gj.A0D.get(pair.first);
                if (c8gr != null) {
                    Object obj = pair.second;
                    C14360o3.A06(obj);
                    c8gr.A08((C1811881u) obj);
                }
            }
        }
        AnonymousClass835.A00(c8hi);
        c8jn.A0A.A00().CIw();
        C8FG c8fg = c8jn.A0B;
        if (c8fg != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.APS();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
