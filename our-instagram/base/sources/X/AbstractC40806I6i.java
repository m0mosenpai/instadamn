package X;

import java.io.IOException;

/* renamed from: X.I6i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40806I6i {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IJ9] */
    public static IJ9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("carousel_title".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("carousel_subtitle".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("ar_effect_metadata".equals(A0s)) {
                    obj.A00 = I3F.parseFromJson(c16l);
                } else if ("placeholder_image".equals(A0s)) {
                    obj.A01 = AbstractC111144zV.parseFromJson(c16l);
                } else if ("indicator_text".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
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
