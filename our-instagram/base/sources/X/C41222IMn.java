package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.IMn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41222IMn {
    public final H6W A00;
    public final C41232IMx A01;
    public final List A02 = AbstractC166987dD.A1E();

    public C41222IMn(H6W h6w) {
        this.A00 = h6w;
        List list = h6w.A09;
        if (list != null && AbstractC166987dD.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A02.add(new C41232IMx((H6V) it.next()));
            }
            List list2 = this.A02;
            ((C41232IMx) list2.get(AbstractC31172DnG.A03(list2, 1))).A02 = true;
        }
        H6V h6v = this.A00.A00;
        if (h6v != null) {
            C41232IMx c41232IMx = new C41232IMx(h6v);
            this.A01 = c41232IMx;
            c41232IMx.A01 = true;
        }
    }

    public final int A00() {
        return this.A02.size() + (AbstractC167007dF.A1W(this.A01) ? 1 : 0);
    }

    public final C41232IMx A01(int i) {
        C41232IMx c41232IMx;
        List list = this.A02;
        if (i == list.size() && (c41232IMx = this.A01) != null) {
            return c41232IMx;
        }
        return (C41232IMx) list.get(i);
    }
}
