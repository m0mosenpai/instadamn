package X;

import android.util.SparseArray;

/* renamed from: X.3hT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79783hT {
    public static final SparseArray A00(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray != null && sparseArray.size() != 0) {
            if (sparseArray2 != null && sparseArray2.size() != 0) {
                SparseArray sparseArray3 = new SparseArray(sparseArray.size() + sparseArray2.size());
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    sparseArray3.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                }
                int size2 = sparseArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sparseArray3.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
                }
                return sparseArray3;
            }
            return sparseArray;
        }
        if (sparseArray2 == null) {
            return new SparseArray();
        }
        return sparseArray2;
    }
}
