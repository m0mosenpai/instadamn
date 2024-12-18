package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6G {
    public static C30221cd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30221cd c30221cd = new C30221cd();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(880).equals(A0s)) {
                    C9CL parseFromJson = FUV.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c30221cd.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c30221cd, A0s);
                }
                c16l.A0z();
            }
            return c30221cd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
