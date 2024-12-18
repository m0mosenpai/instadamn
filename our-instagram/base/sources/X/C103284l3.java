package X;

import android.util.LongSparseArray;
import android.util.SparseIntArray;

/* renamed from: X.4l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103284l3 {
    public static C103284l3 A04;
    public static final C103294l4 A05 = new Object();
    public final LongSparseArray A00 = new LongSparseArray();
    public final LongSparseArray A01 = new LongSparseArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final C012504o A03 = new C012504o(0);

    public final synchronized void A00(InterfaceC72008XEw interfaceC72008XEw) {
        int markerId = interfaceC72008XEw.getMarkerId();
        LongSparseArray longSparseArray = this.A01;
        long j = markerId;
        InterfaceC72008XEw interfaceC72008XEw2 = (InterfaceC72008XEw) longSparseArray.get(j);
        if (interfaceC72008XEw2 != null) {
            interfaceC72008XEw.CnU("ttrc_marker_overlap", true);
            interfaceC72008XEw2.CnU("ttrc_marker_overlap", true);
        }
        this.A00.put(interfaceC72008XEw.CBF(), interfaceC72008XEw);
        longSparseArray.put(j, interfaceC72008XEw);
        SparseIntArray sparseIntArray = this.A02;
        sparseIntArray.put(markerId, sparseIntArray.get(markerId, 0) + 1);
        this.A03.add(Integer.valueOf(markerId));
    }

    public final synchronized void A01(InterfaceC72008XEw interfaceC72008XEw) {
        int markerId = interfaceC72008XEw.getMarkerId();
        this.A01.remove(markerId);
        this.A00.remove(interfaceC72008XEw.CBF());
        SparseIntArray sparseIntArray = this.A02;
        int i = sparseIntArray.get(markerId);
        sparseIntArray.put(markerId, i - 1);
        if (i == 1) {
            this.A03.remove(Integer.valueOf(markerId));
        }
    }
}
