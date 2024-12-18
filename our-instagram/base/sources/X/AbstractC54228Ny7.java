package X;

import java.io.IOException;

/* renamed from: X.Ny7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54228Ny7 {
    public static C54785OJb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54785OJb c54785OJb = new C54785OJb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c54785OJb.A04 = A0m;
                } else if ("action".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c54785OJb.A01 = A0m2;
                } else if ("container_module".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c54785OJb.A02 = A0m3;
                } else if ("delivery_class".equals(A0s)) {
                    c54785OJb.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_position".equals(A0s)) {
                    c54785OJb.A00 = c16l.A1D();
                } else if ("tray_session_id".equals(A0s)) {
                    c54785OJb.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("viewer_session_id".equals(A0s)) {
                    c54785OJb.A06 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c54785OJb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
