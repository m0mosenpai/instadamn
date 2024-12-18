package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.F3x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34121F3x {
    public static E6F parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            E6F e6f = new E6F();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("prompt".equals(A0s)) {
                    e6f.A02 = AbstractC167017dG.A0m(c16l);
                } else if (TraceFieldType.ContentType.equals(A0s)) {
                    e6f.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4926).equals(A0s)) {
                    e6f.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return e6f;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
