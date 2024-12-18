package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F64 {
    public static C29581bZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29581bZ c29581bZ = new C29581bZ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("destination_share".equals(A0s)) {
                    c29581bZ.A00 = F44.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c29581bZ.A01 = FUT.parseFromJson(c16l);
                } else if ("destination_id".equals(A0s)) {
                    c29581bZ.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("tag_id".equals(A0s)) {
                    c29581bZ.A03 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29581bZ, A0s);
                }
                c16l.A0z();
            }
            return c29581bZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
