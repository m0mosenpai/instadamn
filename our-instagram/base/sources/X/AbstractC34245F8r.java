package X;

import java.io.IOException;

/* renamed from: X.F8r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34245F8r {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Et0, X.Eeo, java.lang.Object] */
    public static C32957Eeo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("button".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    F7U.A00(c16l, obj, A0s);
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
