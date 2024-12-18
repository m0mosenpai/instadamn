package X;

import java.io.IOException;

/* renamed from: X.Kpr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46972Kpr {
    public static C30261ch parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30261ch c30261ch = new C30261ch();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("story_share".equals(A0s)) {
                    C7QP parseFromJson = LCC.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c30261ch.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c30261ch, A0s);
                }
                c16l.A0z();
            }
            return c30261ch;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
