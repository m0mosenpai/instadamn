package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.io.IOException;

/* renamed from: X.55c, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C55c {
    public static final TransformMatrixParams A00(C16L c16l) {
        Integer num = C05F.A00;
        TransformMatrixParams transformMatrixParams = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        if (C14360o3.A0K(c16l.A0q(), "transform_matrix_params")) {
            c16l.A12();
            if (C14360o3.A0K(c16l.A0q(), "force_center_crop_scale")) {
                transformMatrixParams.A04 = c16l.A0d();
                c16l.A12();
                if (C14360o3.A0K(c16l.A0q(), "scale")) {
                    transformMatrixParams.A01 = c16l.A0h();
                    c16l.A12();
                    if (C14360o3.A0K(c16l.A0q(), "rotation")) {
                        transformMatrixParams.A00 = c16l.A0h();
                        c16l.A12();
                        if (C14360o3.A0K(c16l.A0q(), "translationX")) {
                            transformMatrixParams.A02 = c16l.A0h();
                            c16l.A12();
                            if (C14360o3.A0K(c16l.A0q(), "translationY")) {
                                transformMatrixParams.A03 = c16l.A0h();
                                c16l.A12();
                                return transformMatrixParams;
                            }
                            throw new IOException(AnonymousClass001.A0g("Trying to parse ", c16l.A0q(), " as float TransformMatrixParams.translationY"));
                        }
                        throw new IOException(AnonymousClass001.A0g("Trying to parse ", c16l.A0q(), " as float TransformMatrixParams.translationX"));
                    }
                    throw new IOException(AnonymousClass001.A0g("Trying to parse ", c16l.A0q(), " as float TransformMatrixParams.rotation"));
                }
                throw new IOException(AnonymousClass001.A0g("Trying to parse ", c16l.A0q(), " as float TransformMatrixParams.scale"));
            }
            throw new IOException(AnonymousClass001.A0g("Trying to parse ", c16l.A0q(), " as boolean TransformMatrixParams.force_center_crop_scale"));
        }
        throw new IOException(AnonymousClass001.A0g("Trying to parse ", c16l.A0q(), " as TransformMatrixParams"));
    }

    public static final void A01(TransformMatrixParams transformMatrixParams, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0r("transform_matrix_params");
        anonymousClass182.A0d();
        anonymousClass182.A0T("force_center_crop_scale", transformMatrixParams.A04);
        anonymousClass182.A0P("scale", transformMatrixParams.A01);
        anonymousClass182.A0P("rotation", transformMatrixParams.A00);
        anonymousClass182.A0P("translationX", transformMatrixParams.A02);
        anonymousClass182.A0P("translationY", transformMatrixParams.A03);
        anonymousClass182.A0a();
    }
}
