package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F60 {
    public static C30351cq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30351cq c30351cq = new C30351cq();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clip".equals(A0s)) {
                    C1575375n parseFromJson = IQG.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c30351cq.A00 = parseFromJson;
                } else if (AbstractC111324zv.A00(4363).equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c30351cq.A01 = A0m;
                } else if ("social_context_share_type".equals(A0s)) {
                    c30351cq.A02 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30351cq, A0s);
                }
                c16l.A0z();
            }
            return c30351cq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
