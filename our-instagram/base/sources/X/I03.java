package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I03 {
    public static C5FO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC37300Gc1.A1F(AbstractC166997dE.A0s(c16l))) {
                    c38321qM = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            return new C5FO(c38321qM);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
