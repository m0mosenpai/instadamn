package X;

import java.io.IOException;

/* renamed from: X.HvR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40379HvR {
    public static H6a parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H6Z h6z = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ig_media_content".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("product_image_content".equals(A0s)) {
                    h6z = AbstractC40378HvQ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H6a(h6z, c38321qM);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
