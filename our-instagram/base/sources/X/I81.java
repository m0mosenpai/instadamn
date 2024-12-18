package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I81 {
    public static C45126Jxv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C45126Jxv c45126Jxv = new C45126Jxv(14);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("channel_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c45126Jxv.A01 = A0m;
                } else if (TraceFieldType.ContentType.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c45126Jxv.A02 = A0m2;
                } else if ("pinned_content_token".equals(A0s)) {
                    c45126Jxv.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("pinned_content".equals(A0s)) {
                    c45126Jxv.A00 = I83.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c45126Jxv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
