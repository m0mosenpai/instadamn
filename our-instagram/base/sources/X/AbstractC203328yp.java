package X;

import android.graphics.Matrix;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.8yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203328yp {
    public static C202278x7 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C202278x7 c202278x7 = new C202278x7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    c202278x7.A08 = c16l.A1D();
                } else if ("uuid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c202278x7.A0C = A1P;
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    c202278x7.A0A = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    c202278x7.A07 = c16l.A1D();
                } else if ("layer".equals(A0q)) {
                    c202278x7.A09 = c16l.A1D();
                } else if ("z".equals(A0q)) {
                    c202278x7.A0B = c16l.A1D();
                } else if ("pivot_x".equals(A0q)) {
                    c202278x7.A03 = (float) c16l.A0U();
                } else if ("pivot_y".equals(A0q)) {
                    c202278x7.A04 = (float) c16l.A0U();
                } else if ("offset_x".equals(A0q)) {
                    c202278x7.A01 = (float) c16l.A0U();
                } else if ("offset_y".equals(A0q)) {
                    c202278x7.A02 = (float) c16l.A0U();
                } else if ("rotation".equals(A0q)) {
                    c202278x7.A05 = (float) c16l.A0U();
                } else if ("scale".equals(A0q)) {
                    c202278x7.A06 = (float) c16l.A0U();
                } else if ("bouncing_scale".equals(A0q)) {
                    c202278x7.A00 = (float) c16l.A0U();
                } else if ("is_outside_suggested_margins".equals(A0q)) {
                    c202278x7.A0D = c16l.A0d();
                }
                c16l.A0z();
            }
            Matrix matrix = c202278x7.A0E;
            float f = c202278x7.A05;
            float f2 = c202278x7.A03;
            float f3 = c202278x7.A04;
            float f4 = c202278x7.A06;
            float f5 = c202278x7.A01;
            float f6 = c202278x7.A02;
            C14360o3.A0B(matrix, 0);
            matrix.reset();
            matrix.preRotate(f, f2, f3);
            matrix.preScale(f4, f4, f2, f3);
            matrix.preTranslate(f5, f6);
            return c202278x7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C202278x7 c202278x7) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c202278x7.A08);
        anonymousClass182.A0S("uuid", c202278x7.A0C);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c202278x7.A0A);
        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c202278x7.A07);
        anonymousClass182.A0Q("layer", c202278x7.A09);
        anonymousClass182.A0Q("z", c202278x7.A0B);
        anonymousClass182.A0P("pivot_x", c202278x7.A03);
        anonymousClass182.A0P("pivot_y", c202278x7.A04);
        anonymousClass182.A0P("offset_x", c202278x7.A01);
        anonymousClass182.A0P("offset_y", c202278x7.A02);
        anonymousClass182.A0P("rotation", c202278x7.A05);
        anonymousClass182.A0P("scale", c202278x7.A06);
        anonymousClass182.A0P("bouncing_scale", c202278x7.A00);
        anonymousClass182.A0T("is_outside_suggested_margins", c202278x7.A0D);
        anonymousClass182.A0a();
    }
}
