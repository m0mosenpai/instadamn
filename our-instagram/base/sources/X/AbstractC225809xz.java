package X;

import java.io.IOException;

/* renamed from: X.9xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225809xz {
    public static Al4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Al4 al4 = new Al4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31190DnZ.A00().equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    al4.A05 = A0m;
                } else if ("attribution_info".equals(A0s)) {
                    al4.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("container_width".equals(A0s)) {
                    al4.A01 = c16l.A1D();
                } else if ("container_height".equals(A0s)) {
                    al4.A00 = c16l.A1D();
                } else if ("video_duration".equals(A0s)) {
                    al4.A03 = c16l.A0y();
                } else if (AbstractC111324zv.A00(2312).equals(A0s)) {
                    al4.A02 = c16l.A1D();
                }
                c16l.A0z();
            }
            return al4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
