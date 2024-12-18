package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.Xlb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72703Xlb {
    public final SparseArray A00;
    public final C72861XpN A01;

    public C72703Xlb(SparseArray sparseArray, C72861XpN c72861XpN) {
        this.A01 = c72861XpN;
        SparseBooleanArray sparseBooleanArray = c72861XpN.A00;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int A00 = c72861XpN.A00(i);
            Object obj = sparseArray.get(A00);
            obj.getClass();
            sparseArray2.append(A00, obj);
        }
        this.A00 = sparseArray2;
    }
}
