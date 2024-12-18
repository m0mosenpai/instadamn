package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.I7x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40847I7x {
    public static C45123Jxs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C45123Jxs c45123Jxs = new C45123Jxs();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("channel_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c45123Jxs.A02 = A0m;
                } else if ("channel_type".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c45123Jxs.A03 = A0m2;
                } else if (TraceFieldType.ContentType.equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c45123Jxs.A04 = A0m3;
                } else if ("pinned_content_token".equals(A0s)) {
                    c45123Jxs.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("pinned_content".equals(A0s)) {
                    c45123Jxs.A01 = I83.parseFromJson(c16l);
                } else if ("module_metadata".equals(A0s)) {
                    C45116Jxl parseFromJson = AbstractC40848I7y.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c45123Jxs.A00 = parseFromJson;
                }
                c16l.A0z();
            }
            return c45123Jxs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
