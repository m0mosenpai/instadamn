package X;

import java.util.Iterator;

/* loaded from: classes7.dex */
public final class IL9 {
    public final java.util.Set A00 = AbstractC31171DnF.A0l();

    public final void A00() {
        java.util.Set set = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int A0B = AbstractC167007dF.A0B(it);
            C006802i.A0p.markerPoint(A0B, "USER_NAVIGATION_CANCELLATION");
            C006802i.A0p.markerEnd(A0B, (short) 4);
        }
        set.clear();
    }
}
