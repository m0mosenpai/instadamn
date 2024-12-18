package X;

import java.io.IOException;

/* renamed from: X.Kov, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46914Kov {
    public static C47583Kzt parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C47583Kzt c47583Kzt = new C47583Kzt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("message_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c47583Kzt.A01 = A1P;
                } else if ("metadata".equals(A0s)) {
                    c47583Kzt.A00 = AbstractC46862Knv.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c47583Kzt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
