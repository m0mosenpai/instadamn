package X;

import java.io.IOException;

/* renamed from: X.Hyd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40557Hyd {
    public static IGM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IGM igm = new IGM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    igm.A01 = A0m;
                } else if ("call_to_action".equals(A0s)) {
                    igm.A00 = AbstractC40556Hyc.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    igm.A02 = A0m2;
                }
                c16l.A0z();
            }
            return igm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
