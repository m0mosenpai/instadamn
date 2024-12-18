package X;

import java.io.IOException;

/* renamed from: X.Kr6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47049Kr6 {
    public static C45555KEu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C45555KEu c45555KEu = new C45555KEu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("instagram_direct_effects".equals(AbstractC166997dE.A0s(c16l))) {
                    c45555KEu.A00 = AbstractC47048Kr5.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c45555KEu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
