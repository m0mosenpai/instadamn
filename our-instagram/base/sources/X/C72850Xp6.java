package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Xp6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72850Xp6 {
    public int A00;
    public int A01;
    public int A02;
    public List A03 = AbstractC166987dD.A1E();

    public final synchronized void A00() {
        C0J8.A09(AbstractC167007dF.A1N(this.A01), "There are allocated frame buffers unaccounted for, we're leaking!");
        List list = this.A03;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C200688uB) it.next()).A01();
        }
        list.clear();
        this.A00 = 0;
        this.A02 = 0;
    }

    public final synchronized void A01(C200688uB c200688uB) {
        if (c200688uB != null) {
            List list = this.A03;
            if (!list.contains(c200688uB)) {
                list.add(c200688uB);
                this.A01--;
            }
        }
    }
}
