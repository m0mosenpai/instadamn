package X;

import android.util.SparseArray;

/* renamed from: X.7xG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179047xG {
    public final SparseArray A00 = new SparseArray();

    public static void A00(C178907x2 c178907x2, InterfaceC1809480w interfaceC1809480w, C179047xG c179047xG, int i) {
        SparseArray sparseArray = c179047xG.A00;
        Object obj = sparseArray.get(i);
        if (obj instanceof InterfaceC179087xK) {
            c178907x2.A04((InterfaceC179087xK) obj);
        }
        if (interfaceC1809480w instanceof InterfaceC179087xK) {
            c178907x2.A03((InterfaceC179087xK) interfaceC1809480w);
        }
        if (interfaceC1809480w == null) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, interfaceC1809480w);
        }
    }
}
