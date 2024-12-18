package X;

import java.io.IOException;

/* renamed from: X.HkB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39739HkB {
    public static H2E parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H2F h2f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C106344qo c106344qo = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("extra_data".equals(A0s)) {
                    h2f = AbstractC39738HkA.parseFromJson(c16l);
                } else if ("primary_button".equals(A0s)) {
                    c106344qo = AbstractC106334qn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H2E(c106344qo, h2f);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
