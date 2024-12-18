package X;

import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class ISD {
    public static final void A00(C006802i c006802i, java.util.Set set) {
        C14360o3.A0B(set, 1);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int A0B = AbstractC167007dF.A0B(it);
            c006802i.markerPoint(A0B, "USER_NAVIGATION_CANCELLATION");
            c006802i.markerEnd(A0B, (short) 4);
        }
        if (AbstractC31171DnF.A1b(set)) {
            set.clear();
        }
    }

    public static final void A01(C006802i c006802i, java.util.Set set, int i) {
        C14360o3.A0B(set, 1);
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            c006802i.markerPoint(i, "NETWORK_FAILED");
            c006802i.markerEnd(i, (short) 3);
            set.remove(valueOf);
        }
    }
}
