package X;

import java.io.IOException;

/* renamed from: X.FAs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34298FAs {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Ej3, java.lang.Object, X.FPs] */
    public static C33099Ej3 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                } else if ("preview_no".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("has_more_suggestions".equals(A0s)) {
                    obj.A01 = c16l.A0d();
                } else {
                    AbstractC34839FWw.A00(c16l, obj, A0s);
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
