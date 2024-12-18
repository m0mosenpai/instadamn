package X;

import java.io.IOException;

/* renamed from: X.KpR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46946KpR {
    public static C33811ih parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33811ih c33811ih = new C33811ih();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_reply".equals(A0s)) {
                    C47709L4q parseFromJson = AbstractC46770KmR.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33811ih.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c33811ih, A0s);
                }
                c16l.A0z();
            }
            return c33811ih;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
