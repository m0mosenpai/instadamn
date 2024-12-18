package X;

import java.io.IOException;

/* renamed from: X.GmM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37925GmM {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IF0, java.lang.Object] */
    public static IF0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("layout".equals(A0q)) {
                    obj.A01 = C58590PyH.A00(c16l);
                } else if ("bloks_data".equals(A0q)) {
                    obj.A00 = AbstractC40568Hyo.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
