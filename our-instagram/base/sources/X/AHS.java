package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

/* loaded from: classes4.dex */
public abstract class AHS {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, java.lang.Object] */
    public static MediaTransformation A00(C198988qy c198988qy) {
        C203428yz c203428yz;
        if (c198988qy == null || !c198988qy.A00 || (c203428yz = (C203428yz) c198988qy.A00()) == null) {
            return null;
        }
        TransformMatrixParams transformMatrixParams = c203428yz.A00;
        float f = transformMatrixParams.A02;
        float f2 = transformMatrixParams.A03;
        float f3 = transformMatrixParams.A01;
        float f4 = transformMatrixParams.A00;
        ?? obj = new Object();
        obj.A01 = f;
        obj.A02 = f2;
        obj.A03 = f3;
        obj.A00 = f4;
        return obj;
    }

    public static final boolean A02(C8r2 c8r2) {
        TransformMatrixConfig transformMatrixConfig = c8r2.A01;
        if (transformMatrixConfig != null) {
            return AbstractC199778sT.A00(transformMatrixConfig.C6v(), true);
        }
        return false;
    }

    public static final boolean A01(C198998qz c198998qz) {
        TransformMatrixConfig transformMatrixConfig = c198998qz.A03;
        if (transformMatrixConfig != null) {
            return AbstractC199778sT.A00(transformMatrixConfig.C6v(), true);
        }
        return false;
    }
}
