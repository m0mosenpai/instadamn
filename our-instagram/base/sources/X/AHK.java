package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes4.dex */
public final class AHK {
    public static /* synthetic */ ValueMapFilterModel A01(TransformMatrixParams transformMatrixParams, String str, float[] fArr, int i) {
        float[] fArr2;
        TransformMatrixParams transformMatrixParams2 = transformMatrixParams;
        float[] fArr3 = fArr;
        TypedParameterMap typedParameterMap = null;
        if ((i & 2) != 0) {
            fArr3 = AbstractC199498rs.A00();
        }
        if ((i & 4) != 0) {
            fArr2 = AbstractC199498rs.A00();
        } else {
            fArr2 = null;
        }
        boolean A1M = AbstractC167007dF.A1M(i & 8);
        if ((i & 16) != 0) {
            Integer num = C05F.A00;
            transformMatrixParams2 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        }
        if ((i & 32) != 0) {
            typedParameterMap = new TypedParameterMap(AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I());
        }
        AbstractC167027dH.A12(str, fArr3, fArr2);
        AbstractC167017dG.A1S(transformMatrixParams2, typedParameterMap);
        return new ValueMapFilterModel(typedParameterMap, transformMatrixParams2, str, fArr3, fArr2, A1M);
    }
}
