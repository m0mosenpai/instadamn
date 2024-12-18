package X;

import java.io.IOException;

/* renamed from: X.9yY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226159yY {
    public static C24016Aku parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C24016Aku c24016Aku = new C24016Aku();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("medium".equals(A0s)) {
                    c24016Aku.A00 = C8IR.parseFromJson(c16l);
                } else if ("caption".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c24016Aku.A01 = A1P;
                }
                c16l.A0z();
            }
            return c24016Aku;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
