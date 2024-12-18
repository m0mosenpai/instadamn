package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9yV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226129yV {
    public static C74W parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C74W c74w = new C74W();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c74w.A08 = A0m;
                } else if ("image_url".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c74w.A09 = A0m2;
                } else if ("high_resolution_image_url".equals(A0s)) {
                    c74w.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("progress_bar_width".equals(A0s)) {
                    c74w.A00 = (float) c16l.A0U();
                } else if ("intrinsic_size".equals(A0s)) {
                    c74w.A02 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    c74w.A05 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    c74w.A01 = c16l.A1D();
                } else if ("progress_background_colour".equals(A0s)) {
                    c74w.A03 = c16l.A1D();
                } else if ("progress_foreground_colour".equals(A0s)) {
                    c74w.A04 = c16l.A1D();
                } else if ("is_background_gif_drawable".equals(A0s)) {
                    c74w.A0A = c16l.A0d();
                } else if ("scale_mode".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    if (A1Q.equals("VERTICAL")) {
                        num = C05F.A00;
                    } else if (A1Q.equals("HORIZONTAL")) {
                        num = C05F.A01;
                    } else {
                        throw AbstractC166987dD.A12(A1Q);
                    }
                    C14360o3.A0B(num, 0);
                    c74w.A06 = num;
                } else {
                    continue;
                }
                c16l.A0z();
            }
            return c74w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
