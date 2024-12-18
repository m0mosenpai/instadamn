package X;

import java.io.IOException;

/* renamed from: X.I1d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40671I1d {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IN5, java.lang.Object] */
    public static IN5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("cta_title".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("image_url".equals(A0s)) {
                    obj.A02 = AbstractC222616c.A00(c16l);
                } else if ("image_width".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("image_height".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("sticker_type".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
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
