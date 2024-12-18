package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A0E {
    public static C197448oF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C197448oF c197448oF = new C197448oF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("max_width_scale".equals(A0s)) {
                    c197448oF.A01 = (float) c16l.A0U();
                } else if ("max_height_scale".equals(A0s)) {
                    c197448oF.A00 = (float) c16l.A0U();
                } else if ("cap_width".equals(A0s)) {
                    c197448oF.A02 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c197448oF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
