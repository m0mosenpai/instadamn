package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I8C {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IH2, java.lang.Object] */
    public static IH2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("section_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A01 = A0m;
                } else if ("default_text".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A02 = A0m2;
                } else if ("destination".equals(A0s)) {
                    obj.A00 = I8A.A00(AbstractC167017dG.A0m(c16l));
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
