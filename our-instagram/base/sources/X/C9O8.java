package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

/* renamed from: X.9O8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9O8 {
    public static final C206169Az A00(TransformMatrixConfig transformMatrixConfig, float f) {
        if (transformMatrixConfig != null) {
            TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
            return new C206169Az(2, transformMatrixParams.A01, transformMatrixParams.A00, transformMatrixParams.A02 * f, transformMatrixParams.A03 * f);
        }
        return new C206169Az(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
    }
}
