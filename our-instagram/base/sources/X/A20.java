package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A20 {
    public static C24024AlG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C24024AlG c24024AlG = new C24024AlG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2739).equals(A0s)) {
                    c24024AlG.A03 = A21.A00(c16l.A1Q());
                } else if ("music_sticker_model".equals(A0s)) {
                    c24024AlG.EZN(C4A1.parseFromJson(c16l));
                } else if ("color".equals(A0s)) {
                    c24024AlG.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c24024AlG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
