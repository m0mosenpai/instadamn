package X;

import java.io.IOException;

/* renamed from: X.DtC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31527DtC {
    public static C31526DtB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31526DtB c31526DtB = new C31526DtB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("suggested_users".equals(A0q)) {
                    c31526DtB.A02 = I0Z.parseFromJson(c16l);
                } else if ("new_suggested_users".equals(A0q)) {
                    c31526DtB.A01 = I0Z.parseFromJson(c16l);
                } else if ("max_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c31526DtB.A03 = A1P;
                } else if ("more_available".equals(A0q)) {
                    c31526DtB.A07 = c16l.A0d();
                } else if ("friend_center_holdout".equals(A0q)) {
                    c31526DtB.A05 = c16l.A0d();
                } else if ("has_chaining".equals(A0q)) {
                    c31526DtB.A06 = c16l.A0d();
                } else if ("auto_expand_chaining".equals(A0q)) {
                    c31526DtB.A04 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c31526DtB, A0q);
                }
                c16l.A0z();
            }
            return c31526DtB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
