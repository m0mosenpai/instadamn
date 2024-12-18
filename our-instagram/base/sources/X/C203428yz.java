package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.8yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203428yz {
    public TransformMatrixParams A00;

    public C203428yz(TransformMatrixParams transformMatrixParams) {
        C14360o3.A0B(transformMatrixParams, 1);
        Integer num = C05F.A00;
        this.A00 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        this.A00 = new TransformMatrixParams(transformMatrixParams);
    }

    public C203428yz() {
        Integer num = C05F.A00;
        this.A00 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
    }
}
