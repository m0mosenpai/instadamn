package X;

import java.io.IOException;

/* renamed from: X.F5k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34160F5k {
    public static C35911mB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C35911mB c35911mB = new C35911mB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c35911mB.A01 = A1P;
                } else if ("mark_seen_thread_data".equals(A0q)) {
                    C34583FLs parseFromJson = F23.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c35911mB.A00 = parseFromJson;
                } else {
                    AbstractC43669JTd.A01(c16l, c35911mB, A0q);
                }
                c16l.A0z();
            }
            return c35911mB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
