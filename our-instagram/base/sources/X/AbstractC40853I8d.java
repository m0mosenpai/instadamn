package X;

import java.io.IOException;

/* renamed from: X.I8d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40853I8d {
    public static C38688GzT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38688GzT c38688GzT = new C38688GzT(22);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("route_behavior_meta".equals(A0s)) {
                    c38688GzT.A01 = AbstractC40867I8r.parseFromJson(c16l);
                } else if ("toast_behavior_meta".equals(A0s)) {
                    c38688GzT.A03 = I91.parseFromJson(c16l);
                } else if ("select_behavior_meta".equals(A0s)) {
                    c38688GzT.A02 = AbstractC40868I8s.parseFromJson(c16l);
                } else if ("multi_select_behavior_meta".equals(A0s)) {
                    c38688GzT.A00 = AbstractC40862I8m.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c38688GzT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
