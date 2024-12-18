package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199768sS {
    public static final void A01(FilterChain filterChain, TransformMatrixParams transformMatrixParams, float[] fArr) {
        C14360o3.A0B(fArr, 1);
        C14360o3.A0B(transformMatrixParams, 2);
        Integer A00 = A00(filterChain);
        if (A00 != null) {
            FilterModel filterModel = (FilterModel) filterChain.A01.get(A00.intValue());
            if (filterModel != null) {
                AbstractC199788sU.A01(filterModel, fArr);
                filterChain.A03.A00(transformMatrixParams);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02(FilterChain filterChain, float[] fArr) {
        String str;
        C14360o3.A0B(fArr, 1);
        SparseArray sparseArray = filterChain.A01;
        FilterModel filterModel = (FilterModel) sparseArray.get(17);
        if (filterModel != null) {
            FilterModel filterModel2 = (FilterModel) sparseArray.get(8);
            if (filterModel2 != null) {
                str = filterModel2.getFilterName();
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, "gradient_transform")) {
                boolean A00 = AbstractC199778sT.A00(fArr, true);
                FilterModel filterModel3 = (FilterModel) sparseArray.get(8);
                if (filterModel3 != null) {
                    filterModel3.setEnabled(A00);
                }
                AbstractC199788sU.A01(filterModel2, fArr);
                if (A00) {
                    fArr = AbstractC199498rs.A01;
                }
            }
            AbstractC199788sU.A01(filterModel, fArr);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A03(float[] fArr, float[] fArr2) {
        C14360o3.A0B(fArr2, 1);
        int min = Math.min(fArr.length, 16);
        ArrayList arrayList = new ArrayList(min);
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= min) {
                break;
            }
            float f = fArr[i];
            if (Math.abs(f - fArr2[i]) <= Math.abs(f * 0.01f)) {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
            i++;
        }
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Integer A00(FilterChain filterChain) {
        String str;
        SparseArray sparseArray = filterChain.A01;
        FilterModel filterModel = (FilterModel) sparseArray.get(8);
        FilterModel filterModel2 = (FilterModel) sparseArray.get(17);
        if (filterModel != null) {
            str = filterModel.getFilterName();
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, "gradient_transform") && filterModel.isEnabled()) {
            return 8;
        }
        if (filterModel2 == null || !filterModel2.isEnabled()) {
            return null;
        }
        return 17;
    }
}
