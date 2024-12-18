package X;

import java.io.IOException;

/* renamed from: X.NtZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53962NtZ {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.OD4, java.lang.Object] */
    public static OD4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image_url".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("dark_variant_image_url".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("should_round_image".equals(A0s)) {
                    obj.A04 = c16l.A0d();
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("body".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
