package X;

import java.io.IOException;

/* renamed from: X.I6q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40814I6q {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IJA, java.lang.Object] */
    public static IJA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("age_minimum".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("primary_button_text".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(63).equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
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
