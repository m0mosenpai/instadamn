package X;

import java.io.IOException;

/* renamed from: X.KnY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46839KnY {
    public static C45127Jxw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C31200Dnj c31200Dnj = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("offline_threading_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("toplevel_payload".equals(A0s)) {
                    c31200Dnj = AbstractC46838KnX.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C45127Jxw(str, c31200Dnj, 41);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
