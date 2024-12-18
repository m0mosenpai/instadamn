package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.I7r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40841I7r {
    public static QJ0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            QJ0 qj0 = new QJ0(11);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    qj0.A01 = A0m;
                } else if ("channel_type".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    qj0.A02 = A0m2;
                } else if (TraceFieldType.ContentType.equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    qj0.A03 = A0m3;
                } else if ("pinned_content_token".equals(A0s)) {
                    qj0.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("pinned_content".equals(A0s)) {
                    qj0.A00 = I83.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return qj0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
