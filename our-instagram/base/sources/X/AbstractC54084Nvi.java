package X;

import java.io.IOException;

/* renamed from: X.Nvi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54084Nvi {
    public static C51580MqY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51580MqY c51580MqY = new C51580MqY();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pts_us".equals(A0s)) {
                    c51580MqY.A04 = c16l.A0y();
                } else if ("compare_pts_us".equals(A0s)) {
                    c51580MqY.A03 = c16l.A0y();
                } else if ("frame_index".equals(A0s)) {
                    c51580MqY.A02 = c16l.A1D();
                } else if ("compare_frame_index".equals(A0s)) {
                    c51580MqY.A01 = c16l.A1D();
                } else if (AbstractC111324zv.A00(2522).equals(A0s)) {
                    c51580MqY.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("compare_image_path".equals(A0s)) {
                    c51580MqY.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("ssim_score".equals(A0s)) {
                    c51580MqY.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c51580MqY;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
