package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes4.dex */
public abstract class AHL {
    public static final ValueMapFilterModel A00(Integer num, Integer num2, float[] fArr, float[] fArr2, float f, float f2, float f3, boolean z) {
        ValueMapFilterModel A01;
        AbstractC167007dF.A1K(fArr, fArr2);
        AbstractC167007dF.A1I(num, 7, num2);
        A01 = AHK.A01(new TransformMatrixParams(num, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), "gradient_transform", null, 46);
        A01.A03("u_topColor", fArr);
        A01.A03("u_bottomColor", fArr2);
        A01.A02("u_isGainmapEnabled", false);
        A01.A02("u_isInputSamplingDisabled", z);
        A01.A00("u_inputWidth", f);
        A01.A00("u_inputHeight", f2);
        A01.A00("u_cornerRadius", f3);
        return A01;
    }

    public static final ValueMapFilterModel A01(String str) {
        C14360o3.A0B(str, 0);
        float[] fArr = new float[16];
        AbstractC06960Yn.A0T(AbstractC199498rs.A00, fArr, 16);
        Integer num = C05F.A0C;
        ValueMapFilterModel A01 = AHK.A01(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "image_overlay", fArr, 44);
        A01.A02("sticker_only", true);
        A01.A01.A05.put("overlay", str);
        return A01;
    }

    public static final ValueMapFilterModel A02(boolean z) {
        ValueMapFilterModel A01;
        Integer num = C05F.A01;
        A01 = AHK.A01(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), MSV.A00(1161), null, 46);
        A01.A02("is_linearspace", z);
        return A01;
    }
}
