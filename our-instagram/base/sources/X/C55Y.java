package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.IOException;

/* renamed from: X.55Y, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C55Y {
    public static TransformMatrixConfig parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            TransformMatrixConfig transformMatrixConfig = new TransformMatrixConfig();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("mp_input_width".equals(A0q)) {
                    transformMatrixConfig.A05 = c16l.A1D();
                } else if ("mp_input_height".equals(A0q)) {
                    transformMatrixConfig.A03 = c16l.A1D();
                } else if ("mp_input_orientation".equals(A0q)) {
                    transformMatrixConfig.A04 = c16l.A1D();
                } else if ("is_ig_media_pipeline_orientation_normalized".equals(A0q)) {
                    transformMatrixConfig.A0C = c16l.A0d();
                } else if ("output_width".equals(A0q)) {
                    transformMatrixConfig.A07 = c16l.A1D();
                } else if ("output_height".equals(A0q)) {
                    transformMatrixConfig.A06 = c16l.A1D();
                } else if ("is_front_facing_camera".equals(A0q)) {
                    transformMatrixConfig.A0A = c16l.A0d();
                } else if ("should_mirror_if_front_facing_camera".equals(A0q)) {
                    transformMatrixConfig.A0F = c16l.A0d();
                } else if ("is_used_in_iglu_filters".equals(A0q)) {
                    transformMatrixConfig.A0D = c16l.A0d();
                } else if ("use_inverted_texture_coordinates".equals(A0q)) {
                    transformMatrixConfig.A0G = c16l.A0d();
                } else if ("tag".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    transformMatrixConfig.A09 = A1P;
                } else if ("should_flip_texture".equals(A0q)) {
                    transformMatrixConfig.A0E = c16l.A0d();
                } else if ("transform_matrix_params".equals(A0q)) {
                    TransformMatrixParams A00 = C55c.A00(c16l);
                    if (!transformMatrixConfig.A0B) {
                        transformMatrixConfig.A08 = A00;
                        transformMatrixConfig.A0B = true;
                    } else {
                        throw new IllegalAccessException("Cannot reassign TransformMatrixConfig's TransformMatrixParams instance after JSON parser assignment");
                    }
                } else {
                    continue;
                }
                c16l.A0z();
            }
            transformMatrixConfig.A01();
            return transformMatrixConfig;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, TransformMatrixConfig transformMatrixConfig) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("mp_input_width", transformMatrixConfig.A05);
        anonymousClass182.A0Q("mp_input_height", transformMatrixConfig.A03);
        anonymousClass182.A0Q("mp_input_orientation", transformMatrixConfig.A04);
        anonymousClass182.A0T("is_ig_media_pipeline_orientation_normalized", transformMatrixConfig.A0C);
        anonymousClass182.A0Q("output_width", transformMatrixConfig.A07);
        anonymousClass182.A0Q("output_height", transformMatrixConfig.A06);
        anonymousClass182.A0T("is_front_facing_camera", transformMatrixConfig.A0A);
        anonymousClass182.A0T("should_mirror_if_front_facing_camera", transformMatrixConfig.A0F);
        anonymousClass182.A0T("is_used_in_iglu_filters", transformMatrixConfig.A0D);
        anonymousClass182.A0T("use_inverted_texture_coordinates", transformMatrixConfig.A0G);
        String str = transformMatrixConfig.A09;
        if (str != null) {
            anonymousClass182.A0S("tag", str);
        }
        anonymousClass182.A0T("should_flip_texture", transformMatrixConfig.A0E);
        C55c.A01(transformMatrixConfig.A08, anonymousClass182);
        anonymousClass182.A0a();
    }
}
