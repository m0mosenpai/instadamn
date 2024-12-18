package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140046Vi {
    public final SparseArray A00;
    public final C136336Fm A01;
    public final Object A02 = new Object();
    public final List A03;

    public C140046Vi(SparseArray sparseArray, C136336Fm c136336Fm, List list) {
        SparseArray sparseArray2;
        this.A01 = c136336Fm;
        this.A03 = new ArrayList(list);
        if (sparseArray != null && (sparseArray2 = sparseArray.clone()) != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        } else {
            sparseArray2 = new SparseArray();
        }
        this.A00 = sparseArray2;
    }
}
