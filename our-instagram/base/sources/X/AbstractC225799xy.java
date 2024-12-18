package X;

import java.io.IOException;

/* renamed from: X.9xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225799xy {
    public static Al5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Al5 al5 = new Al5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31190DnZ.A00().equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    al5.A06 = A0m;
                } else if ("attribution_info".equals(A0s)) {
                    al5.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("container_width".equals(A0s)) {
                    al5.A01 = c16l.A1D();
                } else if ("container_height".equals(A0s)) {
                    al5.A00 = c16l.A1D();
                } else if ("video_duration".equals(A0s)) {
                    al5.A03 = c16l.A0y();
                } else if (AbstractC111324zv.A00(2312).equals(A0s)) {
                    al5.A02 = c16l.A1D();
                } else if (AbstractC111324zv.A00(3994).equals(A0s)) {
                    al5.A04 = AbstractC225819y0.A00(c16l.A1Q());
                }
                c16l.A0z();
            }
            return al5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
