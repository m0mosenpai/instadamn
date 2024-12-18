package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.A0m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22716A0m {
    public static C9CJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CJ c9cj = new C9CJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c9cj.A00 = A0m;
                } else if ("url".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c9cj.A01 = A0m2;
                } else if ("url_text".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c9cj.A02 = A0m3;
                }
                c16l.A0z();
            }
            return c9cj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
