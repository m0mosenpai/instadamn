package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;

/* renamed from: X.9M3, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9M3 {
    public static final SparseArray A00(SparseArray sparseArray) {
        C14360o3.A0B(sparseArray, 0);
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2.put(sparseArray.keyAt(i), ((FilterModel) sparseArray.valueAt(i)).deepCopy());
        }
        return sparseArray2;
    }
}
