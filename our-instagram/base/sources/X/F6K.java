package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6K {
    public static C30801dj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30801dj c30801dj = new C30801dj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2914).equals(A0s)) {
                    c30801dj.A00 = F4A.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c30801dj.A01 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30801dj, A0s);
                }
                c16l.A0z();
            }
            return c30801dj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
