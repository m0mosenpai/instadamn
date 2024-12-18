package X;

import java.io.IOException;

/* renamed from: X.Hz8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40588Hz8 {
    public static C35371lJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35371lJ c35371lJ = new C35371lJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("presence_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35371lJ.A00 = A0m;
                } else if ("reply_text".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35371lJ.A01 = A0m2;
                } else {
                    AbstractC47856LCb.A01(c16l, c35371lJ, A0s);
                }
                c16l.A0z();
            }
            return c35371lJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
