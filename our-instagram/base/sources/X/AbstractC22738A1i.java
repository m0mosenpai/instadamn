package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.A1i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22738A1i {
    public static Al3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Al3 al3 = new Al3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    al3.A03 = A0m;
                } else if ("price".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    al3.A02 = A0m2;
                } else if ("coverImagePath".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    al3.A00 = A0m3;
                } else if ("variants".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    al3.A04 = A0m4;
                } else if ("currency".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    al3.A01 = A0m5;
                }
                c16l.A0z();
            }
            return al3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
