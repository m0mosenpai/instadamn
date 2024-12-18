package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;

/* renamed from: X.8sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC199788sU {
    public static void A00(FilterModel filterModel, float[] fArr) {
        float[] contentTransform = filterModel.getContentTransform();
        if (fArr == null) {
            AbstractC06960Yn.A0T(AbstractC199498rs.A01, contentTransform, 16);
        } else {
            AbstractC06960Yn.A0T(fArr, contentTransform, fArr.length);
        }
    }

    public static void A01(FilterModel filterModel, float[] fArr) {
        float[] textureTransform = filterModel.getTextureTransform();
        if (fArr == null) {
            AbstractC06960Yn.A0T(AbstractC199498rs.A01, textureTransform, 16);
        } else {
            AbstractC06960Yn.A0T(fArr, textureTransform, fArr.length);
        }
    }
}
