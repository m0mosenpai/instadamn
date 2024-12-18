package X;

import java.io.IOException;

/* renamed from: X.Kpo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46969Kpo {
    public static C32711gv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32711gv c32711gv = new C32711gv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thead_key".equals(A0s)) {
                    c32711gv.A01 = AbstractC83623o5.parseFromJson(c16l);
                } else if ("message_id".equals(A0s)) {
                    c32711gv.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("selected_option_index".equals(A0s)) {
                    c32711gv.A00 = c16l.A1D();
                } else if ("client_context".equals(A0s)) {
                    c32711gv.A02 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c32711gv, A0s);
                }
                c16l.A0z();
            }
            return c32711gv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
