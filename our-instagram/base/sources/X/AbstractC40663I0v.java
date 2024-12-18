package X;

import java.io.IOException;

/* renamed from: X.I0v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40663I0v {
    public static ICD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ICD icd = new ICD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("preview_payload".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("image".equals(A0q)) {
                        icd.A00 = AbstractC40662I0u.parseFromJson(c16l);
                    }
                    c16l.A0z();
                }
            }
            return icd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
