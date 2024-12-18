package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FAZ {
    public static FLC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FLC flc = new FLC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2199).equals(A0s)) {
                    flc.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(134).equals(A0s)) {
                    flc.A02 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(217).equals(A0s)) {
                    flc.A00 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return flc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
