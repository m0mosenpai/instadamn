package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4P {
    public static C50679MYx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C50679MYx c50679MYx = new C50679MYx(40);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(5297).equals(A0s)) {
                    c50679MYx.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(5296).equals(A0s)) {
                    c50679MYx.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c50679MYx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
