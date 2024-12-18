package X;

import java.io.IOException;

/* renamed from: X.IAh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40909IAh {
    public static HAH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HAH hah = new HAH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item".equals(A0s)) {
                    hah.A00 = AbstractC111024zE.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, hah, A0s);
                }
                c16l.A0z();
            }
            return hah;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
