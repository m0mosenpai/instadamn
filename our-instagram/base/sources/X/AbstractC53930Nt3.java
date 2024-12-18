package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.Nt3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53930Nt3 {
    public static final ValueMapFilterModel A00() {
        ValueMapFilterModel A01;
        Integer num = C05F.A01;
        A01 = AHK.A01(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "basic_adjust", null, 46);
        A01.A00("strength", 1.0f);
        A01.A00("brightness", 0.0f);
        A01.A00("contrast", 0.0f);
        A01.A00("saturation", 0.0f);
        A01.A00("temperature", 0.0f);
        A01.A00("fade", 0.0f);
        A01.A00("vignette", 0.0f);
        A01.A00("highlights", 0.0f);
        A01.A00("shadows", 0.0f);
        A01.A00("sharpen", 0.0f);
        A01.A00("tint_shadows_intensity", 0.0f);
        A01.A03("tint_shadows_color", AbstractC54358O0q.A01);
        A01.A00("tint_shadows_intensity", 0.0f);
        A01.A00("tint_highlights_color", 0.0f);
        A01.A03("tint_highlights_color", AbstractC54358O0q.A00);
        A01.A00("tint_highlights_intensity", 0.0f);
        A01.A00("tint_highlights_intensity", 0.5f);
        A01.A00("tint_shadows_intensity", 0.5f);
        return A01;
    }
}
